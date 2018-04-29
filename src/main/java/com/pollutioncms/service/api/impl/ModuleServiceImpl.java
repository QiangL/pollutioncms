package com.pollutioncms.service.api.impl;

import com.pollutioncms.common.enums.ExceptionEnum;
import com.pollutioncms.common.exception.DaoException;
import com.pollutioncms.common.exception.ParamErrorException;
import com.pollutioncms.module.domain.Module;
import com.pollutioncms.module.domain.ModuleOperate;
import com.pollutioncms.module.mapper.ModuleMapper;
import com.pollutioncms.module.mapper.ModuleOperateMapper;
import com.pollutioncms.service.api.ModuleService;
import com.pollutioncms.service.dto.ModuleDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiag
 * @discription ModuleServiceImpl
 * @date 2018-04-28
 **/
@Service
@Transactional
public class ModuleServiceImpl implements ModuleService {

    private static final Logger logger= LoggerFactory.getLogger(ModuleServiceImpl.class);
    @Autowired
    private ModuleMapper moduleMapper;

    @Autowired
    private ModuleOperateMapper moduleOperateMapper;


    @Override
    public List<ModuleDTO> listModule() {
        return moduleToDTOList(moduleMapper.selectAll());
    }

    @Override
    public List<ModuleDTO> listModuleOps(String parentUuid) {
        return moduleopsToDTOList(moduleOperateMapper.selectByExample(Example.builder(ModuleOperate.class)
                                    .where(Sqls.custom().andEqualTo("parentUuid",parentUuid)).build()));
    }

    @Override
    public int getModuleOpsCount(String parentUuid) {
        return moduleOperateMapper.selectCountByExample(Example.builder(ModuleOperate.class)
                                    .where(Sqls.custom().andEqualTo("parentUuid",parentUuid)).build());
    }

    @Override
    public boolean saveModule(ModuleDTO moduleDTO) {
        moduleDTO.setId(null);
        if(moduleOperateMapper.insert(moduleDTO.toModuleOpsDO()) != 1){
            logger.error("dao operate effect num error,dto:{}",moduleDTO);
            throw new DaoException(ExceptionEnum.DATA_EFFECT_NUM_ERROR);
        }
        return true;
    }

    @Override
    public boolean updateModule(ModuleDTO moduleDTO) {
        if(StringUtils.isEmpty(moduleDTO.getId())|| moduleDTO.getId().length() != 36){
            // 36 ==uuid的长度
            throw new ParamErrorException("uuid incorrect");
        }
        if(StringUtils.isEmpty(moduleDTO.getPid())|| moduleDTO.getPid().length() != 36){
            // 36 ==uuid的长度
            throw new ParamErrorException("parent uuid incorrect");
        }
        if(moduleOperateMapper.updateByPrimaryKeySelective(moduleDTO.toModuleOpsDO()) != 1){
            logger.error("dao operate effect num error,dto:{}",moduleDTO);
            throw new DaoException(ExceptionEnum.DATA_EFFECT_NUM_ERROR);
        }
        return true;
    }

    @Override
    public boolean deleteModule(ModuleDTO moduleDTO) {
        if(StringUtils.isEmpty(moduleDTO.getId())|| moduleDTO.getId().length() != 36){
            // 36 ==uuid的长度
            throw new ParamErrorException("uuid incorrect");
        }
        if(StringUtils.isEmpty(moduleDTO.getPid())|| moduleDTO.getPid().length() != 36){
            // 36 ==uuid的长度
            throw new ParamErrorException("parent uuid incorrect");
        }
        if(moduleOperateMapper.delete(moduleDTO.toModuleOpsDO()) != 1){
            logger.error("dao operate effect num error,dto:{}",moduleDTO);
            throw new DaoException(ExceptionEnum.DATA_EFFECT_NUM_ERROR);
        }
        return true;
    }

    private List<ModuleDTO> moduleToDTOList(List<Module> list) {
        List<ModuleDTO> userDTOS = new ArrayList<>();
        try {
            for (Module u : list) {
                userDTOS.add(ModuleDTO.toDTO(u));
            }
        } catch (BeansException e) {
            logger.error("copy user properties error");
        }
        return userDTOS;
    }
    private List<ModuleDTO> moduleopsToDTOList(List<ModuleOperate> list) {
        List<ModuleDTO> userDTOS = new ArrayList<>();
        try {
            for (ModuleOperate u : list) {
                userDTOS.add(ModuleDTO.toDTO(u));
            }
        } catch (BeansException e) {
            logger.error("copy user properties error");
        }
        return userDTOS;
    }
}

package com.pollutioncms.service.api.impl;

import com.pollutioncms.common.enums.ExceptionEnum;
import com.pollutioncms.common.exception.DaoException;
import com.pollutioncms.common.exception.ParamErrorException;
import com.pollutioncms.module.domain.Module;
import com.pollutioncms.module.domain.RoleAuth;
import com.pollutioncms.module.mapper.ModuleMapper;
import com.pollutioncms.module.mapper.RoleAuthMapper;
import com.pollutioncms.module.mapper.RoleUserMapper;
import com.pollutioncms.service.api.ModuleService;
import com.pollutioncms.service.dto.ModuleDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author liqiag
 * @discription ModuleServiceImpl
 * @date 2018-04-28
 **/
@Service
@Transactional
public class ModuleServiceImpl implements ModuleService {

    private static final Logger logger = LoggerFactory.getLogger(ModuleServiceImpl.class);
    @Autowired
    private ModuleMapper moduleMapper;

    @Autowired
    private RoleAuthMapper roleAuthMapper;

    @Autowired
    private RoleUserMapper roleUserMapper;


    @Override
    public List<ModuleDTO> listModule() {
        return moduleToDTOList(moduleMapper.selectByExample(Example.builder(Module.class)
                .where(Sqls.custom().andEqualTo("leaf", false))
                .build()));
    }
    public List<ModuleDTO> listModules(String userName) {
        Set<String> roleNames = roleUserMapper.queryRole(userName);
        List<Module> moduleList = moduleMapper.listModuleAuths(roleNames);
        for (int i = 0; i < moduleList.size(); i++) {
            if (moduleList.get(i).getLeaf()) {
                moduleList.remove(i);
                i--;
            }
        }
        return moduleToDTOList(moduleList);
    }

    @Override
    public List<ModuleDTO> listAllAuths() {
        return moduleToDTOList(moduleMapper.selectAll());
    }

    @Override
    public List<ModuleDTO> listAuths(Integer parentId) {
        return moduleToDTOList(moduleMapper.selectByExample(Example.builder(Module.class)
                .where(Sqls.custom()
                        .andEqualTo("parentId", parentId)
                        .andEqualTo("leaf", true)).build()));
    }

    @Override
    public List<ModuleDTO> listModuleAuths(String roleName) {
        Set<String> roleNames = new HashSet<>();
        roleNames.add(roleName);
        return moduleToDTOList(moduleMapper.listModuleAuths(roleNames));
    }

    @Override
    public int getModuleOpsCount(Integer parentId) {
        return moduleMapper.selectCountByExample(Example.builder(Module.class)
                .where(Sqls.custom()
                        .andEqualTo("parentId", parentId)
                        .andEqualTo("leaf", true)).build());
    }

    @Override
    public boolean saveModule(ModuleDTO moduleDTO) {
        moduleDTO.setId(null);
        if (moduleMapper.insert(moduleDTO.toModuleDO()) != 1) {
            logger.error("dao operate effect num error,dto:{}", moduleDTO);
            throw new DaoException(ExceptionEnum.DATA_EFFECT_NUM_ERROR);
        }
        return true;
    }

    @Override
    public boolean updateModule(ModuleDTO moduleDTO) {
        if (moduleDTO.getId() == null) {
            throw new ParamErrorException("uuid incorrect");
        }
        if (moduleDTO.getPid() == null) {
            throw new ParamErrorException("parent uuid incorrect");
        }
        if (moduleMapper.updateByPrimaryKeySelective(moduleDTO.toModuleDO()) != 1) {
            logger.error("dao operate effect num error,dto:{}", moduleDTO);
            throw new DaoException(ExceptionEnum.DATA_EFFECT_NUM_ERROR);
        }
        return true;
    }

    @Override
    public boolean deleteModule(ModuleDTO moduleDTO) {
        if (moduleDTO.getId() == null) {
            throw new ParamErrorException("uuid incorrect");
        }
        if (moduleDTO.getPid() == null) {
            throw new ParamErrorException("parent uuid incorrect");
        }
        if (moduleMapper.delete(moduleDTO.toModuleDO()) != 1) {
            logger.error("dao operate effect num error,dto:{}", moduleDTO);
            throw new DaoException(ExceptionEnum.DATA_EFFECT_NUM_ERROR);
        }
        return true;
    }

    @Override
    public boolean updateRoleAuths(String roleName, Set<Integer> ids) {
        roleAuthMapper.updateAuths(roleName, ids);
        return true;
    }

    @Override
    public List<Integer> checkAuthIds(Set<Integer> ids) {
        return moduleMapper.checkAuthIds(ids);
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
}

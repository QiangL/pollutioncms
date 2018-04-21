package com.pollutioncms.service.api.impl;

import com.github.pagehelper.PageHelper;
import com.pollutioncms.common.enums.ExceptionEnum;
import com.pollutioncms.common.exception.DaoException;
import com.pollutioncms.module.domain.Role;
import com.pollutioncms.module.mapper.RoleMapper;
import com.pollutioncms.service.api.RoleService;
import com.pollutioncms.service.dto.RoleDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiag
 * @discription RoleServiceImpl
 * @date 2018-04-19
 **/
@Service
@Transactional

public class RoleServiceImpl implements RoleService {
    private static final Logger logger = LoggerFactory.getLogger(RoleServiceImpl.class);
    @Autowired
    private RoleMapper rolemapper;

    @Override
    public List<RoleDTO> listRoles(Integer pageNum, Integer count) {
        PageHelper.startPage(pageNum, count);
        return toDTOList(rolemapper.selectAll());
    }

    @Override
    public boolean saveRole(RoleDTO roleDTO) {
        if (rolemapper.insert(roleDTO.toDO()) != 1) {
            logger.error("dao operate effect num error,dto:{}",roleDTO);
            throw new DaoException(ExceptionEnum.DATA_EFFECT_NUM_ERROR);
        }
        return true;

    }

    @Override
    public boolean deleteRole(RoleDTO roleDTO) {
        if (rolemapper.delete(roleDTO.toDO()) != 1){
            logger.error("dao operate effect num error,dto:{}",roleDTO);
            throw new DaoException(ExceptionEnum.DATA_EFFECT_NUM_ERROR);
        }
        return true;
    }

    @Override
    public boolean updateRole(RoleDTO roleDTO) {
        if (rolemapper.updateByPrimaryKey(roleDTO.toDO()) != 1){
            logger.error("dao operate effect num error,dto:{}",roleDTO);
            throw new DaoException(ExceptionEnum.DATA_EFFECT_NUM_ERROR);
        }
        return true;
    }

    private List<RoleDTO> toDTOList(List<Role> list) {
        List<RoleDTO> roleDTOS = new ArrayList<>();
        try {
            for (Role r : list) {
                roleDTOS.add(RoleDTO.toRoleDTO(r));
            }
        } catch (BeansException e) {
            logger.error("copy properties error", e);
        }
        return roleDTOS;
    }
}

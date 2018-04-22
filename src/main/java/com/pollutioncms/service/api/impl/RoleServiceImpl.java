package com.pollutioncms.service.api.impl;

import com.github.pagehelper.PageHelper;
import com.pollutioncms.common.enums.ExceptionEnum;
import com.pollutioncms.common.exception.DaoException;
import com.pollutioncms.common.exception.ParamErrorException;
import com.pollutioncms.module.domain.Role;
import com.pollutioncms.module.domain.RoleUser;
import com.pollutioncms.module.mapper.RoleMapper;
import com.pollutioncms.module.mapper.RoleUserMapper;
import com.pollutioncms.module.mapper.UserMapper;
import com.pollutioncms.service.api.RoleService;
import com.pollutioncms.service.api.UserService;
import com.pollutioncms.service.dto.RoleDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

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

    @Autowired
    private RoleUserMapper roleUserMapper;

    @Override
    public List<RoleDTO> listRoles(Integer pageNum, Integer count) {
        PageHelper.startPage(pageNum, count);
        return toDTOList(rolemapper.selectAll());
    }

    @Override
    public int getCount() {
        return rolemapper.selectCount(null);
    }

    @Override
    public boolean saveRole(String parentRoleName,RoleDTO roleDTO) {
        rolemapper.saveRole(parentRoleName,roleDTO.toDO());
        return true;

    }

    @Override
    public boolean deleteRole(RoleDTO roleDTO) {
        int userCount=roleUserMapper.selectCountByExample(Example
                    .builder(RoleUser.class)
                    .where(Sqls.custom().andEqualTo("roleId",roleDTO.getId())).build());
        if(userCount !=0){
            logger.warn("want delete role has user,dto:{}", roleDTO);
            throw new ParamErrorException("can't delete role,it has users");
        }

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

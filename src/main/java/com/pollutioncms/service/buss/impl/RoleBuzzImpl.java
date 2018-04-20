package com.pollutioncms.service.buss.impl;

import com.github.pagehelper.PageHelper;
import com.pollutioncms.module.domain.Role;
import com.pollutioncms.module.mapper.RoleMapper;
import com.pollutioncms.service.buss.RoleBuzz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author liqiag
 * @discription RoleBuzzImpl
 * @date 2018-04-20
 **/
@Component
@Transactional
public class RoleBuzzImpl implements RoleBuzz {
    @Autowired
    private RoleMapper rolemapper;


    @Override
    public List<Role> listRoles(Integer pageNum, Integer count) {
        PageHelper.startPage(pageNum, count);
        return rolemapper.selectAll();
    }

    @Override
    public boolean saveRole(Role role) {
        return rolemapper.insert(role) == 1;
    }

    @Override
    public boolean deleteRole(Role role) {
        return rolemapper.delete(role) == 1;
    }

    @Override
    public boolean updateRole(Role role) {
        return rolemapper.updateByPrimaryKey(role)==1;
    }
}

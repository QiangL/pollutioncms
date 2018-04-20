package com.pollutioncms.service.buss.impl;

import com.github.pagehelper.PageHelper;
import com.pollutioncms.module.domain.User;
import com.pollutioncms.module.mapper.UserMapper;
import com.pollutioncms.service.buss.UserBuzz;
import com.pollutioncms.service.dto.AuthUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;

/**
 * @author liqiag
 * @discription UserBuzzImpl
 * @date 2018-04-20
 **/
@Component
public class UserBuzzImpl implements UserBuzz {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserByName(String userName) {
        return userMapper.selectOneByExample(Example.builder(User.class)
                .where(Sqls.custom().andEqualTo("userName", userName)).build());
    }

    @Override
    public List<User> listUserByRole(String roleName, Integer pageNum, Integer count) {
        PageHelper.startPage(pageNum, count);
        return userMapper.listUserByRole(roleName);
    }

    @Override
    public List<User> listUser(Integer pageNum, Integer count) {
        PageHelper.startPage(pageNum, count);
        return userMapper.selectAll();
    }

    @Override
    public AuthUserDTO getAuthUser(String userName) {
        AuthUserDTO authUserDTO = new AuthUserDTO();
        if (getUserByName(userName) == null) {
            return null;
        }
        authUserDTO.setUserName(userName);
        authUserDTO.setRoles(userMapper.listRoles(userName));
        authUserDTO.setPermissions(userMapper.listPermissions(userName));
        return authUserDTO;
    }

    @Override
    public boolean saveUser(User user) {
        return userMapper.insert(user) == 1;
    }

    @Override
    public boolean deleteUser(User user) {
        return userMapper.delete(user) == 1;
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateByPrimaryKey(user) == 1;
    }
}

package com.pollutioncms.service.impl;

import com.pollutioncms.module.domain.User;
import com.pollutioncms.module.mapper.UserMapper;
import com.pollutioncms.service.UserService;
import com.pollutioncms.service.dto.AuthUserDTO;
import com.pollutioncms.service.dto.LoginUserDTO;
import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * @author liqiag
 * @discription UserServiceImpl
 * @date 2018-04-13
 **/
@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserMapper userMapper;

    @Override
    public LoginUserDTO findLoginUser(String userName) {
        User user = userMapper.selectOneByExample(Example.builder(User.class)
                .where(Sqls.custom().andEqualTo("userName", userName))
                .build());
        if (user == null) {
            logger.warn("login user isn't exit,userName:{}", userName);
            return null;
        }
        LoginUserDTO loginUserDTO = new LoginUserDTO();
        try {
            PropertyUtils.copyProperties(loginUserDTO, user);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            logger.error("copy user properties error", e);
            return null;
        }
        return loginUserDTO;
    }

    @Override
    public List<User> listUserByRole(Integer roleId) {
        return userMapper.listUserByRole(roleId);
    }

    @Override
    public List<User> listUser() {
        return userMapper.selectAll();
    }

    @Override
    public AuthUserDTO findAuthUser(String userName) {
        AuthUserDTO authUserDTO = new AuthUserDTO();
        authUserDTO.setUserName(userName);
        authUserDTO.setRoles(userMapper.listRoles(userName));
        authUserDTO.setPermissions(userMapper.listPermissions(userName));
        return authUserDTO;
    }
}

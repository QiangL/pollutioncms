package com.pollutioncms.service;

import com.pollutioncms.module.domain.User;
import com.pollutioncms.module.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    public User getUser(String username) {
        Example e = new Example(User.class);
        Example.Criteria c = e.createCriteria();
        c.andEqualTo("userName", "liqiang");
        return userMapper.selectOneByExample(e);
    }

    public User getUser(){
        User u = new User();
        u.setUserName("liqiang");
        return userMapper.selectOne(u);
    }

}

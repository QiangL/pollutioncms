package com.pollutioncms.web.controller;

import com.pollutioncms.module.domain.User;
import com.pollutioncms.module.mapper.UserMapper;
import com.pollutioncms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

@RestController
public class TestController {

    @Autowired
    private UserService userMapper;

    @RequestMapping(value="/test.mvc",method = RequestMethod.GET)
    @ResponseBody
    public User test(){
        return userMapper.getUser("liqiang");
    }

    @RequestMapping(value="/test1.mvc",method = RequestMethod.GET)
    @ResponseBody
    public User test1(){
        return userMapper.getUser();
    }
    @RequestMapping(value="/test2.mvc",method = RequestMethod.GET)
    public String test2(){
        return "test";
    }
}

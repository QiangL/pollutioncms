package com.pollutioncms.web.controller;

import com.pollutioncms.module.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@Controller
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value="/test.mvc",method = RequestMethod.GET)
    @ResponseBody
    public Set<String> test(){
        return userMapper.listPermissions(1);
    }
}

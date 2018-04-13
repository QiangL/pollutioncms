package com.pollutioncms.web.controller;

import com.pollutioncms.service.UserService;
import com.pollutioncms.service.dto.LoginUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserService userMapper;

    @RequestMapping(value="/test.mvc",method = RequestMethod.GET)
    @ResponseBody
    public LoginUserDTO test(){
        return userMapper.findLoginUser("liqiang");
    }

}

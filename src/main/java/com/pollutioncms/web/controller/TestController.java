package com.pollutioncms.web.controller;

import com.pollutioncms.service.api.UserService;
import com.pollutioncms.service.dto.LoginUserDTO;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private static final Logger logger= LoggerFactory.getLogger(TestController.class);

    @Autowired
    private UserService userService;

    @RequiresPermissions("test")
    @RequestMapping(value="/test.mvc",method = RequestMethod.GET)
    @ResponseBody
    public LoginUserDTO test(){
        //userService.listUser();
        return userService.getLoginUser("liqiang");
    }

}

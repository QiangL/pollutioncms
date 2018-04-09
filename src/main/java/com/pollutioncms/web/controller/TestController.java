package com.pollutioncms.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    @RequestMapping(value="/test.mvc",method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return "test";
    }
}

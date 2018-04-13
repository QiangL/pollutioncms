package com.pollutioncns.test.service;

import com.alibaba.fastjson.JSONObject;
import com.pollutioncms.service.UserService;
import com.pollutioncns.test.BaseTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liqiag
 * @discription UserServiceTest
 * @date 2018-04-13
 **/
public class UserServiceTest extends BaseTest {
    private static final Logger logger= LoggerFactory.getLogger(UserServiceTest.class);

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        logger.warn(JSONObject.toJSONString(userService.findLoginUser("liqiang")));
        logger.warn(JSONObject.toJSONString(userService.findLoginUser("li")));
    }
}

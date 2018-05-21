package com.pollutioncms.test.service;

import com.alibaba.fastjson.JSONObject;
import com.pollutioncms.service.api.UserService;
import com.pollutioncms.test.BaseTest;
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
        logger.warn(JSONObject.toJSONString(userService.getLoginUser("liqiang")));
        logger.warn(JSONObject.toJSONString(userService.getLoginUser("li")));
    }
}

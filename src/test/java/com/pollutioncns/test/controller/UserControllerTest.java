package com.pollutioncns.test.controller;

import com.pollutioncms.web.controller.TestController;
import com.pollutioncns.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liqiag
 * @discription UserControllerTest
 * @date 2018-04-15
 **/
public class UserControllerTest extends BaseTest{

    @Autowired
    private TestController testController;
    @Test
    public void test(){
        testController.test();
    }
}

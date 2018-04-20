package com.pollutioncns.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liqiag
 * @discription BaseTest
 * @date 2018-04-13
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:pollutioncms/applicationContext.xml",
                "classpath:pollutioncms/spring-mvc.xml"})
public class BaseTest {
}

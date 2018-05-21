package com.pollutioncms.test.module;

import com.alibaba.fastjson.JSONObject;
import com.pollutioncms.module.domain.User;
import com.pollutioncms.module.mapper.UserMapper;
import com.pollutioncms.test.BaseTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

/**
 * @author liqiag
 * @discription MapperTest
 * @date 2018-04-13
 **/
public class MapperTest extends BaseTest{
    private static final Logger logger= LoggerFactory.getLogger(MapperTest.class);

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        User user = new User();
        user.setUserName("li");
        Example example = Example.builder(User.class)
                .where(Sqls.custom().andEqualTo("userName", "liqiang"))
                .build();

        logger.warn(JSONObject.toJSONString(userMapper.select(user)));
        logger.warn(JSONObject.toJSONString(userMapper.selectByExample(example)));
        logger.warn(JSONObject.toJSONString(userMapper.selectOne(user)));
        logger.warn(JSONObject.toJSONString(userMapper.selectOneByExample(example)));

    }
}

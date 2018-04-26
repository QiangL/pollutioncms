package com.pollutioncns.test.module;

import com.pollutioncms.module.domain.RoleUser;
import com.pollutioncms.module.domain.User;
import com.pollutioncms.module.mapper.RoleUserMapper;
import com.pollutioncms.module.mapper.UserMapper;
import com.pollutioncns.test.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

/**
 * @author liqiag
 * @discription UserMapperTest
 * @date 2018-04-26
 **/
@Transactional
public class UserMapperTest extends BaseTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleUserMapper roleUserMapper;

    @Test
    public void test() {
        User user = new User();
        user.setUserName("mapperTest");
        user.setShowName("mapperTest");
        user.setPwd("mapperTest");
        user.setUserSex(0);
        user.setUserAddr("");
        user.setUserTel("133");
        Assert.assertEquals(1, userMapper.saveUser(user));
        RoleUser roleUser = new RoleUser();
        roleUser.setRoleId(1);
        roleUser.setUserId(userMapper.selectOneByExample(
                Example.builder(User.class)
                        .where(Sqls.custom()
                                .andEqualTo("userName", "mapperTest"))
                        .build())
                .getId());
        Assert.assertEquals(1, roleUserMapper.insert(roleUser));
        user = userMapper.selectOneByExample(
                Example.builder(User.class)
                        .where(Sqls.custom()
                                .andEqualTo("userName", "mapperTest"))
                        .build());
        userMapper.deleteUser(user);
    }

}

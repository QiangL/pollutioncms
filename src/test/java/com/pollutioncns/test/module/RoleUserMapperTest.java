package com.pollutioncns.test.module;

import com.pollutioncms.module.domain.User;
import com.pollutioncms.module.mapper.RoleUserMapper;
import com.pollutioncms.module.mapper.UserMapper;
import com.pollutioncns.test.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.internal.util.collections.Sets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

/**
 * @author liqiag
 * @discription RoleUserMapperTest
 * @date 2018-04-26
 **/
@Transactional
public class RoleUserMapperTest extends BaseTest {
    @Autowired
    private RoleUserMapper roleUserMapper;
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test(){
        User user = new User();
        user.setUserName("mapperTest");
        user.setShowName("mapperTest");
        user.setPwd("mapperTest");
        user.setUserSex(0);
        user.setUserAddr("");
        user.setUserTel("133");
        Assert.assertEquals(1, userMapper.saveUser(user));
        roleUserMapper.addRoles("mapperTest",Sets.newSet("admin","guest"));
        roleUserMapper.queryRole("mapperTest");
        roleUserMapper.motifyRoles("mapperTest", Sets.newSet("admin", "guest"));
    }
}

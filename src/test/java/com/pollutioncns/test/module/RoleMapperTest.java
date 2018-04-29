package com.pollutioncns.test.module;

import com.pollutioncms.module.domain.Role;
import com.pollutioncms.module.mapper.RoleMapper;
import com.pollutioncns.test.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.HashSet;
import java.util.Set;

/**
 * @author liqiag
 * @discription RoleMapperTest
 * @date 2018-04-27
 **/
@Transactional
public class RoleMapperTest extends BaseTest {
    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void test(){
        roleMapper.deleteByExample(Example.builder(Role.class).where(Sqls.custom().andEqualTo("roleName", "test")).build());
        Set<String> roleName = new HashSet<>();
        roleName.add("admin");
        roleName.add("test");
        Set<String> result = roleMapper.checkRoleNames(roleName);
        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.contains("test"));
    }

    @Test
    public void test2(){
        Role role = new Role();
        role.setParentId(2);
        role.setRoleCnName("1");
        role.setRoleName("1");

        roleMapper.insert(role);
        role.setRoleName("2");
        roleMapper.insert(role);

        role.setRoleName("3");
        roleMapper.insert(role);

    }
}

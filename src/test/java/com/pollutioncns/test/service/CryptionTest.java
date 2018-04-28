package com.pollutioncns.test.service;

import com.pollutioncms.module.domain.User;
import com.pollutioncms.service.utils.PasswordHelper;
import com.pollutioncns.test.BaseTest;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liqiag
 * @discription CryptionTest
 * @date 2018-04-27
 **/
public class CryptionTest extends BaseTest{

    @Autowired
    private PasswordHelper passwordHelper;
    @Autowired
    private HashedCredentialsMatcher hashedCredentialsMatcher;

    @Test
    public void test() {
        User user = new User();
        user.setPwd("liqiang");
        passwordHelper.encryption(user);
        System.out.println("-----------" + user.getPwd());
        System.out.println("-----------" + user.getSalt());
    }
}

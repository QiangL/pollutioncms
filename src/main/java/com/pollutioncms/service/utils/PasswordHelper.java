package com.pollutioncms.service.utils;

import com.pollutioncms.module.domain.User;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.HashRequest;
import org.apache.shiro.crypto.hash.HashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 加密密码和加盐的组件
 */
@Component
public class PasswordHelper {

    private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();

    @Autowired
    private HashService hashService;

    public User encryption(User user) {
        String salt = randomNumberGenerator.nextBytes().toHex();
        user.setSalt(salt);
        user.setPwd(hashService.computeHash(new HashRequest.Builder().setSource(user.getPwd()).build()).toHex());
        return user;
    }
}

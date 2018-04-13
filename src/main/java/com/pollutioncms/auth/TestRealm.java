package com.pollutioncms.auth;

import com.pollutioncms.module.domain.User;
import com.pollutioncms.module.mapper.UserMapper;
import com.pollutioncms.service.UserService;
import com.pollutioncms.service.dto.AuthUserDTO;
import com.pollutioncms.service.dto.LoginUserDTO;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

@Service
public class TestRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    /**
     * 权限认证
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String loginName=(String) principalCollection.fromRealm(getName()).iterator().next();
        //TODO 查看返回无权限时的执行流程
        AuthUserDTO user = userService.findAuthUser(loginName);
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        info.setRoles(user.getRoles());
        info.setStringPermissions(user.getPermissions());
        return info;
    }

    /**
     * 登录认证;
     */
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token=(UsernamePasswordToken) authenticationToken;
        LoginUserDTO user = userService.findLoginUser(token.getPrincipal().toString());
        if(user == null){
            throw new UnknownAccountException("未知用户名");
        }
        return new SimpleAuthenticationInfo(user.getUserName(), user.getPwd(), getName());
    }

}

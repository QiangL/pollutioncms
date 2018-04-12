package com.pollutioncms.auth;

import com.pollutioncms.module.domain.User;
import com.pollutioncms.module.mapper.UserMapper;
import com.pollutioncms.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestRealm extends AuthorizingRealm {

    @Autowired
    private UserMapper userMapper;

    /**
     * 权限认证
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取登录时输入的用户名
        String loginName=(String) principalCollection.fromRealm(getName()).iterator().next();
        //到数据库查是否有此对象
        User user=new User();
        user.setUserName(loginName);
        user = userMapper.selectOne(user);
        //权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        //用户的角色集合
        info.setRoles(userMapper.listRoles(user.getId()));
        //用户权限集合
        info.setStringPermissions(userMapper.listPermissions(user.getId()));
        return info;
    }

    /**
     * 登录认证;
     */
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authenticationToken) throws AuthenticationException {
        //UsernamePasswordToken对象用来存放提交的登录信息
        /*UsernamePasswordToken token=(UsernamePasswordToken) authenticationToken;
        //查出是否有此用户
        User user=userService.findByName(token.getUsername());
        if(user!=null){
            //若存在，将此用户存放到登录认证info中
            return new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), getName());
        }*/
        return null;
    }

}

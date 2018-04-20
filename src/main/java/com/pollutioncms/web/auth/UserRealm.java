package com.pollutioncms.web.auth;

import com.pollutioncms.common.enums.UserStatusEnum;
import com.pollutioncms.common.exception.IntraErrorException;
import com.pollutioncms.service.api.UserService;
import com.pollutioncms.service.dto.AuthUserDTO;
import com.pollutioncms.service.dto.LoginUserDTO;
import com.pollutioncms.service.dto.Response;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRealm extends AuthorizingRealm {
    private static final Logger logger= LoggerFactory.getLogger(UserRealm.class);

    @Autowired
    private UserService userService;

    /**
     * 权限认证
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String loginName=(String) principalCollection.fromRealm(getName()).iterator().next();
        //TODO 查看返回无权限时的执行流程
        Response<AuthUserDTO> user = userService.getAuthUser(loginName);
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        if (!user.isSuccess()) {
            logger.error("query user fail,msg:{}",user.getErrorCodes());
            return info;
        }
        info.setRoles(user.getDate().getRoles());
        info.setStringPermissions(user.getDate().getPermissions());
        return info;
    }

    /**
     * 登录认证;
     */
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token=(UsernamePasswordToken) authenticationToken;
        Response<LoginUserDTO> user = userService.getLoginUser((String)token.getPrincipal());
        if(!user.isSuccess()){
            logger.error("query login user fail,msg:{}", user.getErrorCodes());
            throw new IntraErrorException();
        }
        LoginUserDTO loginUserDTO = user.getDate();
        if(loginUserDTO == null){
            logger.error("login fail,no such user, username:{}",token.getPrincipal());
            throw new UnknownAccountException("未知用户名");
        }else if(loginUserDTO.getStatus() == UserStatusEnum.LOCKED.getStatus()){
            logger.error("locked account login in,username:{}",token.getPrincipal());
            throw new LockedAccountException("已锁定账户，请联系管理员");
        } else if (loginUserDTO.getStatus() == UserStatusEnum.DELETED.getStatus()) {
            logger.error("deleted account login,username:{}",token.getPrincipal());
            throw new UnknownAccountException("已删除账户");
        }
        return new SimpleAuthenticationInfo(loginUserDTO.getUserName(), loginUserDTO.getPwd(),
                ByteSource.Util.bytes(loginUserDTO.getSalt()),getName());
    }

}

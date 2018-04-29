package com.pollutioncms.web.auth;

import com.pollutioncms.common.enums.UserStatusEnum;
import com.pollutioncms.service.api.UserService;
import com.pollutioncms.service.dto.AuthUserDTO;
import com.pollutioncms.service.dto.LoginUserDTO;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 扩展shiro权限的realm.
 * 用于访问数据库取得权限
 */
@Service
public class UserRealm extends AuthorizingRealm {
    private static final Logger logger= LoggerFactory.getLogger(UserRealm.class);

    @Autowired
    private UserService userService;

    @Autowired
    private HashedCredentialsMatcher hashedCredentialsMatcher;

    public UserRealm(){
        setCredentialsMatcher(hashedCredentialsMatcher);
    }

    /**
     * 权限认证
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        // 身份集合，身份和Realm返回的集合对应
        String loginName=(String) principalCollection.fromRealm(getName()).iterator().next();
        //TODO 查看返回无权限时的执行流程
        AuthUserDTO user = userService.getAuthUser(loginName);
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
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        LoginUserDTO user = userService.getLoginUser((String) token.getPrincipal());
        if (user.getStatus() == UserStatusEnum.LOCKED) {
            logger.error("locked account login in,username:{}", token.getPrincipal());
            throw new LockedAccountException("已锁定账户，请联系管理员");
        } else if (user.getStatus() == UserStatusEnum.DELETED) {
            logger.error("deleted account login,username:{}", token.getPrincipal());
            throw new UnknownAccountException("已删除账户");
        }
        setCredentialsMatcher(hashedCredentialsMatcher);
        return new SimpleAuthenticationInfo(user.getUserName(), user.getPwd(),
                ByteSource.Util.bytes(user.getSalt()), getName());
    }

}

package com.pollutioncms.web.controller;

import com.pollutioncms.web.auth.FormAuthenticationFilter;
import com.pollutioncms.web.utils.AjaxUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author liqiag
 * @discription LoginController
 * @date 2018-04-28
 **/
@Controller
public class LoginController {
    private static final Logger logger= LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value="/login.mvc")
    public String login(HttpServletRequest request,Map<String,Object> map) throws Exception {
        AuthenticationException ae = (AuthenticationException) request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
        logger.error("login error",ae);
        String error=null;
        if(ae ==null){
            return "redirect:/";
        }
        if(ae instanceof UnknownAccountException){
            error="未知账户";
        }else if(ae instanceof IncorrectCredentialsException){
            error="密码错误";
        }else if(ae instanceof LockedAccountException){
            error="已锁定账户，无法登录";
        }else{
            error="可能未输入密码或已经登陆";
        }
        map.put("error",error);
        return "unAuth";

    }
}

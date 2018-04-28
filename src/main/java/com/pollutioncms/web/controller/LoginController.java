package com.pollutioncms.web.controller;

import com.pollutioncms.web.auth.FormAuthenticationFilter;
import com.pollutioncms.web.utils.AjaxUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author liqiag
 * @discription LoginController
 * @date 2018-04-28
 **/
@Controller
public class LoginController {

    @RequestMapping("/login")
    public void login(HttpServletRequest request, HttpServletResponse response) throws Exception {
        AuthenticationException ae = (AuthenticationException) request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
        AjaxUtils.handleUnAuthResponse(request, response, ae.getMessage());
    }
}

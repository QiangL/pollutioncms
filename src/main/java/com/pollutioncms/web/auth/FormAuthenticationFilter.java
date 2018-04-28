package com.pollutioncms.web.auth;

import org.apache.shiro.authc.AuthenticationException;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequest;

/**
 * @author liqiag
 * @discription FormAuthenticationFilter
 * @date 2018-04-28
 **/
public class FormAuthenticationFilter extends org.apache.shiro.web.filter.authc.FormAuthenticationFilter {

    @Override
    protected void setFailureAttribute(ServletRequest request, AuthenticationException ae) {
        request.setAttribute(getFailureKeyAttribute(), ae);
    }
}

package com.pollutioncms.web.auth;

import com.pollutioncms.module.domain.User;
import com.pollutioncms.module.mapper.UserMapper;
import com.pollutioncms.service.api.UserService;
import com.pollutioncms.service.dto.UserDTO;
import com.pollutioncms.web.contants.Constants;
import com.pollutioncms.web.utils.AjaxUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author liqiag
 * @discription UserSessionFilter
 * @date 2018-04-25
 **/
@Component
public class UserSessionFilter extends AccessControlFilter {
    private static final Logger logger= LoggerFactory.getLogger(UserSessionFilter.class);

    @Autowired
    private UserService userService;
    @Override
    public boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            Session session = subject.getSession();
            if (session.getAttribute(Constants.USER) == null) {
                UserDTO userDTO = userService.getUser((String)subject.getPrincipal());
                session.setAttribute(Constants.USER, userDTO);
            }
            return true;
        }
        try {
            AjaxUtils.handleUnAuthResponse((HttpServletRequest) request, (HttpServletResponse) response, "未登录");
        } catch (IOException e) {
            logger.error("ajax handle unAuth response error", e);
        }
        return false;
    }

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        return true;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        return false;
    }
}

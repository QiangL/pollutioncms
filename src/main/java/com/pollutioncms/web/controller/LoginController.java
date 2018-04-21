package com.pollutioncms.web.controller;

import com.pollutioncms.common.exception.BaseException;
import com.pollutioncms.service.api.UserService;
import com.pollutioncms.service.dto.LoginUserDTO;
import com.pollutioncms.web.contants.Contants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import java.util.ArrayList;
import java.util.List;

/**
 * 登录放置session的controller
 * @author liqiag
 * @discription LoginController
 * @date 2018-04-21
 **/
@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("login")
    public String login(@RequestParam @Validated LoginUserDTO user, BindingResult result, RedirectAttributesModelMap ramm) {
        if (result.hasErrors()) {
            List<String> error = new ArrayList<>();
            result.getAllErrors().forEach((ObjectError err) -> error.add(err.getDefaultMessage()));
            ramm.addFlashAttribute("validatError",error);
            return "redirect:/login.jsp";
        }
        Subject subject = SecurityUtils.getSubject();
        AuthenticationToken token = new UsernamePasswordToken(user.getUserName(), user.getPwd());
        if (subject.isAuthenticated()) {
            return "index";
        }
        try {
            subject.login(token);
        } catch (AuthenticationException | BaseException e) {
            ramm.addFlashAttribute("loginError", e.getMessage());
            return "redirect:/login.jsp";
        }
        Session session = subject.getSession();
        ;
        session.setAttribute(Contants.USER, userService.getLoginUser(user.getUserName()));
        return "index";
    }

}

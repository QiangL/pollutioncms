package com.pollutioncms.web.controller.exceptionController;

import com.alibaba.fastjson.JSONObject;
import com.pollutioncms.web.module.Response;
import com.pollutioncms.web.utils.AjaxUtils;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author liqiag
 * @discription AuthExceptionController
 * @date 2018-04-20
 **/
@ControllerAdvice
public class AuthExceptionController {
    //TODO shioro Ajax 和页面 区分

    @ExceptionHandler(value = {UnknownAccountException.class, LockedAccountException.class,UnknownAccountException.class})
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public void accountExceptionHandler(Exception e,HttpServletRequest request, HttpServletResponse response) throws IOException {
        AjaxUtils.handleUnAuthResponse(request,response,e.getMessage());
    }
}

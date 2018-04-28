package com.pollutioncms.web.controller.exceptionController;

import com.pollutioncms.web.enums.RespError;
import com.pollutioncms.web.utils.AjaxUtils;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.ServletException;
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
    @ExceptionHandler(value = {UnknownAccountException.class, LockedAccountException.class, UnknownAccountException.class})
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public void accountExceptionHandler(Exception e, HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
        AjaxUtils.handleUnAuthResponse(request, response, e.getMessage());
    }

    @ExceptionHandler(value = {UnauthorizedException.class})
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public void unAuthExceptionHandler(Exception e, HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
        AjaxUtils.handleUnAuthResponse(request, response, RespError.UN_AUTH_OPS.getErrorCode());
    }
}

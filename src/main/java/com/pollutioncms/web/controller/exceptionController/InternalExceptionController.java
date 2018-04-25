package com.pollutioncms.web.controller.exceptionController;

import com.pollutioncms.common.exception.DaoException;
import com.pollutioncms.common.exception.ParamErrorException;
import com.pollutioncms.web.enums.RespError;
import com.pollutioncms.web.module.Response;
import com.pollutioncms.web.utils.AjaxUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 集中的异常处理器
 * @author liqiag
 * @discription ExceptionController
 * @date 2018-04-20
 **/
@ControllerAdvice
public class InternalExceptionController {
    private static final Logger logger= LoggerFactory.getLogger(InternalExceptionController.class);

    @ExceptionHandler(DataAccessException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public void  dataAccessHandle(DataAccessException e, HttpServletRequest request, HttpServletResponse response) throws IOException {
        logger.error("database error",e);
        AjaxUtils.handleErrorResponse(request,response,RespError.OPERATION_FAIL.getErrorCode());
    }
    @ExceptionHandler(DaoException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public void daoExceptionHandle(DataAccessException e, HttpServletRequest request, HttpServletResponse response) throws IOException {
        logger.error("database error",e);
        AjaxUtils.handleErrorResponse(request,response,RespError.OPERATION_FAIL.getErrorCode());
    }

    @ExceptionHandler(ParamErrorException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void badParamExceptionHandler(ParamErrorException e, HttpServletRequest request, HttpServletResponse response) throws IOException {
        logger.error("input param not suit", e);
        AjaxUtils.handleErrorResponse(request,response,e.getMessage());
    }

    @ExceptionHandler(BeansException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public void beansCopyExHandler(BeansException e, HttpServletRequest request, HttpServletResponse response) throws IOException {
        logger.error("copy properties error", e);
        AjaxUtils.handleErrorResponse(request,response,RespError.INTERNAL_ERROR.getErrorCode());
    }
}

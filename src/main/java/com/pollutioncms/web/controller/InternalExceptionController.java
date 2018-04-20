package com.pollutioncms.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.pollutioncms.common.exception.ParamErrorException;
import com.pollutioncms.web.enums.RespError;
import com.pollutioncms.web.module.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

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
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String dataAccessHandle(DataAccessException e) {
        logger.error("database error",e);
        return Response.failResp(RespError.OPERATION_FAIL).toJSON();
    }

    @ExceptionHandler(ParamErrorException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public String badParamExceptionHandler(ParamErrorException e){
        logger.error("input param not suit", e);
        return Response.failResp(e.getMessage()).toJSON();
    }

    @ExceptionHandler(BeansException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String beansCopyExHandler(BeansException e) {
        logger.error("copy properties error", e);
        return Response.failResp(RespError.INTRA_ERROR).toJSON();
    }
}

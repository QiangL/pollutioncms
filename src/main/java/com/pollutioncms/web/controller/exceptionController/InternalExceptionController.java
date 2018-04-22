package com.pollutioncms.web.controller.exceptionController;

import com.pollutioncms.common.exception.DaoException;
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
    public Response<?> dataAccessHandle(DataAccessException e) {
        logger.error("database error",e);
        return Response.failResp(RespError.OPERATION_FAIL);
    }
    @ExceptionHandler(DaoException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Response<?> daoExceptionHandle(DataAccessException e) {
        logger.error("database error",e);
        return Response.failResp(RespError.OPERATION_FAIL);
    }

    @ExceptionHandler(ParamErrorException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Response<?> badParamExceptionHandler(ParamErrorException e){
        logger.error("input param not suit", e);
        return Response.failResp(e.getMessage());
    }

    @ExceptionHandler(BeansException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Response<?> beansCopyExHandler(BeansException e) {
        logger.error("copy properties error", e);
        return Response.failResp(RespError.INTERNAL_ERROR);
    }
}

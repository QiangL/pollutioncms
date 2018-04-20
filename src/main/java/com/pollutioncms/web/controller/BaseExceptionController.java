package com.pollutioncms.web.controller;

import com.pollutioncms.common.exception.BaseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author liqiag
 * @discription BaseExceptionController
 * @date 2018-04-20
 **/
@ControllerAdvice
public class BaseExceptionController {

    private static final Logger logger= LoggerFactory.getLogger(BaseExceptionController.class);

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception e){
        logger.error("exception happened",e);
        return "error";
    }
}

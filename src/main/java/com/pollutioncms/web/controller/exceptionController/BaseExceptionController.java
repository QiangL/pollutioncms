package com.pollutioncms.web.controller.exceptionController;

import com.pollutioncms.web.enums.RespError;
import com.pollutioncms.web.utils.AjaxUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author liqiag
 * @discription BaseExceptionController
 * @date 2018-04-20
 **/
@ControllerAdvice
public class BaseExceptionController {

    private static final Logger logger= LoggerFactory.getLogger(BaseExceptionController.class);

    @ExceptionHandler(Exception.class)
    public void exceptionHandler(Exception e, HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
        logger.error("exception happened",e);
        AjaxUtils.handleErrorResponse(request, response, RespError.INTERNAL_ERROR.getErrorCode());
    }
}

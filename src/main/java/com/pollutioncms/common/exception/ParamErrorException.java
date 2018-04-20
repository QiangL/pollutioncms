package com.pollutioncms.common.exception;

import com.pollutioncms.common.enums.ExceptionEnum;

/**
 * @author liqiag
 * @discription ParamErrorException
 * @date 2018-04-19
 **/
public class ParamErrorException extends BaseException {

    public ParamErrorException(String detail) {
        super(ExceptionEnum.ParamErrException.getErrorCode(),detail);
    }

    public ParamErrorException() {
        super(ExceptionEnum.ParamErrException);
    }

    public ParamErrorException(Throwable throwable) {
        super(ExceptionEnum.ParamErrException, throwable);
    }
}

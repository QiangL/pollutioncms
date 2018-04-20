package com.pollutioncms.common.exception;

import com.pollutioncms.common.enums.ExceptionEnum;

/**
 * @author liqiag
 * @discription ParamErrException
 * @date 2018-04-19
 **/
public class ParamErrException extends BaseException {

    public ParamErrException(String detail) {
        super(ExceptionEnum.ParamErrException.getErrorCode(),detail);
    }

    public ParamErrException() {
        super(ExceptionEnum.ParamErrException);
    }

    public ParamErrException(Throwable throwable) {
        super(ExceptionEnum.ParamErrException, throwable);
    }
}

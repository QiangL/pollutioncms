package com.pollutioncms.common.exception;

import com.pollutioncms.common.enums.ExceptionEnum;

/**
 * @author liqiag
 * @discription InternalErrorException
 * @date 2018-04-20
 **/
public class InternalErrorException extends BaseException {
    public InternalErrorException(String errorCode, String errorMsg) {
        super(errorCode, errorMsg);
    }

    public InternalErrorException(Throwable throwable) {
        super(ExceptionEnum.Internal_ERROR_EXCEPTION, throwable);
    }

    public InternalErrorException(){
        super(ExceptionEnum.Internal_ERROR_EXCEPTION);
    }
}

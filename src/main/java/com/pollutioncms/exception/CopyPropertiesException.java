package com.pollutioncms.exception;

import com.pollutioncms.enums.ExceptionEnum;

/**
 * @author liqiag
 * @discription CopyPropertiesException
 * @date 2018-04-13
 **/
public class CopyPropertiesException extends BaseException {
    public CopyPropertiesException() {
        super(ExceptionEnum.CopyPropertiesException);
    }

    public CopyPropertiesException(Throwable throwable) {
        super(ExceptionEnum.CopyPropertiesException, throwable);
    }
}

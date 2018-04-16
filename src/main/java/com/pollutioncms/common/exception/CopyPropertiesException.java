package com.pollutioncms.common.exception;

import com.pollutioncms.common.enums.ExceptionEnum;

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

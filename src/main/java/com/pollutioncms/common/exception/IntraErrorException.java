package com.pollutioncms.common.exception;

import com.pollutioncms.common.enums.ExceptionEnum;

/**
 * @author liqiag
 * @discription IntraErrorException
 * @date 2018-04-20
 **/
public class IntraErrorException extends BaseException {
    public IntraErrorException(String errorCode, String errorMsg) {
        super(errorCode, errorMsg);
    }

    public IntraErrorException(Throwable throwable) {
        super(ExceptionEnum.INTRA_ERROR_EXCEPTION, throwable);
    }

    public IntraErrorException(){
        super(ExceptionEnum.INTRA_ERROR_EXCEPTION);
    }
}

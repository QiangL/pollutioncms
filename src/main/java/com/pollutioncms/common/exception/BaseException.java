package com.pollutioncms.common.exception;

import com.pollutioncms.common.enums.ExceptionEnum;

public class BaseException extends RuntimeException {

    private String errorMsg;

    BaseException(String errorCode, String errorMsg) {
        super(errorCode);
        this.errorMsg = errorMsg;
    }

    BaseException(ExceptionEnum exceptionEnum) {
        this(exceptionEnum.getErrorCode(), exceptionEnum.getErrorMsg());
    }

    BaseException(ExceptionEnum exceptionEnum,Throwable throwable) {
        super(exceptionEnum.getErrorCode(),throwable);
        this.errorMsg = exceptionEnum.getErrorMsg();
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /** 重载此方法,禁止爬栈 **/
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

}

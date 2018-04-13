package com.pollutioncms.exception;

import com.pollutioncms.enums.ExceptionEnum;

public class BaseException extends RuntimeException {

    private String errorCode;

    private String errorMsg;

    BaseException(String errorCode, String errorMsg) {
        super(errorCode);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    BaseException(ExceptionEnum exceptionEnum) {
        this(exceptionEnum.getErrorCode(), exceptionEnum.getErrorMsg());
    }

    BaseException(ExceptionEnum exceptionEnum,Throwable throwable) {
        super(throwable);
        this.errorCode = exceptionEnum.getErrorCode();
        this.errorMsg = exceptionEnum.getErrorMsg();
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
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

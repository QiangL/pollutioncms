package com.pollutioncms.exception;

import com.pollutioncms.enums.ExceptionEnum;

public class BaseException extends Exception {

    private String errorCode;

    private String errorMsg;

    BaseException(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    BaseException(ExceptionEnum exceptionEnum) {
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

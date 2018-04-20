package com.pollutioncms.service.enums;

public enum RespError {

    PARAM_WRONG("param wrong"),
    USER_NOT_EXIT("user not exit"),
    OPERATION_FAIL("operation fail")
    ;

    private String errorCode;

    RespError(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}


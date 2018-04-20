package com.pollutioncms.web.enums;

public enum RespError {

    PARAM_WRONG("param wrong"),
    USER_NOT_EXIT("user not exit"),
    OPERATION_FAIL("operation fail"),
    INTRA_ERROR("intra error")
    ;

    private String errorCode;

    RespError(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}


package com.pollutioncms.web.enums;

public enum RespError {

    PARAM_WRONG("参数错误"),
    USER_NOT_EXIT("用户不存在"),
    OPERATION_FAIL("操作失败"),
    INTERNAL_ERROR("内部错误")
    ;

    private String errorCode;

    RespError(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}


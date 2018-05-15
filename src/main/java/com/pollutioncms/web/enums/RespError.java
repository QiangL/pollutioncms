package com.pollutioncms.web.enums;

public enum RespError {

    PARAM_WRONG("参数错误"),
    USER_NOT_EXIT("用户不存在"),
    OPERATION_FAIL("操作失败"),
    INTERNAL_ERROR("内部错误"),
    UN_AUTH_OPS("未授权的操作"),
    ROLE_NAME_NOT_EXIT("角色名不存在"),
    PASSWORD_ERROR("两次密码不一致"),
    ROLE_NAME_DUPLICATE("角色名重复"),
    USER_NAME_DUPLICATE("用户名重复")
    ;

    private String errorCode;

    RespError(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}


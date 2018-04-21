package com.pollutioncms.common.enums;

/**
 * 异常枚举
 */
public enum ExceptionEnum {

    /** 数据访问异常 **/
    DaoException("DAO Exception", "数据访问出错"),
    DATA_EFFECT_NUM_ERROR("data effect num error", "数据操作影响数据数目不正确"),
    /** 使用BeanUtils拷贝属性异常 **/
    CopyPropertiesException("Bean copy Exception","拷贝Bean属性出错"),
    /** 入参错误 **/
    ParamErrException("param value is not suit","参数不合适"),

    Internal_ERROR_EXCEPTION("internal error", "内部错误")
    ;


    private String errorCode;
    private String errorMsg;

    ExceptionEnum(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }


    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}

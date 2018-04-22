package com.pollutioncms.common.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 权限继承枚举
 * @author liqiag
 * @discription AuthEnum
 * @date 2018-04-21
 **/
public enum AuthEnum {

    /** 权限不可继承**/
    CANNOT_INHERIT(0, "can't inherit"),

    /** 权限可继承 **/
    CAN_INHERIT(1, "can inherit");

    static Map<Integer,AuthEnum> map;


    private int code;
    private String msg;

    AuthEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static AuthEnum getAuthEnum(Integer code){
        if (map == null) {
            map = new HashMap<>();
            for (AuthEnum a : AuthEnum.values()) {
                map.put(a.getCode(), a);
            }
        }
        return map.get(code);
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

package com.pollutioncms.common.enums;

import java.util.Map;

/**
 * 用户状态枚举
 * @author liqiag
 * @discription UserStatusEnum
 * @date 2018-04-17
 **/
public enum UserStatusEnum {

    NORMAL(1),
    LOCKED(2),
    DELETED(3)
    ;

    private int status;

    UserStatusEnum(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    static Map<Integer,UserStatusEnum> map;

    public static UserStatusEnum getUserStatusEnum(Integer status) {
        if (map == null) {
            for (UserStatusEnum u : UserStatusEnum.values()) {
                map.put(u.getStatus(), u);
            }
        }
        return map.get(status);
    }
}

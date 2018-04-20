package com.pollutioncms.common.enums;

/**
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
}

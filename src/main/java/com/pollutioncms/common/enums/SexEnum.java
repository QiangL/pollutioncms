package com.pollutioncms.common.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liqiag
 * @discription SexEnum
 * @date 2018-04-26
 **/
public enum SexEnum {

    FEMALE(0,"女"),
    MALE(1,"男");

    private static Map<Integer, SexEnum> map = new HashMap<>();
    static{
        map.put(FEMALE.getCode(), FEMALE);
        map.put(MALE.getCode(), MALE);
    }


    private int code;
    private String sex;

    SexEnum(int code,String sex){
        this.code = code;
        this.sex = sex;
    }

    public static SexEnum getSexEnum(Integer code){
        return map.get(code);
    }
    public int getCode() {
        return code;
    }

    public String getSex() {
        return sex;
    }

}

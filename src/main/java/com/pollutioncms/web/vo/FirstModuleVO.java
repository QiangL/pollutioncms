package com.pollutioncms.web.vo;


import java.util.List;

/**
 * 组合FirstModule和SecondModule的DTO
 * @author liqiag
 * @discription FirstModuleVO
 * @date 2018-04-13
 **/
public class FirstModuleVO {

    private String uuid;

    private String name;

    private List<SecondModuleVO> secondModuleVOS;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SecondModuleVO> getSecondModuleVOS() {
        return secondModuleVOS;
    }

    public void setSecondModuleVOS(List<SecondModuleVO> secondModuleVOS) {
        this.secondModuleVOS = secondModuleVOS;
    }
}

package com.pollutioncms.service.dto;

import com.pollutioncms.module.domain.User;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * 用于登录校验的UserDTO.
 * 不包含登录无关的属性
 *
 * @author liqiag
 * @discription LoginUserDTO
 * @date 2018-04-13
 **/
public class LoginUserDTO {

    private String userName;

    private String pwd;

    /**
     * 密码加盐字段
     */
    private String salt;

    private int status;

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * User 转化 LoginUserDTO
     *
     * @param user
     * @return
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    public static LoginUserDTO toLoginUserDTO(User user) {
        LoginUserDTO d = new LoginUserDTO();
        BeanUtils.copyProperties(user, d);
        return d;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}

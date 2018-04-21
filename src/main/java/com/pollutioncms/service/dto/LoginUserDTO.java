package com.pollutioncms.service.dto;

import com.pollutioncms.common.enums.UserStatusEnum;
import com.pollutioncms.module.domain.User;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;
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

    @NotBlank(message = "user name is blank")
    @Length(min = 3, max = 10,message = "user name's length should between 3 and 10")
    private String userName;

    @NotBlank(message = "password is blank")
    @Length(min = 5,max = 16,message = "password's length should between 5 and 16")
    private String pwd;


    /**
     * 密码加盐字段
     */
    private String salt;

    private UserStatusEnum status;

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

    public UserStatusEnum getStatus() {
        return status;
    }

    public void setStatus(UserStatusEnum status) {
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
        d.setStatus(UserStatusEnum.getUserStatusEnum(user.getStatus()));
        return d;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}

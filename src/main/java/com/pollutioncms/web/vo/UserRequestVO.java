package com.pollutioncms.web.vo;

import com.pollutioncms.common.enums.SexEnum;
import com.pollutioncms.common.enums.UserStatusEnum;
import com.pollutioncms.service.dto.UserDTO;
import com.pollutioncms.web.validator.UserDTOValidator;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.BeanUtils;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @author liqiag
 * @discription UserRequestVO
 * @date 2018-04-25
 **/
public class UserRequestVO {
    @NotNull(message = "user id is null", groups = {UserDTOValidator.NeedId.class})
    private Integer id;

    /**
     * 登录名
     */
    @NotBlank(message = "user name is null")
    private String userName;

    private String pwd;

    /** 确认密码 **/
    private String pwd2;

    /**
     * 显示名称，展示用
     */
    private String showName;

    private SexEnum userSex;

    @Pattern(regexp = "1[35678][0-9]{9}", message = "phone pattern wrong")
    private String userTel;

    private String userAddr;

    @Email(message = "mail pattern wrong")
    private String userEmail;

    private UserStatusEnum status;

    public Integer getId() {
        return id;
    }

    public UserDTO toDTO() {
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(this, userDTO);
        return userDTO;
    }

    public static UserRequestVO toVO(UserDTO userDTO) {
        UserRequestVO userRequestVO = new UserRequestVO();
        BeanUtils.copyProperties(userDTO, userRequestVO);
        return userRequestVO;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPwd2() {
        return pwd2;
    }

    public void setPwd2(String pwd2) {
        this.pwd2 = pwd2;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public SexEnum getUserSex() {
        return userSex;
    }

    public void setUserSex(SexEnum userSex) {
        this.userSex = userSex;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public UserStatusEnum getStatus() {
        return status;
    }

    public void setStatus(UserStatusEnum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}

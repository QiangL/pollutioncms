package com.pollutioncms.service.dto;

import com.pollutioncms.common.enums.SexEnum;
import com.pollutioncms.common.enums.UserStatusEnum;
import com.pollutioncms.module.domain.User;
import com.pollutioncms.service.dto.validator.UserDTOValidator;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * @author liqiag
 * @discription UserDTO
 * @date 2018-04-19
 **/
public class UserDTO {

    @NotNull(message = "user id is null", groups = {UserDTOValidator.NeedId.class})
    private Integer id;

    private String pwd;

    /**
     * 登录名
     */
    @NotBlank(message = "user name is null")
    private String userName;

    private Date createTime;

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

    /**
     * 最后一次操作事件
     */
    private Date lastOptTime;

    /**
     * 用户状态
     1：正常
     2：锁定，不能登录
     3：删除
     */
    private UserStatusEnum status;

    public static UserDTO toUserDTO(User user) throws BeansException {
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        userDTO.setUserSex(SexEnum.getSexEnum(user.getUserSex()));
        userDTO.setStatus(UserStatusEnum.getUserStatusEnum(user.getStatus()));
        return userDTO;
    }

    public User toDO() throws BeansException {
        User u = new User();
        BeanUtils.copyProperties(this, u);
        u.setUserSex(this.getUserSex().getCode());
        u.setStatus(this.getStatus().getStatus());
        return u;
    }

    public Integer getId() {
        return id;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getShowName() {
        return showName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
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

    public Date getLastOptTime() {
        return lastOptTime;
    }

    public void setLastOptTime(Date lastOptTime) {
        this.lastOptTime = lastOptTime;
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

package com.pollutioncms.web.vo;

import com.pollutioncms.common.enums.SexEnum;
import com.pollutioncms.common.enums.UserStatusEnum;
import com.pollutioncms.service.dto.UserDTO;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.beans.BeanUtils;

import java.util.Date;
import java.util.Set;

/**
 * @author liqiag
 * @discription UserResponseVO
 * @date 2018-04-26
 **/
public class UserResponseVO {
    private Integer id;

    /**
     * 登录名
     */
    private String userName;

    private Date createTime;

    /**
     * 显示名称，展示用
     */
    private String showName;

    private SexEnum userSex;

    private String userTel;

    private String userAddr;

    private String userEmail;

    /**
     * 最后一次操作事件
     */
    private Date lastOptTime;

    private Set<String> roleNames;
    private UserStatusEnum status;

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

    public Set<String> getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(Set<String> roleNames) {
        this.roleNames = roleNames;
    }

    public UserStatusEnum getStatus() {
        return status;
    }

    public void setStatus(UserStatusEnum status) {
        this.status = status;
    }

    public static UserResponseVO toVO(UserDTO userDTO) {
        UserResponseVO userResponseVO = new UserResponseVO();
        BeanUtils.copyProperties(userDTO, userResponseVO);
        return userResponseVO;
    }
    public UserDTO toDTO(){
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(this, userDTO);
        return userDTO;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}

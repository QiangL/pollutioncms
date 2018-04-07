package com.pollutioncms.module.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "hiwater..user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 登录名
     */
    @Column(name = "user_name")
    private String userName;

    private String pwd;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最后一次操作事件
     */
    @Column(name = "last_opt_time")
    private Date lastOptTime;

    /**
     * 显示名称，展示用
     */
    @Column(name = "show_name")
    private String showName;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取登录名
     *
     * @return user_name - 登录名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置登录名
     *
     * @param userName 登录名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取最后一次操作事件
     *
     * @return last_opt_time - 最后一次操作事件
     */
    public Date getLastOptTime() {
        return lastOptTime;
    }

    /**
     * 设置最后一次操作事件
     *
     * @param lastOptTime 最后一次操作事件
     */
    public void setLastOptTime(Date lastOptTime) {
        this.lastOptTime = lastOptTime;
    }

    /**
     * 获取显示名称，展示用
     *
     * @return show_name - 显示名称，展示用
     */
    public String getShowName() {
        return showName;
    }

    /**
     * 设置显示名称，展示用
     *
     * @param showName 显示名称，展示用
     */
    public void setShowName(String showName) {
        this.showName = showName == null ? null : showName.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getPwd() == null ? other.getPwd() == null : this.getPwd().equals(other.getPwd()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getLastOptTime() == null ? other.getLastOptTime() == null : this.getLastOptTime().equals(other.getLastOptTime()))
            && (this.getShowName() == null ? other.getShowName() == null : this.getShowName().equals(other.getShowName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getPwd() == null) ? 0 : getPwd().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getLastOptTime() == null) ? 0 : getLastOptTime().hashCode());
        result = prime * result + ((getShowName() == null) ? 0 : getShowName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", pwd=").append(pwd);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastOptTime=").append(lastOptTime);
        sb.append(", showName=").append(showName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
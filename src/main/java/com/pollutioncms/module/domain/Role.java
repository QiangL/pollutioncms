package com.pollutioncms.module.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "role")
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 创造Role的User_id
     */
    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "ent_no")
    private Integer entNo;

    /**
     * 备注
     */
    @Column(name = "role_cn_name")
    private String roleCnName;

    private String comment;

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
     * 获取创造Role的User_id
     *
     * @return parent_id - 创造Role的User_id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置创造Role的User_id
     *
     * @param parentId 创造Role的User_id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * @return role_name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * @return ent_no
     */
    public Integer getEntNo() {
        return entNo;
    }

    /**
     * @param entNo
     */
    public void setEntNo(Integer entNo) {
        this.entNo = entNo;
    }

    /**
     * 获取备注
     *
     * @return role_cn_name - 备注
     */
    public String getRoleCnName() {
        return roleCnName;
    }

    /**
     * 设置备注
     *
     * @param roleCnName 备注
     */
    public void setRoleCnName(String roleCnName) {
        this.roleCnName = roleCnName == null ? null : roleCnName.trim();
    }

    /**
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
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
        Role other = (Role) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getRoleName() == null ? other.getRoleName() == null : this.getRoleName().equals(other.getRoleName()))
            && (this.getEntNo() == null ? other.getEntNo() == null : this.getEntNo().equals(other.getEntNo()))
            && (this.getRoleCnName() == null ? other.getRoleCnName() == null : this.getRoleCnName().equals(other.getRoleCnName()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        result = prime * result + ((getEntNo() == null) ? 0 : getEntNo().hashCode());
        result = prime * result + ((getRoleCnName() == null) ? 0 : getRoleCnName().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", roleName=").append(roleName);
        sb.append(", entNo=").append(entNo);
        sb.append(", roleCnName=").append(roleCnName);
        sb.append(", comment=").append(comment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
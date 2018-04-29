package com.pollutioncms.module.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "role_auth")
public class RoleAuth implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "module_op_id")
    private Integer moduleOpId;

    /**
     * 能否传递，给别人授权
     */
    @Column(name = "can_inherit")
    private Boolean canInherit;

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
     * @return role_id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @return module_op_id
     */
    public Integer getModuleOpId() {
        return moduleOpId;
    }

    /**
     * @param moduleOpId
     */
    public void setModuleOpId(Integer moduleOpId) {
        this.moduleOpId = moduleOpId;
    }

    /**
     * 获取能否传递，给别人授权
     *
     * @return can_inherit - 能否传递，给别人授权
     */
    public Boolean getCanInherit() {
        return canInherit;
    }

    /**
     * 设置能否传递，给别人授权
     *
     * @param canInherit 能否传递，给别人授权
     */
    public void setCanInherit(Boolean canInherit) {
        this.canInherit = canInherit;
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
        RoleAuth other = (RoleAuth) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getModuleOpId() == null ? other.getModuleOpId() == null : this.getModuleOpId().equals(other.getModuleOpId()))
            && (this.getCanInherit() == null ? other.getCanInherit() == null : this.getCanInherit().equals(other.getCanInherit()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getModuleOpId() == null) ? 0 : getModuleOpId().hashCode());
        result = prime * result + ((getCanInherit() == null) ? 0 : getCanInherit().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", moduleOpId=").append(moduleOpId);
        sb.append(", canInherit=").append(canInherit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
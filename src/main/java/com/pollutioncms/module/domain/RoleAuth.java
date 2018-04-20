package com.pollutioncms.module.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "role_auth")
public class RoleAuth implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private String id;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "module_op_uuid")
    private String moduleOpUuid;

    /**
     * 能否传递，给别人授权
     */
    @Column(name = "can_authoriz")
    private Boolean canAuthoriz;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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
     * @return module_op_uuid
     */
    public String getModuleOpUuid() {
        return moduleOpUuid;
    }

    /**
     * @param moduleOpUuid
     */
    public void setModuleOpUuid(String moduleOpUuid) {
        this.moduleOpUuid = moduleOpUuid == null ? null : moduleOpUuid.trim();
    }

    /**
     * 获取能否传递，给别人授权
     *
     * @return can_authoriz - 能否传递，给别人授权
     */
    public Boolean getCanAuthoriz() {
        return canAuthoriz;
    }

    /**
     * 设置能否传递，给别人授权
     *
     * @param canAuthoriz 能否传递，给别人授权
     */
    public void setCanAuthoriz(Boolean canAuthoriz) {
        this.canAuthoriz = canAuthoriz;
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
            && (this.getModuleOpUuid() == null ? other.getModuleOpUuid() == null : this.getModuleOpUuid().equals(other.getModuleOpUuid()))
            && (this.getCanAuthoriz() == null ? other.getCanAuthoriz() == null : this.getCanAuthoriz().equals(other.getCanAuthoriz()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getModuleOpUuid() == null) ? 0 : getModuleOpUuid().hashCode());
        result = prime * result + ((getCanAuthoriz() == null) ? 0 : getCanAuthoriz().hashCode());
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
        sb.append(", moduleOpUuid=").append(moduleOpUuid);
        sb.append(", canAuthoriz=").append(canAuthoriz);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
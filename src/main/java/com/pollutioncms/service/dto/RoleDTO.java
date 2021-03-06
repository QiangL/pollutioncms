package com.pollutioncms.service.dto;

import com.pollutioncms.module.domain.Role;
import com.pollutioncms.service.dto.validator.RoleDTOValidator;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;

import javax.validation.constraints.NotNull;

/**
 * 角色DTO
 *
 * @author liqiag
 * @discription RoleDTO
 * @date 2018-04-19
 **/
public class RoleDTO {

    @NotNull(message = "role id is null", groups = {RoleDTOValidator.NeedId.class})
    private Integer id;

    /**
     * 备注
     */
    private String roleCnName;

    @NotBlank(message = "role name is null")
    private String roleName;

    private String comment;

    private Integer parentId;

    private Integer entNo;

    public static RoleDTO toRoleDTO(Role role) throws BeansException {
        RoleDTO roleDTO = new RoleDTO();
        BeanUtils.copyProperties(role, roleDTO);
        return roleDTO;
    }

    public Role toDO() throws BeansException {
        Role role = new Role();
        BeanUtils.copyProperties(this, role);
        return role;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleCnName() {
        return roleCnName;
    }

    public void setRoleCnName(String roleCnName) {
        this.roleCnName = roleCnName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getEntNo() {
        return entNo;
    }

    public void setEntNo(Integer entNo) {
        this.entNo = entNo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}

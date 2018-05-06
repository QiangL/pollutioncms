package com.pollutioncms.web.vo;

import com.pollutioncms.service.dto.RoleDTO;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.beans.BeanUtils;

/**
 * @author liqiag
 * @discription RoleVO
 * @date 2018-05-06
 **/
public class RoleVO {

    private Integer id;

    private String roleCnName;

    private String roleName;

    private String comment;

    private String entNo;

    public static RoleVO toVO(RoleDTO dto) {
        RoleVO roleVO = new RoleVO();
        BeanUtils.copyProperties(dto, roleVO);
        return roleVO;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
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

    public String getEntNo() {
        return entNo;
    }

    public void setEntNo(String entNo) {
        this.entNo = entNo;
    }
}

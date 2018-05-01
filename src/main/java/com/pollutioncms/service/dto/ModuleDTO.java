package com.pollutioncms.service.dto;

import com.pollutioncms.module.domain.Module;
import com.pollutioncms.service.dto.validator.ModuleDTOValidator;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.BeanUtils;

import javax.validation.constraints.NotNull;

/**
 * @author liqiag
 * @discription ModuleDTO
 * @date 2018-04-28
 **/
public class ModuleDTO {

    @NotNull(groups = ModuleDTOValidator.NeedId.class)
    private Integer id;
    @NotNull
    private Integer pid;
    @NotNull
    private String name;

    @NotBlank(groups = ModuleDTOValidator.ModuleOps.class)
    private String permission;
    private String comment;

    private String url;

    private Boolean leaf;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getComment() {
        return comment;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Module toModuleDO() {
        Module module = new Module();
        BeanUtils.copyProperties(this, module);
        module.setId(this.getId());
        module.setParentId(this.getPid());
        module.setLeaf(this.getLeaf());
        return module;
    }

    public static ModuleDTO toDTO(Module mdo) {
        ModuleDTO moduleDTO = new ModuleDTO();
        BeanUtils.copyProperties(mdo, moduleDTO);
        moduleDTO.setId(mdo.getId());
        moduleDTO.setPid(mdo.getParentId());
        return moduleDTO;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}

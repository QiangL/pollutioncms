package com.pollutioncms.service.dto;

import com.pollutioncms.module.domain.Module;
import com.pollutioncms.module.domain.ModuleOperate;
import com.pollutioncms.service.dto.validator.ModuleDTOValidator;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.BeanUtils;

/**
 * @author liqiag
 * @discription ModuleDTO
 * @date 2018-04-28
 **/
public class ModuleDTO {

    @Length(min=36,max=36,groups = ModuleDTOValidator.NeedId.class)
    private String id;

    private String pid;

    private String name;

    @NotBlank(groups = ModuleDTOValidator.ModuleOps.class )
    private String permission;
    @NotBlank(groups = ModuleDTOValidator.ModuleOps.class )
    private String comment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
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

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Module toModuleDO() {
        Module module = new Module();
        BeanUtils.copyProperties(this, module);
        module.setUuid(this.getId());
        module.setParentUuid(this.getPid());
        return module;
    }
    public ModuleOperate toModuleOpsDO() {
        ModuleOperate moduleOperate = new ModuleOperate();
        BeanUtils.copyProperties(this, moduleOperate);
        moduleOperate.setUuid(this.getId());
        moduleOperate.setParentUuid(this.getPid());
        return moduleOperate;
    }

    public static ModuleDTO toDTO(ModuleOperate mdo){
        ModuleDTO moduleDTO = new ModuleDTO();
        BeanUtils.copyProperties(mdo, moduleDTO);
        moduleDTO.setId(mdo.getUuid());
        moduleDTO.setPid(mdo.getParentUuid());
        moduleDTO.setName(mdo.getName());
        return moduleDTO;
    }
    public static ModuleDTO toDTO(Module mdo){
        ModuleDTO moduleDTO = new ModuleDTO();
        moduleDTO.setId(mdo.getUuid());
        moduleDTO.setPid(mdo.getParentUuid());
        moduleDTO.setName(mdo.getName());
        return moduleDTO;
    }

    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}

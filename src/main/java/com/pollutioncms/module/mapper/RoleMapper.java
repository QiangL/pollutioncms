package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.Role;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface RoleMapper extends Mapper<Role> {

    /**
     * 业务上的创建角色.
     * 当role.canInherit==1 允许继承权限,则复制父role的所有权限到当前role
     * @param parentRoleName 父的roleName
     * @param role
     * @return
     */
    int saveRole(@Param("parentRoleName") String parentRoleName,@Param("role") Role role);

}
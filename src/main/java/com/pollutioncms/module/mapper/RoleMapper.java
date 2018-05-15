package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.Role;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Set;

public interface RoleMapper extends Mapper<Role> {

    /**
     * 业务上的创建角色.
     * @param parentUserName 父的userName
     * @param role
     * @return
     */
    int saveRole(@Param("parentUserName") String parentUserName,@Param("role") Role role);

    /**
     * 差集检查出不在表中的roleName
     * @param roleNames
     * @return
     */
    Set<String> checkRoleNames(@Param("roleNames") Set<String> roleNames);

}
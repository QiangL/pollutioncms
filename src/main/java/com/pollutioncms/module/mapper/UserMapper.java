package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.User;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Set;

public interface UserMapper extends Mapper<User> {
    /**
     * 根据UserName获取对应User的所有权限
     * @param userName
     * @return
     */
    Set<String> listPermissions(@Param("userName") String userName);

    /**
     * 根据UserName获取对应User的所有角色
     * @param userName
     * @return
     */
    Set<String> listRoles(@Param("userName") String userName);

    List<User> listUserByRole(@Param("roleName") String roleName);

    /**
     * 业务上的删除.
     * 会删除对应role_user关联表的记录
     * @param user
     * @return
     */
    int deleteUser(@Param("user") User user);
}
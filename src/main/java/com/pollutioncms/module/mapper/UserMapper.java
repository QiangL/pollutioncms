package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.User;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Set;

public interface UserMapper extends Mapper<User> {

    Set<String> listPermissions(@Param("userName") String userName);

    Set<String> listRoles(@Param("userName") String userName);

    List<User> listUserByRole(@Param("roleId") Integer roleId);
}
package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.User;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.Set;

public interface UserMapper extends Mapper<User> {

    Set<String> listPermissions(@Param("id") Integer id);

    Set<String> listRoles(@Param("id") Integer id);
}
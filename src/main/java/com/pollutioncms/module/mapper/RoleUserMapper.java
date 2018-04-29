package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.RoleUser;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Set;

public interface RoleUserMapper extends Mapper<RoleUser> {

    Set<String> queryRole(@Param("userName") String userName);

    int motifyRoles(@Param("userName")String userName,@Param("roleNames")Set<String> roleNames);
}
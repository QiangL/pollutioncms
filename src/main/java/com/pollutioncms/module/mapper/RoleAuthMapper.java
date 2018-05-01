package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.RoleAuth;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Set;

public interface RoleAuthMapper extends Mapper<RoleAuth> {

    int updateAuths(@Param("roleName") String roleName, @Param("ids") Set<Integer> ids);
}
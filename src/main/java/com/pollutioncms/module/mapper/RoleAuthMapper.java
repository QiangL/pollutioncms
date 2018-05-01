package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.RoleAuth;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RoleAuthMapper extends Mapper<RoleAuth> {

    int updateAuths(@Param("roleName") String roleName, @Param("ids") List<Integer> ids);
}
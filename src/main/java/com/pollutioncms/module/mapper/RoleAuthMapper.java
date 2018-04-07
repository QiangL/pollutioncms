package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.RoleAuth;
import com.pollutioncms.module.domain.RoleAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleAuthMapper {
    long countByExample(RoleAuthExample example);

    int deleteByExample(RoleAuthExample example);

    int insert(RoleAuth record);

    int insertSelective(RoleAuth record);

    List<RoleAuth> selectByExample(RoleAuthExample example);

    int updateByExampleSelective(@Param("record") RoleAuth record, @Param("example") RoleAuthExample example);

    int updateByExample(@Param("record") RoleAuth record, @Param("example") RoleAuthExample example);
}
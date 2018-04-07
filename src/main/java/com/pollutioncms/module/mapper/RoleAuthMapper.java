package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.RoleAuth;
import com.pollutioncms.module.domain.RoleAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface RoleAuthMapper extends Mapper<RoleAuth> {
    long countByExample(RoleAuthExample example);

    int deleteByExample(RoleAuthExample example);

    List<RoleAuth> selectByExample(RoleAuthExample example);

    int updateByExampleSelective(@Param("record") RoleAuth record, @Param("example") RoleAuthExample example);

    int updateByExample(@Param("record") RoleAuth record, @Param("example") RoleAuthExample example);
}
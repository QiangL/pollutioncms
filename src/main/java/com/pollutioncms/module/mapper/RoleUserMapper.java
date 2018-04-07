package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.RoleUser;
import com.pollutioncms.module.domain.RoleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface RoleUserMapper extends Mapper<RoleUser> {
    long countByExample(RoleUserExample example);

    int deleteByExample(RoleUserExample example);

    List<RoleUser> selectByExample(RoleUserExample example);

    int updateByExampleSelective(@Param("record") RoleUser record, @Param("example") RoleUserExample example);

    int updateByExample(@Param("record") RoleUser record, @Param("example") RoleUserExample example);
}
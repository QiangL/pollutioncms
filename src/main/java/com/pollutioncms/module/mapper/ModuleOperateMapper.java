package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.ModuleOperate;
import com.pollutioncms.module.domain.ModuleOperateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModuleOperateMapper {
    long countByExample(ModuleOperateExample example);

    int deleteByExample(ModuleOperateExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(ModuleOperate record);

    int insertSelective(ModuleOperate record);

    List<ModuleOperate> selectByExample(ModuleOperateExample example);

    ModuleOperate selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") ModuleOperate record, @Param("example") ModuleOperateExample example);

    int updateByExample(@Param("record") ModuleOperate record, @Param("example") ModuleOperateExample example);

    int updateByPrimaryKeySelective(ModuleOperate record);

    int updateByPrimaryKey(ModuleOperate record);
}
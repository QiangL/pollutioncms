package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.ModuleOperate;
import com.pollutioncms.module.domain.ModuleOperateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ModuleOperateMapper extends Mapper<ModuleOperate> {
    long countByExample(ModuleOperateExample example);

    int deleteByExample(ModuleOperateExample example);

    List<ModuleOperate> selectByExample(ModuleOperateExample example);

    int updateByExampleSelective(@Param("record") ModuleOperate record, @Param("example") ModuleOperateExample example);

    int updateByExample(@Param("record") ModuleOperate record, @Param("example") ModuleOperateExample example);
}
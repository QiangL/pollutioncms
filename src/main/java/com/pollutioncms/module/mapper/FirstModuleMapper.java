package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.FirstModule;
import com.pollutioncms.module.domain.FirstModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface FirstModuleMapper extends Mapper<FirstModule> {
    long countByExample(FirstModuleExample example);

    int deleteByExample(FirstModuleExample example);

    List<FirstModule> selectByExample(FirstModuleExample example);

    int updateByExampleSelective(@Param("record") FirstModule record, @Param("example") FirstModuleExample example);

    int updateByExample(@Param("record") FirstModule record, @Param("example") FirstModuleExample example);
}
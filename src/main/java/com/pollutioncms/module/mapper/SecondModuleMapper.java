package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.SecondModule;
import com.pollutioncms.module.domain.SecondModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface SecondModuleMapper extends Mapper<SecondModule> {
    long countByExample(SecondModuleExample example);

    int deleteByExample(SecondModuleExample example);

    List<SecondModule> selectByExample(SecondModuleExample example);

    int updateByExampleSelective(@Param("record") SecondModule record, @Param("example") SecondModuleExample example);

    int updateByExample(@Param("record") SecondModule record, @Param("example") SecondModuleExample example);
}
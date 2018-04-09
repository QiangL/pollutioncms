package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.FirstModule;
import com.pollutioncms.module.domain.FirstModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FirstModuleMapper {
    long countByExample(FirstModuleExample example);

    int deleteByExample(FirstModuleExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(FirstModule record);

    int insertSelective(FirstModule record);

    List<FirstModule> selectByExample(FirstModuleExample example);

    FirstModule selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") FirstModule record, @Param("example") FirstModuleExample example);

    int updateByExample(@Param("record") FirstModule record, @Param("example") FirstModuleExample example);

    int updateByPrimaryKeySelective(FirstModule record);

    int updateByPrimaryKey(FirstModule record);
}
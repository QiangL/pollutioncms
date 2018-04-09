package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.SecondModule;
import com.pollutioncms.module.domain.SecondModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecondModuleMapper {
    long countByExample(SecondModuleExample example);

    int deleteByExample(SecondModuleExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(SecondModule record);

    int insertSelective(SecondModule record);

    List<SecondModule> selectByExample(SecondModuleExample example);

    SecondModule selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") SecondModule record, @Param("example") SecondModuleExample example);

    int updateByExample(@Param("record") SecondModule record, @Param("example") SecondModuleExample example);

    int updateByPrimaryKeySelective(SecondModule record);

    int updateByPrimaryKey(SecondModule record);
}
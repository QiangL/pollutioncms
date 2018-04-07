package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.Navigation;
import com.pollutioncms.module.domain.NavigationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NavigationMapper {
    long countByExample(NavigationExample example);

    int deleteByExample(NavigationExample example);

    int insert(Navigation record);

    int insertSelective(Navigation record);

    List<Navigation> selectByExample(NavigationExample example);

    int updateByExampleSelective(@Param("record") Navigation record, @Param("example") NavigationExample example);

    int updateByExample(@Param("record") Navigation record, @Param("example") NavigationExample example);
}
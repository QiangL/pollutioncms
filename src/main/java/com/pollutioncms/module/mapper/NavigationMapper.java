package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.Navigation;
import com.pollutioncms.module.domain.NavigationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface NavigationMapper extends Mapper<Navigation> {
    long countByExample(NavigationExample example);

    int deleteByExample(NavigationExample example);

    List<Navigation> selectByExample(NavigationExample example);

    int updateByExampleSelective(@Param("record") Navigation record, @Param("example") NavigationExample example);

    int updateByExample(@Param("record") Navigation record, @Param("example") NavigationExample example);
}
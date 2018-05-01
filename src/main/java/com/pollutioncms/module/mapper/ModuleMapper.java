package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.Module;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Set;

public interface ModuleMapper extends Mapper<Module> {

    List<Module> listModuleAuths(@Param("roleNames") Set<String> roleNames);

    List<Integer> checkAuthIds(@Param("ids") Set<Integer> ids);
}
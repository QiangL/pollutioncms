package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.Module;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ModuleMapper extends Mapper<Module> {

    List<Module> listModuleAuths(@Param("roleName") String roleName);

    List<Integer> checkAuthIds(@Param("ids") List<Integer> ids);
}
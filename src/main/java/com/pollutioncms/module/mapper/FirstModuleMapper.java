package com.pollutioncms.module.mapper;

import com.pollutioncms.module.domain.FirstModule;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * FirstModule Dao.
 * 非特殊说明，所有方法返回的FirstModule对象不包含List<SecondModule>成员
 */
public interface FirstModuleMapper extends Mapper<FirstModule> {

    /**
     * 获取包含第二级模块的列表
     * @return
     */
    List<FirstModule> selectAllWithSecondModules();
}
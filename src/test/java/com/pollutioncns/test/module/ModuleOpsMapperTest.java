package com.pollutioncns.test.module;

import com.pollutioncms.module.domain.Module;
import com.pollutioncms.module.domain.ModuleOperate;
import com.pollutioncms.module.mapper.ModuleMapper;
import com.pollutioncms.module.mapper.ModuleOperateMapper;
import com.pollutioncns.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liqiag
 * @discription ModuleOpsMapperTest
 * @date 2018-04-28
 **/
public class ModuleOpsMapperTest extends BaseTest {

    @Autowired
    private ModuleMapper moduleMapper;

    @Test
    public void test() {
        Module module = new Module();
        module.setName("tset");
        module.setParentUuid("1");
        moduleMapper.insert(module);
    }
}

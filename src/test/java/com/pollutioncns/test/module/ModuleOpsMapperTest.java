package com.pollutioncns.test.module;

import com.pollutioncms.module.domain.Module;
import com.pollutioncms.module.mapper.ModuleMapper;
import com.pollutioncns.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;

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
        List<Module> list = moduleMapper.selectAll();
        System.out.println(list);
    }

}

package com.pollutioncns.test.service.api;

import com.pollutioncms.service.api.RoleService;
import com.pollutioncms.service.dto.Response;
import com.pollutioncms.service.dto.RoleDTO;
import com.pollutioncns.test.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liqiag
 * @discription RoleServiceTest
 * @date 2018-04-20
 **/
public class RoleServiceTest extends BaseTest{

    @Autowired
    RoleService roleService;

    @Test
    public void test(){
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setRoleName("testMe");

        //response = roleService.deleteRole(roleDTO);
        Response<Void> response = roleService.saveRole(roleDTO);
        //Response<Void> response1 = roleService.saveRole(roleDTO);
        Assert.assertEquals(response.isSuccess(), true);
        System.out.println("-------------------------"+response.getErrorCodes());
    }
}

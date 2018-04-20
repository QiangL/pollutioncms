package com.pollutioncms.web.controller;

import com.alibaba.fastjson.JSONArray;
import com.pollutioncms.service.api.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.pollutioncms.web.contants.Contants.NUM_EACH_PAGE;

/**
 * @author liqiag
 * @discription RoleController
 * @date 2018-04-20
 **/
@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/listRoles")
    public String listRoles(@RequestParam("pageNum") Integer pageNum, @RequestParam("count") Integer count) {
        if (pageNum == null) {
            pageNum = 0;
        }
        if (count == null) {
            count = NUM_EACH_PAGE;
        }
        return JSONArray.toJSONString(roleService.listRoles(pageNum, count));
    }

}

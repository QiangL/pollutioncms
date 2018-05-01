package com.pollutioncms.web.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.pollutioncms.service.api.ModuleService;
import com.pollutioncms.web.enums.RespError;
import com.pollutioncms.web.module.Response;
import com.pollutioncms.web.utils.LigerTreeVOUtil;
import com.pollutioncms.web.vo.LigerTreeVO;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author liqiag
 * @discription NavigationController
 * @date 2018-04-30
 **/
@RestController
@RequestMapping("/framework/navigation")
public class NavigationController {

    @Autowired
    private ModuleService moduleService;

    @GetMapping("/listAllAuths.mvc")
    public List<LigerTreeVO> listAllAuths() {
        return LigerTreeVOUtil.fill(moduleService.listAllAuths());

    }

    @GetMapping("/listRoleAuths.mvc")
    @RequiresPermissions("navigation:listRoleAuths")
    public List<LigerTreeVO> queryRoleAuths(@RequestParam("roleName") String roleName) {
        if (roleName == null) {
            return new ArrayList<>();
        }
        return LigerTreeVOUtil.fill(moduleService.listModuleAuths(roleName));
    }

    @PostMapping("/updateNavigation.mvc")
    @RequiresPermissions("navigation:update")
    public Response<?> updateNavigation(@RequestBody Map<String, Object> map) {
        String roleName = (String)map.get("roleName");
        JSONArray ids = (JSONArray) map.get("ids");
        if (roleName == null || ids == null) {
            return Response.failResp(RespError.PARAM_WRONG);
        }
        List<Integer> intIds = new ArrayList<>();
        for (int i = 0; i < ids.size(); i++) {
            JSONObject obj = (JSONObject) ids.get(i);
            if (obj.getBoolean("leaf")) {
                intIds.add(obj.getInteger("id"));
            }
            JSONArray children = (JSONArray) obj.get("children");
            if (children != null && children.size() > 0) {
                ids.addAll(children);
            }
        }
        if (moduleService.checkAuthIds(intIds).size() != 0) {
            return Response.failResp(RespError.PARAM_WRONG);
        }
        moduleService.updateRoleAuths(roleName, intIds);
        return Response.succResp();
    }
}

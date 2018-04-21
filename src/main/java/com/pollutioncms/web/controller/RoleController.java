package com.pollutioncms.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.pollutioncms.service.api.RoleService;
import com.pollutioncms.service.dto.RoleDTO;
import com.pollutioncms.service.dto.UserDTO;
import com.pollutioncms.web.contants.Contants;
import com.pollutioncms.web.module.Response;
import com.pollutioncms.web.utils.BindErrorHandler;
import com.pollutioncms.web.validator.RoleDTOValidator;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.groups.Default;

import static com.pollutioncms.web.contants.Contants.NUM_EACH_PAGE;

/**
 * 角色管理的Controller
 * @author liqiag
 * @discription RoleController
 * @date 2018-04-20
 **/
@RestController
@RequestMapping("/role")
public class RoleController {
    private static final Logger logger = LoggerFactory.getLogger(RoleController.class);

    @Autowired
    private RoleService roleService;

    @GetMapping("/listRoles")
    @RequiresPermissions("role:list")
    public String listRoles(@RequestParam("pageNum") Integer pageNum, @RequestParam("count") Integer count) {
        if (pageNum == null) {
            pageNum = 0;
        }
        if (count == null) {
            count = NUM_EACH_PAGE;
        }
        return JSONObject.toJSONString(Response.succResp(roleService.listRoles(pageNum, count)));
    }

    @PostMapping("/addRole")
    @RequiresPermissions("role:add")
    public String addRole(@RequestParam("role") @Validated RoleDTO roleDTO, BindingResult result) {
        if (result.hasErrors()) {
            return BindErrorHandler.handler(result.getAllErrors());
        }
        logger.info("add role,dto:{}",roleDTO);
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        roleService.saveRole(((UserDTO)session.getAttribute(Contants.USER)).getUserName(),roleDTO);
        return Response.succResp().toJSON();
    }

    @PostMapping("/deleteRole")
    @RequiresPermissions("role:delete")
    public String deleteRole(@RequestParam @Validated(value = {Default.class, RoleDTOValidator.NeedId.class}) RoleDTO roleDTO,
                             BindingResult result) {

        if (result.hasErrors()) {
            return BindErrorHandler.handler(result.getAllErrors());
        }
        logger.info("delete role,dto:{}",roleDTO);
        roleService.deleteRole(roleDTO);
        return Response.succResp().toJSON();
    }

    @PostMapping("/updateRole")
    @RequiresPermissions("role:update")
    public String updateRole(@RequestParam @Validated(value = {Default.class, RoleDTOValidator.NeedId.class}) RoleDTO roleDTO,
                             BindingResult result) {

        if (result.hasErrors()) {
            return BindErrorHandler.handler(result.getAllErrors());
        }
        logger.info("update role,dto:{}",roleDTO);
        roleService.updateRole(roleDTO);
        return Response.succResp().toJSON();
    }
}

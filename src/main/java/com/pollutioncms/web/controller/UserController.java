package com.pollutioncms.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.pollutioncms.service.api.UserService;
import com.pollutioncms.service.api.UserService;
import com.pollutioncms.service.dto.UserDTO;
import com.pollutioncms.service.dto.UserDTO;
import com.pollutioncms.web.module.Response;
import com.pollutioncms.web.utils.BindErrorHandler;
import com.pollutioncms.web.validator.UserDTOValidator;
import com.pollutioncms.web.vo.LigerGridVo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.groups.Default;

import static com.pollutioncms.web.contants.Contants.NUM_EACH_PAGE;

/**
 * 用户管理的controller
 * @author liqiag
 * @discription UserController
 * @date 2018-04-21
 **/
@RestController
@RequestMapping("/framework/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/listUsers.mvc")
    @RequiresPermissions("user:list")
    public LigerGridVo<?> listUsers(@RequestParam(value="pageNum",required = false) Integer pageNum,
                                    @RequestParam(value="count",required = false) Integer count,
                                    @RequestParam(value="roleName",required = false) String roleName) {
        if (pageNum == null) {
            pageNum = 0;
        }
        if (count == null) {
            count = NUM_EACH_PAGE;
        }
        if (roleName == null) {
            return LigerGridVo.Resp(userService.listUser(pageNum, count), userService.getCount());
        }else{
            return LigerGridVo.Resp(userService.listUserByRole(roleName, pageNum, count), userService.getCount());
        }
        
    }

    @PostMapping("/addUser.mvc")
    @RequiresPermissions("user:add")
    public Response<?> addUser(@RequestParam("user") @Validated UserDTO userDTO, BindingResult result) {
        if (result.hasErrors()) {
            return BindErrorHandler.handler(result.getAllErrors());
        }
        logger.info("add user,dto:{}",userDTO);
        userService.saveUser(userDTO);
        return Response.succResp();
    }

    @PostMapping("/deleteUser.mvc")
    @RequiresPermissions("user:delete")
    public Response<?> deleteUser(@RequestParam @Validated(value = {Default.class, UserDTOValidator.NeedId.class}) UserDTO userDTO,
                             BindingResult result) {

        if (result.hasErrors()) {
            return BindErrorHandler.handler(result.getAllErrors());
        }
        logger.info("delete user,dto:{}",userDTO);
        userService.deleteUser(userDTO);
        return Response.succResp();
    }

    @PostMapping("/updateUser.mvc")
    @RequiresPermissions("user:update")
    public Response<?> updateUser(@RequestParam @Validated(value = {Default.class, UserDTOValidator.NeedId.class}) UserDTO userDTO,
                             BindingResult result) {

        if (result.hasErrors()) {
            return BindErrorHandler.handler(result.getAllErrors());
        }
        logger.info("update user,dto:{}",userDTO);
        userService.updateUser(userDTO);
        return Response.succResp();
    }
}

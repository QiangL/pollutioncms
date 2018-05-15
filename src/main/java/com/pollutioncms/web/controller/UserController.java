package com.pollutioncms.web.controller;

import com.pollutioncms.service.api.RoleService;
import com.pollutioncms.service.api.UserService;
import com.pollutioncms.service.dto.UserDTO;
import com.pollutioncms.web.enums.RespError;
import com.pollutioncms.web.module.Response;
import com.pollutioncms.web.utils.BindErrorHandler;
import com.pollutioncms.service.dto.validator.UserDTOValidator;
import com.pollutioncms.web.vo.LigerGridVo;
import com.pollutioncms.web.vo.UserRequestVO;
import com.pollutioncms.web.vo.UserResponseVO;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.groups.Default;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static com.pollutioncms.web.contants.Constants.NUM_EACH_PAGE;

/**
 * 用户管理的controller
 *
 * @author liqiag
 * @discription UserController
 * @date 2018-04-21
 **/
@RestController
@RequestMapping("/authManage/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @GetMapping("/listUsers.mvc")
    @RequiresPermissions("user:list")
    public LigerGridVo<?> listUsers(@RequestParam(value = "pageNum", required = false) Integer pageNum,
                                    @RequestParam(value = "count", required = false) Integer count,
                                    @RequestParam(value = "roleName", required = false) String roleName) {
        if (pageNum == null) {
            pageNum = 0;
        }
        if (count == null) {
            count = NUM_EACH_PAGE;
        }
        if (roleName == null) {
            return LigerGridVo.Resp(fillVOs(userService.listUser(pageNum, count)), userService.getCount());
        } else {
            return LigerGridVo.Resp(fillVOs(userService.listUserByRole(roleName, pageNum, count)), userService.getCount());
        }

    }

    @PostMapping("/addUser.mvc")
    @RequiresPermissions("user:add")
    public Response<?> addUser(@RequestBody @Validated UserRequestVO userRequestVO, BindingResult result) {
        if (result.hasErrors()) {
            return BindErrorHandler.handler(result.getAllErrors());
        }
        if ((userRequestVO.getPwd() == null && userRequestVO.getPwd2() != null) ||
                (userRequestVO.getPwd() != null && userRequestVO.getPwd2() ==null) ||
                (userRequestVO.getPwd() != null && !userRequestVO.getPwd().equals(userRequestVO.getPwd2()))) {
            return Response.failResp(RespError.PASSWORD_ERROR);
        }
        if(userService.checkUserName(userRequestVO.getUserName())){
            return Response.failResp(RespError.USER_NAME_DUPLICATE);
        }
        logger.info("add user,vo:{}", userRequestVO);
        userService.saveUser(userRequestVO.toDTO());
        return Response.succResp();
    }

    @PostMapping("/deleteUser.mvc")
    @RequiresPermissions("user:delete")
    public Response<?> deleteUser(@RequestBody @Validated(value = {Default.class, UserDTOValidator.NeedId.class}) UserRequestVO userRequestVO,
                                  BindingResult result) {

        if (result.hasErrors()) {
            return BindErrorHandler.handler(result.getAllErrors());
        }
        logger.info("delete user,vo:{}", userRequestVO);
        userService.deleteUser(userRequestVO.toDTO());
        return Response.succResp();
    }

    @PostMapping("/updateUser.mvc")
    @RequiresPermissions("user:update")
    public Response<?> updateUser(@RequestBody @Validated(value = {Default.class, UserDTOValidator.NeedId.class}) UserRequestVO userRequestVO,
                                  BindingResult result) {

        if (result.hasErrors()) {
            return BindErrorHandler.handler(result.getAllErrors());
        }
        if ((userRequestVO.getPwd() == null && userRequestVO.getPwd2() != null) ||
                (userRequestVO.getPwd() != null && userRequestVO.getPwd2() ==null) ||
                (userRequestVO.getPwd() != null && !userRequestVO.getPwd().equals(userRequestVO.getPwd2()))) {
            return Response.failResp(RespError.PASSWORD_ERROR);
        }
        if("".equals(userRequestVO.getPwd())){
            userRequestVO.setPwd(null);
        }

        logger.info("update user,vo:{}", userRequestVO);
        userService.updateUserSelective(userRequestVO.toDTO());
        return Response.succResp();
    }

    @PostMapping("/modifyRoles.mvc")
    @RequiresPermissions("user:modifyRoles")
    public Response<?> addRoles(@RequestParam("roleNames") Set<String> roleNames, @RequestParam("userName") String userName) {
        Set<String> notExitRoleNames = roleService.notExitRoleNames(roleNames);
        if (notExitRoleNames.size() != 0) {
            return Response.failResp(RespError.ROLE_NAME_NOT_EXIT.getErrorCode() + notExitRoleNames);
        }
        if (userService.getUser(userName) == null) {
            return Response.failResp(RespError.USER_NOT_EXIT.getErrorCode() + notExitRoleNames);
        }

        if (roleService.motifyRoles(userName, roleNames)) {
            return Response.succResp();
        }
        return Response.failResp(RespError.OPERATION_FAIL);
    }

    private UserResponseVO fillVO(UserDTO userDTO) {
        UserResponseVO userResponseVO = UserResponseVO.toVO(userDTO);
        userResponseVO.setRoleNames(roleService.queryRoleNames(userDTO.getUserName()));
        return userResponseVO;
    }

    private List<UserResponseVO> fillVOs(List<UserDTO> userDTOS) {
        List<UserResponseVO> userResponseVOList = new ArrayList<>();
        for (UserDTO u : userDTOS) {
            userResponseVOList.add(fillVO(u));
        }
        return userResponseVOList;
    }

}

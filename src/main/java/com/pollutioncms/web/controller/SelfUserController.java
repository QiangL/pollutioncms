package com.pollutioncms.web.controller;

import com.pollutioncms.service.dto.UserDTO;
import com.pollutioncms.service.dto.validator.UserDTOValidator;
import com.pollutioncms.web.contants.Constants;
import com.pollutioncms.web.module.Response;
import com.pollutioncms.web.vo.UserRequestVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.groups.Default;
import java.util.Map;

/**
 * 用户自我信息的页面
 *
 * @author liqiag
 * @discription SelfUserController
 * @date 2018-05-06
 **/
@Controller
@RequestMapping("/selfUser")
public class SelfUserController {

    @Autowired
    private UserController userController;

    @PostMapping("/updateSelf.mvc")
    @ResponseBody
    public Response<?> updateSelf(@RequestBody @Validated(value = {Default.class, UserDTOValidator.NeedId.class}) UserRequestVO userRequestVO,
                                  BindingResult result) {
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        userRequestVO.setRoleName(((UserDTO) session.getAttribute(Constants.USER)).getRoleName());
        return userController.updateUser(userRequestVO, result);
    }

    @GetMapping("/updateSelf.mvc")
    public String getUpdateSelf(Map<String, Object> map) {
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        map.put("user", session.getAttribute(Constants.USER));
        return "systemManage/authManage/modifyUserInfo";
    }
}

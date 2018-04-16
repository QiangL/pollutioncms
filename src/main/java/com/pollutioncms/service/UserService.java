package com.pollutioncms.service;

import com.pollutioncms.module.domain.User;
import com.pollutioncms.service.dto.AuthUserDTO;
import com.pollutioncms.service.dto.LoginUserDTO;
import org.apache.shiro.authz.annotation.RequiresRoles;

import java.util.List;

public interface UserService {

    /**
     * 根据userName查找一个LoginUserDTO
     * @param userName
     * @return
     */
    LoginUserDTO findLoginUser(String userName);

    List<User> listUserByRole(String roleName);

    List<User> listUser();

    AuthUserDTO findAuthUser(String userName);

}

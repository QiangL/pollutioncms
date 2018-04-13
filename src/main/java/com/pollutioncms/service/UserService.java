package com.pollutioncms.service;

import com.pollutioncms.module.domain.User;
import com.pollutioncms.service.dto.AuthUserDTO;
import com.pollutioncms.service.dto.LoginUserDTO;

import java.util.List;

public interface UserService {

    /**
     * 根据userName查找一个LoginUserDTO
     * @param userName
     * @return
     */
    LoginUserDTO findLoginUser(String userName);

    List<User> listUserByRole(Integer roleId);

    List<User> listUser();

    AuthUserDTO findAuthUser(String userName);

}

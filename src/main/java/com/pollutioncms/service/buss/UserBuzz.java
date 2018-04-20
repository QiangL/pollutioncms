package com.pollutioncms.service.buss;

import com.pollutioncms.module.domain.User;
import com.pollutioncms.service.dto.AuthUserDTO;

import java.util.List;

/**
 * @author liqiag
 * @discription UserBuzz
 * @date 2018-04-20
 **/
public interface UserBuzz {

    User getUserByName(String userName);

    List<User> listUserByRole(String roleName, Integer pageNum, Integer count);

    List<User> listUser(Integer pageNum, Integer count);

    AuthUserDTO getAuthUser(String userName);

    boolean saveUser(User user);

    boolean deleteUser(User user);

    boolean updateUser(User user);
}

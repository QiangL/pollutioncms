package com.pollutioncms.service.api;

import com.pollutioncms.service.dto.AuthUserDTO;
import com.pollutioncms.service.dto.LoginUserDTO;
import com.pollutioncms.service.dto.UserDTO;

import java.util.List;

public interface UserService {


    UserDTO getUser(String userName);

    /**
     * 根据userName查找一个LoginUserDTO
     *
     * @param userName
     * @return
     */
    LoginUserDTO getLoginUser(String userName);

    /**
     * 返回一个roleName下所有的user，需要分页
     *
     * @param roleName
     * @return
     */
    List<UserDTO> listUserByRole(String roleName, Integer pageNum, Integer count);

    /**
     * 返回所有user信息
     *
     * @param pageNum
     * @param count
     * @return
     */
    List<UserDTO> listUser(Integer pageNum, Integer count);

    AuthUserDTO getAuthUser(String userName);

    boolean saveUser(UserDTO userDTOv);

    boolean deleteUser(UserDTO userDTO);

    boolean updateUser(UserDTO userDTO);

}

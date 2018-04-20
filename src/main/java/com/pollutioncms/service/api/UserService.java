package com.pollutioncms.service.api;

import com.pollutioncms.service.dto.AuthUserDTO;
import com.pollutioncms.service.dto.LoginUserDTO;
import com.pollutioncms.service.dto.Response;
import com.pollutioncms.service.dto.UserDTO;

import java.util.List;

public interface UserService {

    /**
     * 根据userName查找一个LoginUserDTO
     *
     * @param userName
     * @return
     */
    Response<LoginUserDTO> getLoginUser(String userName);

    /**
     * 返回一个roleName下所有的user，需要分页
     *
     * @param roleName
     * @return
     */
    Response<List<UserDTO>> listUserByRole(String roleName, Integer pageNum, Integer count);

    /**
     * 返回所有user信息
     *
     * @param pageNum
     * @param count
     * @return
     */
    Response<List<UserDTO>> listUser(Integer pageNum, Integer count);

    Response<AuthUserDTO> getAuthUser(String userName);

    Response<Void> saveUser(UserDTO userDTOv);

    Response<Void> deleteUser(UserDTO userDTO);

    Response<Void> updateUser(UserDTO userDTO);

}

package com.pollutioncms.service.api;

import com.pollutioncms.service.dto.AuthUserDTO;
import com.pollutioncms.service.dto.LoginUserDTO;
import com.pollutioncms.service.dto.RoleDTO;
import com.pollutioncms.service.dto.UserDTO;

import java.util.List;
import java.util.Set;

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

    /** 获取User数目 **/
    int getCount();

    boolean saveUser(UserDTO userDTOv);

    /** 逻辑删除，只是将数据库标识位置为删除 **/
    boolean deleteUser(UserDTO userDTO);

    /** 物理删除 **/
    boolean deleteUserPhysic(UserDTO userDTO);

    /** 根据已有不为null的字段更新数据，null的数据不会替换数据库的字段**/
    boolean updateUserSelective(UserDTO userDTO);

}

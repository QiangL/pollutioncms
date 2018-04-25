package com.pollutioncms.service.api;

import com.pollutioncms.service.dto.RoleDTO;

import java.util.List;

/**
 * @author liqiag
 * @discription RoleService
 * @date 2018-04-19
 **/
public interface RoleService {

    List<RoleDTO> listRoles(Integer pageNum, Integer count);

    int getCount();

    boolean saveRole(String parentUserName,RoleDTO roleDTO);

    boolean deleteRole(RoleDTO roleDTO);

    boolean updateRoleSelective(RoleDTO roleDTO);
}

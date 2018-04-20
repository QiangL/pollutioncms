package com.pollutioncms.service.api;

import com.pollutioncms.service.dto.Response;
import com.pollutioncms.service.dto.RoleDTO;

import java.util.List;

/**
 * @author liqiag
 * @discription RoleService
 * @date 2018-04-19
 **/
public interface RoleService {

    List<RoleDTO> listRoles(Integer pageNum, Integer count);

    boolean saveRole(RoleDTO roleDTO);

    boolean deleteRole(RoleDTO roleDTO);

    boolean updateRole(RoleDTO roleDTO);
}

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

    Response<List<RoleDTO>> listRoles(Integer pageNum, Integer count);

    Response<Void> saveRole(RoleDTO roleDTO);

    Response<Void> deleteRole(RoleDTO roleDTO);

    Response<Void> updateRole(RoleDTO roleDTO);
}

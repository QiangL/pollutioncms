package com.pollutioncms.service.api;

import com.pollutioncms.service.dto.RoleDTO;

import java.util.List;
import java.util.Set;

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

    boolean motifyRoles(String userName, Set<String> roleNames);

    Set<String> queryRoleNames(String userName);

    Set<String> queryRoleNames();

    /** 返回表中没有的roleName的集合 **/
    Set<String> notExitRoleNames(Set<String> roleNames);

    boolean checkRoleName(String roleName);
}

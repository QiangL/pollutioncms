package com.pollutioncms.service.buss;

import com.pollutioncms.module.domain.Role;
import com.pollutioncms.service.dto.RoleDTO;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liqiag
 * @discription RoleBuzz
 * @date 2018-04-20
 **/
public interface RoleBuzz {

    List<Role> listRoles(Integer pageNum, Integer count);

    boolean saveRole(Role role);

    boolean deleteRole(Role role);

    boolean updateRole(Role role);
}

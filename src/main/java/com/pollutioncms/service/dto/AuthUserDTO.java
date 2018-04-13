package com.pollutioncms.service.dto;

import java.util.Set;

/**
 * 只针对权限的UserDTO对象
 * @author liqiag
 * @discription AuthUserDTO
 * @date 2018-04-13
 **/
public class AuthUserDTO {

    private String userName;

    private Set<String> roles;

    private Set<String> permissions;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public Set<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<String> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "AuthUserDTO{" +
                "userName='" + userName + '\'' +
                ", roles=" + roles +
                ", permissions=" + permissions +
                '}';
    }
}

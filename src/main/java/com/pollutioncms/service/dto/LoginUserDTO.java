package com.pollutioncms.service.dto;

/**
 * 用于登录校验的UserDTO.
 * 不包含登录无关的属性
 * @author liqiag
 * @discription LoginUserDTO
 * @date 2018-04-13
 **/
public class LoginUserDTO {

    private String userName;

    private String pwd;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "LoginUserDTO{" +
                "userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}

package com.pollutioncms.service.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.shiro.session.Session;

import java.util.Date;

/**
 * @author liqiag
 * @discription OnlineUserDTO
 * @date 2018-05-01
 **/
public class OnlineUserDTO {

    private String sessionId;

    private String userName;

    private Date loginTime;

    private String host;

    private Date lastViewTime;

    public static OnlineUserDTO toDTO(Session session) {
        OnlineUserDTO onlineUserDTO = new OnlineUserDTO();
        onlineUserDTO.setHost(session.getHost());
        onlineUserDTO.setLastViewTime(session.getLastAccessTime());
        onlineUserDTO.setLoginTime(session.getStartTimestamp());
        onlineUserDTO.setUserName(((UserDTO) session.getAttribute("user")).getUserName());
        onlineUserDTO.setSessionId(session.getId().toString());
        return onlineUserDTO;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Date getLastViewTime() {
        return lastViewTime;
    }

    public void setLastViewTime(Date lastViewTime) {
        this.lastViewTime = lastViewTime;
    }
}

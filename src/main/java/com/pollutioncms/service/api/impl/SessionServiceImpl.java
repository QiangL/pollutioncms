package com.pollutioncms.service.api.impl;

import com.pollutioncms.service.api.SessionService;
import com.pollutioncms.service.dto.OnlineUserDTO;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.UnknownSessionException;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author liqiag
 * @discription SessionServiceImpl
 * @date 2018-05-01
 **/
@Service
public class SessionServiceImpl implements SessionService{

    @Autowired
    private SessionDAO sessionDAO;

    public List<OnlineUserDTO> listOnlineUser(){
        Collection<Session> sessionCollecion=sessionDAO.getActiveSessions();
        return toDTOList(sessionCollecion);
    }

    public boolean stopOnlineUser(String sessionId){
        Session session;
        try {
            session = sessionDAO.readSession(sessionId);
        } catch (UnknownSessionException e) {
            return false;
        }
        session.stop();
        return true;
    }

    private List<OnlineUserDTO> toDTOList(Collection<Session> sessions) {
        List<OnlineUserDTO> onlineUserDTOs = new ArrayList<>();
        for (Session s : sessions) {
            onlineUserDTOs.add(OnlineUserDTO.toDTO(s));
        }
        return onlineUserDTOs;
    }
}

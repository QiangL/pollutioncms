package com.pollutioncms.service.api;

import com.pollutioncms.service.dto.OnlineUserDTO;

import java.util.List;

/**
 * @author liqiag
 * @discription SessionService
 * @date 2018-05-01
 **/
public interface SessionService {

    List<OnlineUserDTO> listOnlineUser();

    boolean stopOnlineUser(String sessionId);
}

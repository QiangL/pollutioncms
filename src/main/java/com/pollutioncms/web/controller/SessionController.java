package com.pollutioncms.web.controller;

import com.pollutioncms.service.api.SessionService;
import com.pollutioncms.service.dto.OnlineUserDTO;
import com.pollutioncms.web.enums.RespError;
import com.pollutioncms.web.module.Response;
import com.pollutioncms.web.vo.LigerGridVo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liqiag
 * @discription SessionController
 * @date 2018-05-01
 **/
@RestController
@RequestMapping("/runManage/onlineUser")
public class SessionController {

    @Autowired
    private SessionService sessionService;


    @PostMapping("/stopUser.mvc")
    @RequiresPermissions("onlineUser:stop")
    public Response<?> stopUser(@RequestParam("sessionId") String sessionId) {
        if (sessionService.stopOnlineUser(sessionId)) {
            return Response.succResp();
        }
        return Response.failResp(RespError.OPERATION_FAIL);
    }

    @PostMapping("/listOnlineUsers.mvc")
    @RequiresPermissions("onlineUser:list")
    public LigerGridVo listOnlineUsers() {
        List<OnlineUserDTO> onlineUserDTOS = sessionService.listOnlineUser();
        return LigerGridVo.Resp(onlineUserDTOS, onlineUserDTOS.size());
    }
}

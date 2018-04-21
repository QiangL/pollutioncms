package com.pollutioncms.web.utils;

import com.pollutioncms.web.module.Response;
import org.springframework.validation.ObjectError;

import java.util.ArrayList;
import java.util.List;

/**
 * 绑定失败的响应处理
 * @author liqiag
 * @discription BindErrorHandler
 * @date 2018-04-21
 **/
public class BindErrorHandler {

    public static String handler(List<ObjectError> errorList) {
        List<String> errprResp = new ArrayList<>();
        errorList.forEach((ObjectError err) -> errprResp.add(err.getDefaultMessage()));
        return Response.failResp(errprResp).toJSON();
    }
}

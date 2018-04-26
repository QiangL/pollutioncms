package com.pollutioncms.web.utils;

import com.pollutioncms.web.module.Response;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * 辨别请求是不是Ajax请求的方法
 * @author liqiag
 * @discription AjaxUtils
 * @date 2018-04-25
 **/
public class AjaxUtils {

    private static final String REQUEST_WITH = "X-Requested-With";

    private static final String XMLHTTP_REQUEST = "XMLHttpRequest";

    public static void handleErrorResponse(HttpServletRequest request, HttpServletResponse response, String error) throws IOException {
        handleResponse(request, response, error, "error");
    }
    public static void handleUnAuthResponse(HttpServletRequest request, HttpServletResponse response, String error) throws IOException {
        handleResponse(request, response, error, "unAuth");
    }

    private static void handleResponse(HttpServletRequest request, HttpServletResponse response, String error, String page) throws IOException {
        String requestWith = request.getHeader(REQUEST_WITH);
        if (requestWith != null && XMLHTTP_REQUEST.equals(requestWith)) {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json");
            PrintWriter pw = response.getWriter();
            pw.write(Response.failResp(error).toJSON());
            pw.flush();
            pw.close();
        } else {
            response.sendRedirect(page);
        }
    }
}

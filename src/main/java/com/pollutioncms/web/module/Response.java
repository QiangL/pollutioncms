package com.pollutioncms.web.module;

import com.alibaba.fastjson.JSONObject;
import com.pollutioncms.web.enums.RespError;

import java.util.ArrayList;
import java.util.List;

/**
 * 响应
 *
 * @author liqiag
 * @discription Response
 * @date 2018-04-19
 **/
public class Response<T> {

    private boolean success;

    private List<String> errorCodes;

    private T data;


    public static <T> Response<T> succResp() {
        return new Response<>(true, null);
    }
    public static <T> Response<T> succResp(T date) {
        return new Response<>(true, date);
    }

    public static <T> Response<T> failResp(List<String> errorCodes) {
        Response<T> r = new Response<T>(false, null);
        r.errorCodes = errorCodes;
        return r;
    }

    public static <T> Response<T> failResp(String errorCode) {
        Response<T> r = new Response<>(false, null);
        r.errorCodes = new ArrayList<String>();
        r.errorCodes.add(errorCode);
        return r;
    }

    public static <T> Response<T> failResp(RespError errorCode) {
        return failResp(errorCode.getErrorCode());
    }
    public static <T> Response<T> failResp() {
        Response<T> r = new Response<>(false, null);
        r.errorCodes = new ArrayList<String>();
        r.errorCodes.add(RespError.OPERATION_FAIL.getErrorCode());
        return r;
    }

    public T getData() {
        if (success) {
            return data;
        } else {
            throw new UnsupportedOperationException("response fail,no data");
        }
    }

    public boolean isSuccess() {
        return success;
    }

    public List<String> getErrorCodes() {
        return errorCodes;
    }

    private Response(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public String toJSON() {
        return JSONObject.toJSONString(this);
    }

}

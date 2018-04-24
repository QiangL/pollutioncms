package com.pollutioncms.web.bind.method;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.pollutioncms.web.bind.annotation.JSONParam;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * @author liqiag
 * @discription JSONParamArgumentResolver
 * @date 2018-04-24
 **/
public class JSONParamArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(JSONParam.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        JSONParam jsonParam=parameter.getParameterAnnotation(JSONParam.class);
        String json = webRequest.getParameter(jsonParam.value());
        Class<?> clazz = jsonParam.clazz();
        return JSONObject.parseObject(json).toJavaObject(clazz);

    }
}

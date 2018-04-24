package com.pollutioncms.web.bind.annotation;

import java.lang.annotation.*;

/**
 * 用作JSON格式参数的组装
 * @author liqiag
 * @discription JSONParam
 * @date 2018-04-24
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface JSONParam {
    String value() default "";

    Class<?> clazz() ;
}

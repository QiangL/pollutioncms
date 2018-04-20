package com.pollutioncms.service.aop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用于声明日志的注解
 * @author liqiag
 * @discription NeedLog
 * @date 2018-04-19
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NeedLog {
    String value() default "";

}

package com.pollutioncms.service.aop.advisor;

import com.pollutioncms.service.aop.annotation.NeedLog;
import com.pollutioncms.service.dto.RoleDTO;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * 日志的aop
 *
 * @author liqiag
 * @discription LogAop
 * @date 2018-04-19
 **/
@Aspect
public class LogAop {

    private static final Logger logger= LoggerFactory.getLogger(LogAop.class);

    @Before(value = "@annotation(com.pollutioncms.service.aop.annotation.NeedLog)")
    public void validate(JoinPoint joinPoint) {
        logger.info("login info:{}", Arrays.toString(joinPoint.getArgs()));
    }
}

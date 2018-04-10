package com.test;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedBloceDemo {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(SynchronizedBloceDemo.class);

        logger.error("this is a error log");
        List<Date> list=Arrays.asList(new Date(), new Date());

    }
}


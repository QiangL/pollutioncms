package com.pollutioncms.service.utils;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.*;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liqiag
 * @discription BeanUtilsExt
 * @date 2018-04-19
 **/
public class BeanUtilsExt extends BeanUtils {
    static{
        ConvertUtils.register(new LongConverter(null), Long.class);
        ConvertUtils.register(new ShortConverter(null), Short.class);
        ConvertUtils.register(new IntegerConverter(null), Integer.class);
        ConvertUtils.register(new DoubleConverter(null), Double.class);
        ConvertUtils.register(new BigDecimalConverter(null), BigDecimal.class);
        ConvertUtils.register(new DateConverter(null),Date.class);
    }

    //覆盖父类方法
    public static void copyProperties(final Object dest, final Object orig)
            throws IllegalAccessException, InvocationTargetException {
        BeanUtils.copyProperties(dest,orig);
    }

}

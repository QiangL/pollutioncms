package com.pollutioncms.exception;

import com.pollutioncms.enums.ExceptionEnum;

/**
 * 数据访问异常
 */
public class DaoException extends BaseException {

    public DaoException(){
        super(ExceptionEnum.DaoException);
    }

}

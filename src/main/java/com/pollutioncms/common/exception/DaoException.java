package com.pollutioncms.common.exception;

import com.pollutioncms.common.enums.ExceptionEnum;

/**
 * 数据访问异常
 */
public class DaoException extends BaseException {

    public DaoException(){
        super(ExceptionEnum.DaoException);
    }

    public DaoException(ExceptionEnum exceptionEnum){
        super(exceptionEnum);
    }

}

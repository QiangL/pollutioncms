package com.pollutioncms.exception;

import com.pollutioncms.enums.ExceptionEnum;

/**
 * @author liqiag
 * @discription CopyPropertiesxception
 * @date 2018-04-13
 **/
public class CopyPropertiesxception extends BaseException {
    public CopyPropertiesxception(){
        super(ExceptionEnum.CopyPropertiesException);
    }
    public CopyPropertiesxception(Throwable throwable){
        super(ExceptionEnum.CopyPropertiesException,throwable);
    }
}

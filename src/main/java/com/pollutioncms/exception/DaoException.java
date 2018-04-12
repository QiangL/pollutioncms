package com.pollutioncms.exception;

/**
 * 数据访问异常
 */
public class DaoException extends BaseException {

    public DaoException(Exception e) {
        super("dao exception", e.getMessage());
    }

}

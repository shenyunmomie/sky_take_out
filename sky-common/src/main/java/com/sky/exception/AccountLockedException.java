package com.sky.exception;

/**
 * 账户锁定异常
 */
public class AccountLockedException extends BaseException{

    public AccountLockedException() {

    }

    public AccountLockedException(String msg){
        super(msg);
    }
}

package com.atmae.database.service.ex;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 20:40
 * @Description:
 */
public class PasswordNotMatchException extends RuntimeException{
    public PasswordNotMatchException() {
    }

    public PasswordNotMatchException(String message) {
        super(message);
    }

    public PasswordNotMatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordNotMatchException(Throwable cause) {
        super(cause);
    }

    public PasswordNotMatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

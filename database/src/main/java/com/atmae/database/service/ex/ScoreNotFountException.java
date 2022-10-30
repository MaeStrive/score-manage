package com.atmae.database.service.ex;

/**
 * @Author: Mae
 * @Date: 2022/6/21
 * @Time: 21:13
 * @Description:
 */
public class ScoreNotFountException extends RuntimeException{
    public ScoreNotFountException() {
    }

    public ScoreNotFountException(String message) {
        super(message);
    }

    public ScoreNotFountException(String message, Throwable cause) {
        super(message, cause);
    }

    public ScoreNotFountException(Throwable cause) {
        super(cause);
    }

    public ScoreNotFountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

package com.atmae.database.service.ex;

/**
 * @Author: Mae
 * @Date: 2022/6/23
 * @Time: 18:59
 * @Description:
 */
public class CourseWasEleException extends RuntimeException{
    public CourseWasEleException() {
    }

    public CourseWasEleException(String message) {
        super(message);
    }

    public CourseWasEleException(String message, Throwable cause) {
        super(message, cause);
    }

    public CourseWasEleException(Throwable cause) {
        super(cause);
    }

    public CourseWasEleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

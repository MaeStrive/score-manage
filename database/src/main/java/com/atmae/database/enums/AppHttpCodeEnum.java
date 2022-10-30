package com.atmae.database.enums;

/**
 * @Author: Mae
 * @Date: 2022/2/16
 * @Time: 15:11
 * @Description:
 */

/**
 * @author Mae
 */
public enum AppHttpCodeEnum {
    /**
     * 成功
     */
    SUCCESS(200, "操作成功"),
    /**
     * 自定义：最后一个注意用分号
     */

    SYSTEM_ERROR(500, "系统错误");

    int code;
    String msg;

    AppHttpCodeEnum(int code, String errorMessage) {
        this.code = code;
        this.msg = errorMessage;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

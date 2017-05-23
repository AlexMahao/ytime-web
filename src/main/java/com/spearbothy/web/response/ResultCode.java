package com.spearbothy.web.response;

/**
 * Created by Alex_MaHao on 2017/5/23.
 */
public enum ResultCode {
    /** 成功 */
    SUCCESS(0, "成功"),

    ERROR_DEFAULT(1,"服务器错误"),

    ERROR_REQUEST_PARAMS (2, "参数不合法");

    private ResultCode(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public int code() {
        return code;
    }

    public String msg() {
        return msg;
    }

    private int code;
    private String msg;

    }

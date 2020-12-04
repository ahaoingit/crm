package com.brainyi.domain;

public class Result {
    //状态码
    public static final  int SUCCESS = 1;
    public static final int FAILS = 0;
    //token 为空
    public static final int TOKENISNULL=3;
    //token 违法验证失败
    public static final int TOKENVERIFYFAILD=4;
    //键失效
    public static final int TOKENTIMEOUT=5;
    private int code;
    private String message;
    private Object obj;

    public Result() {
    }

    public Result(int code, String message, Object obj) {
        this.code = code;
        this.message = message;
        this.obj = obj;
    }

    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", obj=" + obj +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}

package com.kingja.tickethelper.entiy;

/**
 * Description:TODO
 * Create Time:2018/5/11 13:24
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class HttpResult<T> {
    private int code;
    private String message;
    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

package com.clownly.java.common.http;

/**
 * @author clownly
 * @create 2021-01-14 14:45
 */
public enum ResultStatus {
    OK("操作成功",200),
    ERROR("操作失败",400),
    ;


    private String message;
    private Integer status;


    ResultStatus(String message, Integer status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

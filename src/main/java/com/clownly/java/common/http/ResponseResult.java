package com.clownly.java.common.http;

import sun.security.provider.certpath.OCSPResponse;

import java.util.HashMap;

/**
 * @author clownly
 * @create 2021-01-14 14:45
 */

/**
 * 用来描述返回给前端的response数据
 * 版本一：继承自HashMap<String,Object>
 * 版本二：使用泛型
 */
public class ResponseResult<T>  {

//
//    final String DATA = "data";
//    final String MSG = "message";
//    final String STATUS = "status";

    private Integer status;
    private String message;
    private T data;


    private ResponseResult(){}

    private ResponseResult(ResultStatus status){

        this.setMessage(status.getMessage());
        this.setStatus(status.getStatus());
    }

    public static ResponseResult success(){
        return setData(ResultStatus.OK,null);
    }

    public static <T> ResponseResult<T> success(T data){
        return setData(ResultStatus.OK, data);
    }

    public static ResponseResult error(){
        return setData(ResultStatus.ERROR, null);
    }

    public static <T> ResponseResult<T> error(T data){
        return setData(ResultStatus.ERROR,data);
    }

    private static <T> ResponseResult<T> setData(ResultStatus resultStatus, T data){
        ResponseResult<T> responseResult = new ResponseResult<>(resultStatus);
        responseResult.setData(data);
        return responseResult;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

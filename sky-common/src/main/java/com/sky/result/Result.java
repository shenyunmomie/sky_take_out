package com.sky.result;

import lombok.Data;

import java.io.Serializable;

/**
 * 后端统一返回结果
 * @param <T>
 */
@Data
public class Result<T> implements Serializable {

    private Integer code; //返回码：1成功，0和其他为失败
    private String msg; //错误信息
    private T data; //返回数据

    //成功，无数据
    public static <T> Result<T> success(){
        Result<T> result = new Result<T>();
        result.code = 1;
        return result;
    }

    //成功，有数据
    public static <T> Result<T> success(T object){
        Result<T> result = new Result<T>();
        result.code = 1;
        result.data = object;
        return result;
    }

    //失败，加失败信息
    public static <T> Result<T> error(String msg){
        Result result = new Result();
        result.code = 0;
        result.msg = msg;
        return result;
    }
}

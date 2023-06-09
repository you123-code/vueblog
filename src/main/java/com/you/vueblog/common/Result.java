package com.you.vueblog.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author youwei
 * @version 1.0
 * @date 2023/6/7 13:44
 */
@Data
public class Result implements Serializable {

    private int code;
    private String msg;
    private Object data;

    public static Result succ(Object data){
        return succ(200,"成功",data);
    }

    public static Result fail(String msg){
        return succ(400,msg,null);
    }

    public static Result fail(int code,String msg){
        return succ(code,msg,null);
    }

    public static Result succ(int code,String msg,Object data){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}

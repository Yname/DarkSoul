package com.y.DarkSoul.yzz.common;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Data
@Component
public class Result implements Serializable {

    private int code;
    private String msg;
    private Object data;



//    private Result(int code, String msg, Object data){
//        this.code = code;
//        this.msg = msg;
//        this.data = data;
//    }
//
//    private Result(int code, String msg){
//        new Result(code,msg,null);
//    }
////    用于操作成功
//    public static Result suc(String msg,Object data) {
//        return new Result(200, msg, data);
//    }
//
//    public static Result suc(Object data){
//       return suc("操作成功！",data);
//    }
////    用于操作失败
//    public static Result fail(String msg){
//        return new Result(500,msg);
//    }
//
//    public Result getResult(){
//        return new Result(code,msg,data);
//    }

    public static Result suc(int code,String msg,Object data){
        Result result = new Result();
        result.setMsg(msg);
        result.setCode(code);
        result.setData(data);
        return result;
    }
    public static Result suc(Object data){
        if (data == null){
            return suc(500,"操作失败！",null);
        }
        return suc(200,"操作成功！",data);
    }



//    public static Result fail(int code,String msg,Object data){
//        Result result = new Result();
//        result.setMsg(msg);
//        result.setCode(code);
//        result.setData(data);
//        return result;
//    }
//    public static Result fail(Object data){
//        return suc(500,"操作异常！",data);
//    }


}

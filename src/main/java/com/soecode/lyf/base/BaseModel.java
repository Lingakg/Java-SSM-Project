package com.soecode.lyf.base;

import com.soecode.lyf.entity.Student;
import redis.clients.jedis.Jedis;

import javax.websocket.Session;
import java.nio.channels.SeekableByteChannel;
import java.util.HashMap;
import java.util.Map;

public class BaseModel {

    private Object data;    //数据
    private String message; //响应信息
    private int status;     //状态码
    private String result;  //结果


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public BaseModel() {
    }

/**
 * 处理不需要提示消息的数据
 * */
    public  BaseModel(Object data) {
        this.status = 200;
        this.data = data;
        this.result = "success";
        this.message = "ok";
    }
/**
 * 处理带消息的数据
 * */
    public BaseModel(  String message, Object data) {
        this.status = 200;
        this.data = data;
        this.result = "success";
        this.message = message;
    }

}

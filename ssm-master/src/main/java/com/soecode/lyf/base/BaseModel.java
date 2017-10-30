package com.soecode.lyf.base;

import com.soecode.lyf.entity.Student;

import java.util.HashMap;
import java.util.Map;

public class BaseModel {

    private Object data;
    private String message;
    private int status;
    private String result;


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

    public  BaseModel(Object data) {
        this.status = 200;
        this.data = data;
        this.result = "success";
        this.message = "ok";
    }

    public BaseModel(  String message, Object data) {
        this.status = 500;
        this.data = data;
        this.result = "fail";
        this.message = message;
    }

}

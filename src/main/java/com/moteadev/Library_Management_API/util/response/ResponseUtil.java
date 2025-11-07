package com.moteadev.Library_Management_API.util.response;

public class ResponseUtil<T> {
    private boolean state;
    private String message;
    private T data;


    public ResponseUtil(boolean state, String message, T data) {
        this.state = state;
        this.message = message;
        this.data = data;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
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

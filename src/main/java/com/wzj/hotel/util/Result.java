package com.wzj.hotel.util;


public class Result {
  private String message;
  private Object data;
  private int code;
  private int total;

  public Result(){}

  public Result(String message, Object data, int code, int total) {
    this.message = message;
    this.data = data;
    this.code = code;
    this.total = total;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  @Override
  public String toString() {
    return "Result{" +
            "message='" + message + '\'' +
            ", data=" + data +
            ", code=" + code +
            ", total=" + total +
            '}';
  }
}

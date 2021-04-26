package com.wzj.hotel.entity;

public class Book {
  private int bid;
  private int uid;
  private int hid;
  private String inDay;
  private String outDay;
  private int days;
  private int state;
  private String pIdentity;
  private String pname;
  private String phone;
  private int money;
  private String htype;
  private int rid;
  private int roomNo;
  private int method;

  public Book(){}

  public Book(int bid, int uid, int hid, String inDay, String outDay, int days, int state, String pIdentity, String pname, String phone, int money, String htype, int rid, int roomNo, int method) {
    this.bid = bid;
    this.uid = uid;
    this.hid = hid;
    this.inDay = inDay;
    this.outDay = outDay;
    this.days = days;
    this.state = state;
    this.pIdentity = pIdentity;
    this.pname = pname;
    this.phone = phone;
    this.money = money;
    this.htype = htype;
    this.rid = rid;
    this.roomNo = roomNo;
    this.method = method;
  }

  public int getBid() {
    return bid;
  }

  public void setBid(int bid) {
    this.bid = bid;
  }

  public int getUid() {
    return uid;
  }

  public void setUid(int uid) {
    this.uid = uid;
  }

  public int getHid() {
    return hid;
  }

  public void setHid(int hid) {
    this.hid = hid;
  }

  public String getInDay() {
    return inDay;
  }

  public void setInDay(String inDay) {
    this.inDay = inDay;
  }

  public String getOutDay() {
    return outDay;
  }

  public void setOutDay(String outDay) {
    this.outDay = outDay;
  }

  public int getDays() {
    return days;
  }

  public void setDays(int days) {
    this.days = days;
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }

  public String getpIdentity() {
    return pIdentity;
  }

  public void setpIdentity(String pIdentity) {
    this.pIdentity = pIdentity;
  }

  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phoen) {
    this.phone = phoen;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public String getHtype() {
    return htype;
  }

  public void setHtype(String htype) {
    this.htype = htype;
  }

  public int getRid() {
    return rid;
  }

  public void setRid(int rid) {
    this.rid = rid;
  }

  public int getRoomNo() {
    return roomNo;
  }

  public void setRoomNo(int roomNo) {
    this.roomNo = roomNo;
  }

  public int getMethod() {
    return method;
  }

  public void setMethod(int method) {
    this.method = method;
  }

  @Override
  public String toString() {
    return "Book{" +
            "bid=" + bid +
            ", uid=" + uid +
            ", hid=" + hid +
            ", inDay='" + inDay + '\'' +
            ", outDay='" + outDay + '\'' +
            ", days=" + days +
            ", state=" + state +
            ", pIdentity='" + pIdentity + '\'' +
            ", pname='" + pname + '\'' +
            ", phone='" + phone + '\'' +
            ", money=" + money +
            ", htype='" + htype + '\'' +
            ", rid=" + rid +
            ", roomNo=" + roomNo +
            ", method=" + method +
            '}';
  }
}

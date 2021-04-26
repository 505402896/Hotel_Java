package com.wzj.hotel.entity;

public class Room {
  private int rid;
  private int hid;
  private String htype;
  private int roomNo;

  public Room(int rid, int hid, String htype, int roomNo) {
    this.rid = rid;
    this.hid = hid;
    this.htype = htype;
    this.roomNo = roomNo;
  }

  public int getRid() {
    return rid;
  }

  public void setRid(int rid) {
    this.rid = rid;
  }

  public int getHid() {
    return hid;
  }

  public void setHid(int hid) {
    this.hid = hid;
  }

  public String getHtype() {
    return htype;
  }

  public void setHtype(String htype) {
    this.htype = htype;
  }

  public int getRoomNo() {
    return roomNo;
  }

  public void setRoomNo(int roomNo) {
    this.roomNo = roomNo;
  }

  @Override
  public String toString() {
    return "Room{" +
            "rid=" + rid +
            ", hid=" + hid +
            ", htype='" + htype + '\'' +
            ", roomNo=" + roomNo +
            '}';
  }
}

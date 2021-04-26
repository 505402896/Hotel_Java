package com.wzj.hotel.entity;

public class Hotel {
  private int hid;
  private String htype;
  private int hprice;
  private String hpic;
  private String hdetail;
  private int peopleNum;
  private int total;

  public Hotel(int hid, String htype, int hprice, String hpic, String hdetail, int peopleNum, int total) {
    this.hid = hid;
    this.htype = htype;
    this.hprice = hprice;
    this.hpic = hpic;
    this.hdetail = hdetail;
    this.peopleNum = peopleNum;
    this.total = total;
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

  public int getHprice() {
    return hprice;
  }

  public void setHprice(int hprice) {
    this.hprice = hprice;
  }

  public String getHpic() {
    return hpic;
  }

  public void setHpic(String hpic) {
    this.hpic = hpic;
  }

  public String getHdetail() {
    return hdetail;
  }

  public void setHdetail(String hdetail) {
    this.hdetail = hdetail;
  }

  public int getPeopleNum() {
    return peopleNum;
  }

  public void setPeopleNum(int peopleNum) {
    this.peopleNum = peopleNum;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  @Override
  public String toString() {
    return "Hotel{" +
            "hid=" + hid +
            ", htype='" + htype + '\'' +
            ", hprice=" + hprice +
            ", hpic='" + hpic + '\'' +
            ", hdetail='" + hdetail + '\'' +
            ", peopleNum=" + peopleNum +
            ", total=" + total +
            '}';
  }
}

package com.wzj.hotel.entity;

public class Comment {
  private int cid;
  private int uid;
  private int bid;
  private String username;
  private String ctime;
  private String content;
  private int star;
  private String reply;

  public Comment() {}

  public Comment(int cid, int uid, int bid, String username, String ctime, String content, int star, String reply) {
    this.cid = cid;
    this.uid = uid;
    this.bid = bid;
    this.username = username;
    this.ctime = ctime;
    this.content = content;
    this.star = star;
    this.reply = reply;
  }

  public int getCid() {
    return cid;
  }

  public void setCid(int cid) {
    this.cid = cid;
  }

  public int getUid() {
    return uid;
  }

  public void setUid(int uid) {
    this.uid = uid;
  }

  public int getBid() {
    return bid;
  }

  public void setBid(int bid) {
    this.bid = bid;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getCtime() {
    return ctime;
  }

  public void setCtime(String ctime) {
    this.ctime = ctime;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public int getStar() {
    return star;
  }

  public void setStar(int star) {
    this.star = star;
  }

  public String getReply() {
    return reply;
  }

  public void setReply(String reply) {
    this.reply = reply;
  }

  @Override
  public String toString() {
    return "Comment{" +
            "cid=" + cid +
            ", uid=" + uid +
            ", bid=" + bid +
            ", username='" + username + '\'' +
            ", ctime='" + ctime + '\'' +
            ", content='" + content + '\'' +
            ", star=" + star +
            ", reply='" + reply + '\'' +
            '}';
  }
}

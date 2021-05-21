package com.wzj.hotel.service.impl;

import com.wzj.hotel.entity.Book;
import com.wzj.hotel.entity.Room;
import com.wzj.hotel.mapper.BookMapper;
import com.wzj.hotel.mapper.RoomMapper;
import com.wzj.hotel.service.BookService;
import com.wzj.hotel.util.Common;
import com.wzj.hotel.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("BookService")
public class BookServiceImp implements BookService {

  @Autowired
  private BookMapper bookMapper;

  @Autowired
  private RoomMapper roomMapper;

  @Override
  public Result getBook(int page) {
    int currentPage = (page - 1) * 10;
    Result result = new Result();
    List<Book> num = bookMapper.getAllBook();
    List<Book> list = bookMapper.getBook(currentPage);
    result.setCode(200);
    result.setData(list);
    result.setTotal(num.size());
    result.setMessage("获取订单");
    return result;
  }

  @Override
  public Result delBook(int bid) {
    Result result = new Result();
    bookMapper.delBook(bid);
    result.setMessage("删除成功");
    result.setCode(200);
    return result;
  }

  @Override
  public Result getBookById(int bid) {
    Result result = new Result();
    List<Book> list = bookMapper.getBookById(bid);
    result.setCode(200);
    result.setMessage("查询成功");
    result.setData(list);
    result.setTotal(1);
    return result;
  }

  @Override
  public Result getBookByRealName(String realName) {
    Result result = new Result();
    List<Book> list = bookMapper.getBookByRealName(realName);
    result.setMessage("查询成功");
    result.setData(list);
    result.setCode(200);
    return result;
  }

  @Override
  public Result getWaitInBook(int page) {
    Result result = new Result();
    int currentPage = Common.getCurrentPage(page);
    List<Book> list = bookMapper.getWaitInBook(currentPage);
    Map<String, Object> map = new HashMap<>();
    map.put("data", list);
    List<Room> room = roomMapper.getAllRoom();
    map.put("room", room);
    List<Book> num = bookMapper.getAllWaitInBook();
    result.setCode(200);
    result.setMessage("查询成功");
    result.setData(map);
    result.setTotal(num.size());
    return result;
  }

  @Override
  public Result getInBook(int page) {
    Result result = new Result();
    int currentPage = Common.getCurrentPage(page);
    List<Book> list = bookMapper.getInBook(currentPage);
    List<Book> num = bookMapper.getAllInBook();
    result.setTotal(num.size());
    result.setData(list);
    result.setMessage("查询成功");
    result.setCode(200);
    return result;
  }

  @Override
  public Result checkIn(Book book) {
    Result result = new Result();
    bookMapper.checkIn(book);
    result.setMessage("入住成功");
    result.setCode(200);
    return result;
  }

  @Override
  public Result checkOut(Book book) {
    Result result = new Result();
    bookMapper.checkOut(book);
    result.setMessage("退房成功");
    result.setCode(200);
    return result;
  }

  @Override
  public Result editBook(Book book) {
    Result result = new Result();
    if(book.getOutDay() == null) {
//      改房型
      bookMapper.changeType(book);
      result.setMessage("更改成功");
    } else {
//      续住
      bookMapper.changeOutDay(book);
      result.setMessage("续住成功");
    }
    result.setCode(200);
    return result;
  }
}

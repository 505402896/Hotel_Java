package com.wzj.hotel.service.impl;

import com.wzj.hotel.entity.Book;
import com.wzj.hotel.mapper.BookMapper;
import com.wzj.hotel.service.BookService;
import com.wzj.hotel.util.Common;
import com.wzj.hotel.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.json.JSONObject;
import java.util.List;

@Service("BookService")
public class BookServiceImp implements BookService {

  @Autowired
  private BookMapper bookMapper;

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
    List<Book> num = bookMapper.getAllWaitInBook();
    result.setCode(200);
    result.setMessage("查询成功");
    result.setData(list);
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
  public Result checkIn(JSONObject jsonObject) {
    Result result = new Result();
    bookMapper.checkIn(jsonObject.getInt("bid"));
    result.setMessage("入住成功");
    result.setCode(200);
    return result;
  }

  @Override
  public Result checkOut(JSONObject jsonObject) {
    Result result = new Result();
    bookMapper.checkOut(jsonObject.getInt("bid"));
    result.setMessage("退房成功");
    result.setCode(200);
    return result;
  }
}

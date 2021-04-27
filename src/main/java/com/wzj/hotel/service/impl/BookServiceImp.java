package com.wzj.hotel.service.impl;

import com.wzj.hotel.entity.Book;
import com.wzj.hotel.mapper.BookMapper;
import com.wzj.hotel.service.BookService;
import com.wzj.hotel.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    System.out.println(bid);
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
}

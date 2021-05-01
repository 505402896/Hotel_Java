package com.wzj.hotel.service;

import com.wzj.hotel.entity.Book;
import com.wzj.hotel.util.Result;
import org.json.JSONObject;

public interface BookService {
  Result getBook(int page);
  Result delBook(int bid);
  Result getBookById(int bid);
  Result getBookByRealName(String realName);
  Result getWaitInBook(int page);
  Result getInBook(int page);
  Result checkIn(Book book);
  Result checkOut(Book book);
}

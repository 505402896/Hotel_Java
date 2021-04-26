package com.wzj.hotel.service;

import com.wzj.hotel.util.Result;

public interface BookService {
  Result getBook(int page);
  Result delBook(int bid);
  Result getBookById(int bid);
  Result getBookByRealName(String realName);
  Result getWaitInBook(int page);
  Result getInBook(int page);
}

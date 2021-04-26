package com.wzj.hotel.mapper;

import com.wzj.hotel.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookMapper {
  List<Book> getBook(int page);
  List<Book> getAllBook();
  List<Book> getBookById(int bid);
  List<Book> getBookByRealName(String realName);
  void delBook(int bid);
}

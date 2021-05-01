package com.wzj.hotel.mapper;

import com.wzj.hotel.entity.Admin;
import com.wzj.hotel.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface CommonMapper {
  Admin login(String username, String password);
  List<Book> getWeChatBook();
  List<Book> getWebBook();
}

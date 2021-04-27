package com.wzj.hotel.service;

import com.wzj.hotel.util.Result;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface CommonService {
  Result login(@Param("username") String username, @Param("password") String password);
  Map<String,Object> getDataView();
}

package com.wzj.hotel.service;

import com.wzj.hotel.util.Result;
import org.apache.ibatis.annotations.Param;

public interface UserInfoService {
    Result getUser(int page);
    Result getUserByName(@Param("realName") String realName);
}

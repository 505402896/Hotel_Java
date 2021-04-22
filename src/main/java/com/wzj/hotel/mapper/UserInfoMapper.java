package com.wzj.hotel.mapper;

import com.wzj.hotel.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserInfoMapper{
    List<UserInfo> getUser(int page);
    List<UserInfo> getAllUser();
    List<UserInfo> getUserByName(@Param("realName") String realName);
}
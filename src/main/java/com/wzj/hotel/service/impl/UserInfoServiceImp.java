package com.wzj.hotel.service.impl;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.wzj.hotel.entity.UserInfo;
import com.wzj.hotel.mapper.UserInfoMapper;
import com.wzj.hotel.service.UserInfoService;
import com.wzj.hotel.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("UserInfoService")
public class UserInfoServiceImp implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public Result getUser(int page) {
      int currentPage = (page - 1) * 10;
      List<UserInfo> num = userInfoMapper.getAllUser();
      List<UserInfo> list = userInfoMapper.getUser(currentPage);
      Result result = new Result();
      result.setData(list);
      result.setMessage("操作成功");
      result.setTotal(num.size());
      result.setCode(200);
      return result;
    }

  @Override
  public Result getUserByName(String realName) {
      Result result = new Result();
      List<UserInfo> list = userInfoMapper.getUserByName(realName);
      result.setMessage("操作成功");
      result.setData(list);
      result.setTotal(list.size());
      result.setCode(200);
    return result;
  }
}

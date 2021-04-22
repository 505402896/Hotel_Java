package com.wzj.hotel.service.impl;

import com.wzj.hotel.mapper.CommonMapper;
import com.wzj.hotel.service.CommonService;
import com.wzj.hotel.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CommonService")
public class CommonServiceImp implements CommonService {

  @Autowired
  private CommonMapper commonMapper;

  @Override
  public Result login(String username, String password) {
    Result result = new Result();
    Object data = commonMapper.login(username,password);
    if (data == null ){
      result.setMessage("登录失败");
      result.setCode(0);
    }else{
      result.setMessage("登录成功");
      result.setCode(200);
    }
    result.setData(data);
    return result;
  }
}

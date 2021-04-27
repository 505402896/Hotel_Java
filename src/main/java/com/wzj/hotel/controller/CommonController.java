package com.wzj.hotel.controller;

import com.wzj.hotel.service.CommonService;
import com.wzj.hotel.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/common")
public class CommonController {

  @Autowired
  private CommonService commonService;

  @RequestMapping(value = "login",method = RequestMethod.GET)
  public Result login(String username,String password){
    return commonService.login(username, password);
  }

  @RequestMapping(value = "getDataView",method = RequestMethod.GET)
  public Map<String,Object> getDataView() {
    return commonService.getDataView();
  }
}

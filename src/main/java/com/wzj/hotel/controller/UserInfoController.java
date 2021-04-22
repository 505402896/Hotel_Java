package com.wzj.hotel.controller;

import com.wzj.hotel.service.UserInfoService;
import com.wzj.hotel.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public Result getUser(int page){
      return userInfoService.getUser(page);
    }

    @RequestMapping(value = "/getUserByName",method = RequestMethod.GET)
    public Result getUserByName(String realName){
      return userInfoService.getUserByName(realName);
    }
}

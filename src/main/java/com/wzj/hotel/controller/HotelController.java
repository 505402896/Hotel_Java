package com.wzj.hotel.controller;

import com.wzj.hotel.service.HotelService;
import com.wzj.hotel.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/hotel")
public class HotelController {

  @Autowired
  private HotelService hotelService;

  @RequestMapping(value = "/getHotel",method = RequestMethod.GET)
  public Result getResult(int page){
    return hotelService.getHotel(page);
  }
}

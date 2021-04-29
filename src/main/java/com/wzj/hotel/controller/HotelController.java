package com.wzj.hotel.controller;

import com.wzj.hotel.service.HotelService;
import com.wzj.hotel.util.Result;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/hotel")
public class HotelController {

  @Autowired
  private HotelService hotelService;

  @RequestMapping(value = "/getHotel",method = RequestMethod.GET)
  public Result getHotel(int page){
    return hotelService.getHotel(page);
  }

  @RequestMapping(value = "/addRoomType",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
  public Result addRoomType(@RequestParam(value = "file") MultipartFile file,int peopleNum, int hprice, String hdetail, String htype){
    return  hotelService.addRoomType(file,peopleNum,hprice,hdetail,htype);
  }

  @RequestMapping(value = "/editRoomType",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
  public Result editRoomType(@RequestBody JSONObject jsonObject){
    return hotelService.editRoomType(jsonObject);
  }

  @RequestMapping(value = "/delRoomType/{hid}",method = RequestMethod.DELETE)
  public Result delRoomType(@PathVariable("hid")int hid){
    return hotelService.delRoomType(hid);
  }
}

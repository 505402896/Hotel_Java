package com.wzj.hotel.controller;

import com.wzj.hotel.service.RoomService;
import com.wzj.hotel.util.Result;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/room")
public class RoomController {

  @Autowired
  private RoomService roomService;

  @RequestMapping(value = "/getRoom",method = RequestMethod.GET)
  public Result getRoom(int page){
    return roomService.getRoom(page);
  }

  @RequestMapping(value = "/addRoom",method = RequestMethod.PUT,produces = "application/json;charset=UTF-8")
  public Result addRoom(@RequestBody JSONObject jsonObject){
    return  roomService.addRoom(jsonObject);
  }

  @RequestMapping(value = "/delRoom",method = RequestMethod.DELETE)
  public Result delRoom(@RequestBody JSONObject jsonObject){
    return roomService.delRoom(jsonObject);
  }
}

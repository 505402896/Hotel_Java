package com.wzj.hotel.controller;

import com.wzj.hotel.entity.Room;
import com.wzj.hotel.service.RoomService;
import com.wzj.hotel.util.Result;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
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
  public Result addRoom(@RequestBody Room room){
    return  roomService.addRoom(room);
  }

  @RequestMapping(value = "/delRoom",method = RequestMethod.DELETE)
  public Result delRoom(@RequestBody Room room){
    return roomService.delRoom(room);
  }

  @RequestMapping(value = "/editRoom",method = RequestMethod.POST)
  public Result editRoom(@RequestBody Room room){
    return roomService.editRoom(room);
  }
}

package com.wzj.hotel.service.impl;

import com.wzj.hotel.entity.Room;
import com.wzj.hotel.mapper.RoomMapper;
import com.wzj.hotel.service.RoomService;
import com.wzj.hotel.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("RoomService")
public class RoomServiceImp implements RoomService {
  @Autowired
  public RoomMapper roomMapper;

  @Override
  public Result getRoom(int page) {
    Result result = new Result();
    int currentPage = (page - 1) * 10;
    List<Room> num = roomMapper.getAllRoom();
    List<Room> list = roomMapper.getRoom(currentPage);
    result.setCode(200);
    result.setMessage("查询成功");
    result.setTotal(num.size());
    result.setData(list);
    return result;
  }

  @Override
  public Result addRoom(Room room) {
    Result result = new Result();
//    Map<String,Object> map = Common.JsonToMap(jsonObject);
    roomMapper.addRoom(room);
    roomMapper.addRoomCol(room.getHid());
    result.setCode(200);
    result.setMessage("增加成功");
    return result;
  }

  @Override
  public Result delRoom(Room room) {
    Result result = new Result();
    int hid = room.getHid();
    int rid = room.getRid();
    roomMapper.delRoomCol(hid);
    roomMapper.delRoom(rid);
    result.setCode(200);
    result.setMessage("删除成功");
    return result;
  }

  @Override
  public Result editRoom(Room room) {
    Result result = new Result();
    Room oldRoom = roomMapper.getRoomById(room.getRid());
    int oldHid = oldRoom.getHid();
    roomMapper.delRoomCol(oldHid);
    int newHid = room.getHid();
    roomMapper.editRoom(room);
    roomMapper.addRoomCol(newHid);
    result.setMessage("修改成功");
    result.setCode(200);
    return result;
  }
}

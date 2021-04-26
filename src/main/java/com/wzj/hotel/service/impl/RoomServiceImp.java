package com.wzj.hotel.service.impl;

import com.wzj.hotel.entity.Room;
import com.wzj.hotel.mapper.RoomMapper;
import com.wzj.hotel.service.RoomService;
import com.wzj.hotel.util.Common;
import com.wzj.hotel.util.Result;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
  public Result addRoom(JSONObject jsonObject) {
    Result result = new Result();
    Map<String,Object> map = Common.JsonToMap(jsonObject);
    roomMapper.addRoom(map);
    roomMapper.addRoomCol(jsonObject.getInt("hid"));
    result.setCode(200);
    result.setMessage("增加成功");
    return result;
  }

  @Override
  public Result delRoom(JSONObject jsonObject) {
    Result result = new Result();
    int hid = jsonObject.getInt("hid");
    int rid = jsonObject.getInt("rid");
    roomMapper.delRoomCol(hid);
    roomMapper.delRoom(rid);
    result.setCode(200);
    result.setMessage("删除成功");
    return result;
  }

  @Override
  public Result editRoom(JSONObject jsonObject) {
    Result result = new Result();
    Map<String,Object> map = Common.JsonToMap(jsonObject);
    roomMapper.editRoom(map);
    result.setMessage("修改成功");
    result.setCode(200);
    return result;
  }
}

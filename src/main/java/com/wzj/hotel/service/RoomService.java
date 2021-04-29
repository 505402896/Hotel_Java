package com.wzj.hotel.service;

import com.wzj.hotel.entity.Room;
import com.wzj.hotel.util.Result;
import org.json.JSONObject;

public interface RoomService {
  Result getRoom(int page);
  Result addRoom(Room room);
  Result delRoom(Room room);
  Result editRoom(Room room);
}

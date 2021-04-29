package com.wzj.hotel.service;

import com.wzj.hotel.util.Result;
import org.json.JSONObject;

public interface RoomService {
  Result getRoom(int page);
  Result addRoom(JSONObject jsonObject);
  Result delRoom(JSONObject jsonObject);
  Result editRoom(JSONObject jsonObject);
}

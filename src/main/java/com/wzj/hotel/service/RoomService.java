package com.wzj.hotel.service;

import com.wzj.hotel.util.Result;
import net.sf.json.JSONObject;

public interface RoomService {
  Result getRoom(int page);
  Result addRoom(JSONObject jsonObject);
  Result delRoom(JSONObject jsonObject);
  Result editRoom(JSONObject jsonObject);
}

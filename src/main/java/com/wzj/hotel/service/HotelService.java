package com.wzj.hotel.service;

import com.wzj.hotel.util.Result;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface HotelService {
  Result getHotel(int page);
  Result addRoomType(@RequestParam(value = "file") MultipartFile file, int peopleNum, int hprice, String hdetail, String htype);
  Result editRoomType(JSONObject jsonObject);
  Result delRoomType(int hid);
}

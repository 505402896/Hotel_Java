package com.wzj.hotel.service;

import com.wzj.hotel.util.Result;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public interface HotelService {
  Result getHotel(int page);
  Result addRoomType(@RequestParam(value = "file") MultipartFile file, int peopleNum, int hprice, String hdetail, String htype);
  Result editRoomType(JSONObject jsonObject);
  Result delRoomType(int hid);
}

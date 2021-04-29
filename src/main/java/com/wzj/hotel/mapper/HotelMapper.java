package com.wzj.hotel.mapper;

import com.wzj.hotel.entity.Hotel;
import com.wzj.hotel.util.Result;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface HotelMapper {
  List<Hotel> getAllHotel();
  List<Hotel> getHotel(int page);
  String queryImgPath(int hid);
  void addRoomType(Map<String,Object> map);
  void editRoomType(Hotel hotel);
  void delRoomType(int hid);
}

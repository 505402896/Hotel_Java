package com.wzj.hotel.mapper;

import com.wzj.hotel.entity.Hotel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HotelMapper {
  List<Hotel> getAllHotel();
  List<Hotel> getHotel(int page);
}

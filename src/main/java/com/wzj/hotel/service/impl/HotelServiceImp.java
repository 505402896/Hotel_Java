package com.wzj.hotel.service.impl;

import com.wzj.hotel.entity.Hotel;
import com.wzj.hotel.mapper.HotelMapper;
import com.wzj.hotel.service.HotelService;
import com.wzj.hotel.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("HotelService")
public class HotelServiceImp implements HotelService {
  @Autowired
  public HotelMapper hotelMapper;

  @Override
  public Result getHotel(int page) {
    int currentPage = (page - 1) * 10;
    List<Hotel> num = hotelMapper.getAllHotel();
    List<Hotel> list = hotelMapper.getHotel(currentPage);
    Result result = new Result();
    result.setTotal(num.size());
    result.setCode(200);
    result.setData(list);
    result.setMessage("操作成功");
    return result;
  }
}

package com.wzj.hotel.service.impl;

import com.wzj.hotel.entity.Book;
import com.wzj.hotel.entity.Hotel;
import com.wzj.hotel.entity.Room;
import com.wzj.hotel.entity.UserInfo;
import com.wzj.hotel.mapper.*;
import com.wzj.hotel.service.CommonService;
import com.wzj.hotel.service.UserInfoService;
import com.wzj.hotel.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("CommonService")
public class CommonServiceImp implements CommonService {

  @Autowired
  private CommonMapper commonMapper;
  @Autowired
  private UserInfoMapper userInfoMapper;
  @Autowired
  private HotelMapper hotelMapper;
  @Autowired
  private RoomMapper roomMapper;
  @Autowired
  private BookMapper bookMapper;

  @Override
  public Result login(String username, String password) {
    Result result = new Result();
    Object data = commonMapper.login(username,password);
    if (data == null ){
      result.setMessage("登录失败");
      result.setCode(0);
    }else{
      result.setMessage("登录成功");
      result.setCode(200);
    }
    result.setData(data);
    return result;
  }

  @Override
  public Map<String, Object> getDataView() {
    List<Book> weChat = commonMapper.getWeChatBook();
    List<Book> web = commonMapper.getWebBook();
    List<UserInfo> user = userInfoMapper.getAllUser();
    List<Hotel> hotel = hotelMapper.getAllHotel();
    List<Room> room = roomMapper.getAllRoom();
    List<Book> book = bookMapper.getAllBook();
    Map<String,Object> map = new HashMap<>();
    map.put("webTotal",web.size());
    map.put("weChatTotal",weChat.size());
    map.put("userTotal",user.size());
    map.put("hotelTotal",hotel.size());
    map.put("roomTotal",room.size());
    map.put("book",book);
    return map;
  }
}

package com.wzj.hotel.mapper;

import com.wzj.hotel.entity.Room;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface RoomMapper {
  List<Room> getRoom(int page);
  List<Room> getAllRoom();
  void addRoom(Map<String,Object> map);
  void delRoom(int rid);
  void addRoomCol(int hid);
  void delRoomCol(int hid);
}

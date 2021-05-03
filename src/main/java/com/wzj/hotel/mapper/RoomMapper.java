package com.wzj.hotel.mapper;

import com.wzj.hotel.entity.Room;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface RoomMapper {
  List<Room> getRoom(int page);
  List<Room> getAllRoom();
  Room getRoomById(int rid);
  void addRoom(Room room);
  void delRoom(int rid);
  void editRoom(Room room);
  void addRoomCol(int hid);
  void delRoomCol(int hid);
}

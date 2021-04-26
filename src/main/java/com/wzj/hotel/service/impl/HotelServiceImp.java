package com.wzj.hotel.service.impl;

import com.wzj.hotel.entity.Hotel;
import com.wzj.hotel.mapper.HotelMapper;
import com.wzj.hotel.service.HotelService;
import com.wzj.hotel.util.Common;
import com.wzj.hotel.util.Result;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.rmi.CORBA.Util;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

  @Override
  public Result addRoomType(@RequestParam(value = "file") MultipartFile file, int peopleNum, int hprice, String hdetail, String htype){
    Result result = new Result();
    String filePath = Common.imgPath;
    String fileName = file.getOriginalFilename();
    Map<String,Object> map = new HashMap<>();
    map.put("htype",htype);
    map.put("hprice",hprice);
    map.put("peopleNum",peopleNum);
    map.put("hdetail",hdetail);
    map.put("hpic","img/"+fileName);
    hotelMapper.addRoomType(map);
    try {
      Common.uploadFile(file.getBytes(),filePath,fileName);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      result.setCode(200);
      result.setMessage("操作成功");
    }
    return result;
  }

  @Override
  public Result editRoomType(JSONObject jsonObject){
    Result result = new Result();
    Map<String,Object> map = Common.JsonToMap(jsonObject);
    hotelMapper.editRoomType(map);
    result.setMessage("修改成功");
    result.setCode(200);
    return result;
  }

  @Override
  public Result delRoomType(int hid) {
    Result result = new Result();
    String name = hotelMapper.queryImgPath(hid).substring(4);
    String fileName = Common.imgPath + "\\" + name;
    File file = new File(fileName);

    if(file.exists()) {
      file.delete();
      hotelMapper.delRoomType(hid);
      result.setCode(200);
      result.setMessage("删除成功");
    }else {
      result.setCode(0);
      result.setMessage("文件不存在");
    }

    return result;
  }
}

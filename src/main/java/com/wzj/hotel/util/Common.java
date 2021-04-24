package com.wzj.hotel.util;

import net.sf.json.JSONObject;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Common {
  public static final String imgPath = "C:\\Users\\50540\\eclipse-workspace\\Hotel\\WebContent\\img";
//  JSON转Map
  public static Map<String,Object> JsonToMap(JSONObject j){
    Map<String,Object> map = new HashMap<>();
    Iterator<String> iterator = j.keys();
    while(iterator.hasNext())
    {
      String key = (String)iterator.next();
      Object value = j.get(key);
      map.put(key, value);
    }
    return map;
  }

  //Object转Map

  public static Map<String, Object> getObjectToMap(Object obj) throws IllegalAccessException {
    Map<String, Object> map = new LinkedHashMap<String, Object>();
    Class<?> clazz = obj.getClass();
    System.out.println(clazz);
    for (Field field : clazz.getDeclaredFields()) {
      field.setAccessible(true);
      String fieldName = field.getName();
      Object value = field.get(obj);
      if (value == null) {
        value = "";
      }
      map.put(fieldName, value);
    }
    return map;
  }

  public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
    File targetFile = new File(filePath);
    if (!targetFile.exists()) {
      targetFile.mkdirs();
    }
    FileOutputStream out = new FileOutputStream(filePath +"/"+ fileName);
    out.write(file);
    out.flush();
    out.close();
  }
}

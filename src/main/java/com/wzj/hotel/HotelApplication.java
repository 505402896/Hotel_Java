package com.wzj.hotel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wzj.hotel.mapper")
public class HotelApplication {

  public static void main(String[] args) {
    SpringApplication.run(HotelApplication.class, args);
  }
}


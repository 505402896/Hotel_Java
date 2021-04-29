package com.wzj.hotel.controller;

import com.wzj.hotel.entity.Book;
import com.wzj.hotel.service.BookService;
import com.wzj.hotel.util.Result;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/book")
public class BookController {

  @Autowired
  private BookService bookService;

  @RequestMapping(value = "/getBook",method = RequestMethod.GET)
  public Result getBook(@RequestParam(value = "page") int page){
    return bookService.getBook(page);
  }

  @RequestMapping(value = "/delBook/{bid}",method = RequestMethod.DELETE)
  public Result delBook(@PathVariable("bid") int bid){
    return bookService.delBook(bid);
  }

  @RequestMapping(value = "/getBookById",method = RequestMethod.GET)
  public Result getBookById(@RequestParam(value = "bid") int bid){
    return bookService.getBookById(bid);
  }

  @RequestMapping(value = "/getBookByRealName",method = RequestMethod.GET)
  public Result getBookByRealName(@RequestParam(value = "realName")String realName){
    return bookService.getBookByRealName(realName);
  }

  @RequestMapping(value = "/getWaitInBook",method = RequestMethod.GET)
  public Result getWaitInBook(@RequestParam(value = "page")int page){
    return bookService.getWaitInBook(page);
  }

  @RequestMapping(value = "/getInBook",method = RequestMethod.GET)
  public Result getInBook(@RequestParam(value = "page")int page){
    return bookService.getInBook(page);
  }

  @RequestMapping(value = "/checkIn",method = RequestMethod.POST)
  public Result checkIn(@RequestBody Book book) {
    return bookService.checkIn(book);
  }

  @RequestMapping(value = "/checkOut",method = RequestMethod.POST)
  public Result checkOut(@RequestBody Book book) {
    return bookService.checkOut(book);
  }
}

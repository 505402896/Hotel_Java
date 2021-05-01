package com.wzj.hotel.controller;

import com.wzj.hotel.entity.Comment;
import com.wzj.hotel.service.CommentService;
import com.wzj.hotel.util.Result;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/comment")
public class CommentController {

  @Autowired
  private CommentService commentService;

  @RequestMapping(value = "/getComment",method = RequestMethod.GET)
  public Result getComment(@RequestParam(value = "page")int page) {
    return commentService.getComment(page);
  }

  @RequestMapping(value = "/getCommented",method = RequestMethod.GET)
  public Result getCommented(@RequestParam(value = "page")int page) {
    return commentService.getCommented(page);
  }

  @RequestMapping(value = "/getUnComment",method = RequestMethod.GET)
  public Result getUnComment(@RequestParam(value = "page")int page) {
    return commentService.getUnComment(page);
  }

  @RequestMapping(value = "/delComment/{cid}",method = RequestMethod.DELETE)
  public Result delComment(@PathVariable("cid")int cid) {
    return commentService.delComment(cid);
  }

  @RequestMapping(value = "/editComment",method = RequestMethod.POST)
  public Result editComment(@RequestBody Comment comment) {
    return commentService.editComment(comment);
  }
}

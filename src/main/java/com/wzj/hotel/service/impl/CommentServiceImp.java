package com.wzj.hotel.service.impl;

import com.wzj.hotel.entity.Comment;
import com.wzj.hotel.mapper.CommentMapper;
import com.wzj.hotel.service.CommentService;
import com.wzj.hotel.util.Common;
import com.wzj.hotel.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("CommentService")
public class CommentServiceImp implements CommentService {
  @Autowired
  private CommentMapper commentMapper;

  @Override
  public Result getComment(int page) {
    int currentPage = Common.getCurrentPage(page);
    Result result = new Result();
    List<Comment> list = commentMapper.getComment(currentPage);
    List<Comment> num = commentMapper.getAllComment();
    result.setCode(200);
    result.setMessage("查询成功");
    result.setData(list);
    result.setTotal(num.size());
    return result;
  }

  @Override
  public Result getCommented(int page) {
    int currentPage = Common.getCurrentPage(page);
    Result result = new Result();
    List<Comment> list = commentMapper.getCommented(currentPage);
    List<Comment> num = commentMapper.getAllCommented();
    result.setCode(200);
    result.setMessage("查询成功");
    result.setData(list);
    result.setTotal(num.size());
    return result;
  }

  @Override
  public Result getUnComment(int page) {
    int currentPage = Common.getCurrentPage(page);
    Result result = new Result();
    List<Comment> list = commentMapper.getUnComment(currentPage);
    List<Comment> num = commentMapper.getAllUnComment();
    result.setCode(200);
    result.setMessage("查询成功");
    result.setData(list);
    result.setTotal(num.size());
    return result;
  }

  @Override
  public Result delComment(int cid) {
    Result result = new Result();
    commentMapper.delComment(cid);
    result.setMessage("删除成功");
    result.setCode(200);
    return result;
  }

  @Override
  public Result editComment(Comment comment) {
    Result result = new Result();
    commentMapper.editComment(comment);
    result.setCode(200);
    result.setMessage("回复成功");
    return result;
  }
}

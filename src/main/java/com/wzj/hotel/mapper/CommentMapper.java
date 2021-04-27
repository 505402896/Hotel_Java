package com.wzj.hotel.mapper;

import com.wzj.hotel.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface CommentMapper {
  List<Comment> getComment(int page);
  List<Comment> getAllComment();
  List<Comment> getCommented(int page);
  List<Comment> getAllCommented();
  List<Comment> getUnComment(int page);
  List<Comment> getAllUnComment();
  void delComment(int cid);
  void editComment(Map<String,Object> map);
}

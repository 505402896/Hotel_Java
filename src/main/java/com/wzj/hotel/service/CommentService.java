package com.wzj.hotel.service;

import com.wzj.hotel.util.Result;
import org.json.JSONObject;

public interface CommentService {
  Result getComment(int page);
  Result getCommented(int page);
  Result getUnComment(int page);
  Result delComment(int cid);
  Result editComment(JSONObject jsonObject);
}

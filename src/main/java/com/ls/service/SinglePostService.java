package com.ls.service;

import java.util.Date;

import com.ls.entity.PostBaseInfo;
import com.ls.entity.PostLike;

public interface SinglePostService {
	public PostBaseInfo selectSingleByPostID(Integer postID);
	public PostLike selectLikeByPostID(Integer postID);
	public String timeparse(Date date);
}

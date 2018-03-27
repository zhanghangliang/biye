package com.ls.service;

import java.util.List;

import com.ls.entity.PostBaseInfo;
import com.ls.entity.PostLike;

public interface IndexSelectService {
	public List<PostBaseInfo> selectFirst(String content,Integer limit);
	public List<PostLike> selectLike(Integer postid);
	public Integer deleteLikeByPostID(Integer postID);
}

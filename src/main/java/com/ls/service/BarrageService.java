package com.ls.service;

import java.util.List;

import com.ls.entity.PostBarrage;

public interface BarrageService {
	public List<PostBarrage> selectBarrageByPostID(Integer postid);
	public void insertBarrageByPostIDAndUserID(String barrage,Integer postid,Integer userid);
	public Integer deleteBarrageByPostID(Integer postID);
}

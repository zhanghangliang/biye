package com.ls.service;

import java.util.List;

import com.ls.entity.PostBaseInfo;

public interface IndexSelectService {
	public List<PostBaseInfo> selectFirst(String content);
}

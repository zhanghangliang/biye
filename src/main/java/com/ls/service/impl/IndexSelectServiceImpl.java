package com.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.dao.PostBaseInfoMapper;
import com.ls.entity.PostBaseInfo;
import com.ls.service.IndexSelectService;

@Service
public class IndexSelectServiceImpl implements IndexSelectService{
	@Autowired
	private PostBaseInfoMapper postBaseInfoMapper;
	
	@Override
	public List<PostBaseInfo> selectFirst(String content) {
		List<PostBaseInfo> postBaseInfoByLimit = postBaseInfoMapper.selectPostBaseInfoByLimit(content);
		for(int i=0;i<postBaseInfoByLimit.size();i++){
			System.out.println(postBaseInfoByLimit.get(i).getPostTitle());
		}
		return postBaseInfoByLimit;
	}

}

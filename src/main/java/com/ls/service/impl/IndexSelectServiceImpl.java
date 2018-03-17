package com.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.dao.PostBaseInfoMapper;
import com.ls.dao.PostLikeMapper;
import com.ls.entity.PostBaseInfo;
import com.ls.entity.PostLike;
import com.ls.entity.PostLikeExample;
import com.ls.entity.PostLikeExample.Criteria;
import com.ls.service.IndexSelectService;

@Service
public class IndexSelectServiceImpl implements IndexSelectService{
	@Autowired
	private PostBaseInfoMapper postBaseInfoMapper;
	@Autowired
	private PostLikeMapper mapper;
	@Autowired
	private PostLikeExample example;
	
	@Override
	public List<PostBaseInfo> selectFirst(String content) {
		List<PostBaseInfo> postBaseInfoByLimit = postBaseInfoMapper.selectPostBaseInfoByLimit(content);
		for(int i=0;i<postBaseInfoByLimit.size();i++){
			System.out.println(postBaseInfoByLimit.get(i).getPostTitle());
		}
		return postBaseInfoByLimit;
	}

	@Override
	public List<PostLike> selectLike(Integer postid) {
		Criteria criteria = example.createCriteria();
		criteria.andPostIdEqualTo(postid);
		List<PostLike> selectByExample = mapper.selectByExample(example);
		example.clear();
		return selectByExample;
	}

}

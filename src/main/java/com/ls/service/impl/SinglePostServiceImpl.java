package com.ls.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.dao.PostBaseInfoMapper;
import com.ls.dao.PostLikeMapper;
import com.ls.entity.PostBaseInfo;
import com.ls.entity.PostLike;
import com.ls.entity.PostLikeExample;
import com.ls.entity.PostLikeExample.Criteria;
import com.ls.service.SinglePostService;

@Service
public class SinglePostServiceImpl implements SinglePostService{
	@Autowired
	private PostBaseInfoMapper postBaseInfoMapper;
	@Autowired
	private PostLikeMapper postLikeMapper;
	@Autowired
	private PostLikeExample example;
	
	@Override
	public PostBaseInfo selectSingleByPostID(Integer postID) {
		return postBaseInfoMapper.selectByPrimaryKey(postID);
	}

	@Override
	public PostLike selectLikeByPostID(Integer postID) {
		Criteria criteria = example.createCriteria();
		criteria.andPostIdEqualTo(postID);
		PostLike postLike = postLikeMapper.selectByExample(example).get(0);
		example.clear();
		return postLike;
	}

	@Override
	public String timeparse(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}

}

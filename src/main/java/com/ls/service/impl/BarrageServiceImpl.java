package com.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.dao.PostBarrageMapper;
import com.ls.entity.PostBarrage;
import com.ls.entity.PostBarrageExample;
import com.ls.entity.PostBarrageExample.Criteria;
import com.ls.service.BarrageService;

@Service
public class BarrageServiceImpl implements BarrageService{
	@Autowired
	private PostBarrageMapper mapper;
	@Autowired
	private PostBarrageExample example;
	@Autowired
	private PostBarrage postBarrage;
	
	@Override
	public List<PostBarrage> selectBarrageByPostID(Integer postid) {
		Criteria criteria = example.createCriteria();
		criteria.andPostIdEqualTo(postid);
		List<PostBarrage> selectByExample = mapper.selectByExample(example);
		example.clear();
		return selectByExample;
	}

	@Override
	public void insertBarrageByPostIDAndUserID(String barrage, Integer postid, Integer userid) {
		postBarrage.setBarrage(barrage);
		postBarrage.setPostId(postid);
		postBarrage.setUserId(userid);
		mapper.insert(postBarrage);
	}

	@Override
	public Integer deleteBarrageByPostID(Integer postID) {
		Criteria criteria = example.createCriteria();
		criteria.andPostIdEqualTo(postID);
		int deleteByExample = mapper.deleteByExample(example);
		example.clear();
		return deleteByExample;
	}
}

package com.ls.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ls.dao.UserBaseInfoMapper;
import com.ls.entity.UserBaseInfo;
import com.ls.entity.UserBaseInfoExample;
import com.ls.entity.UserBaseInfoExample.Criteria;
import com.ls.service.RegisService;

@Service
public class RegisServiceImpl implements RegisService{
	
	@Autowired
	private UserBaseInfoExample example;
	@Autowired
	private UserBaseInfoMapper mapper;
	@Autowired
	private UserBaseInfo userBaseInfo;
	
	@Override
	public int checkAccount(String account) {
		Criteria criteria = example.createCriteria();
		criteria.andAccountEqualTo(account);
		int i = mapper.countByExample(example);
		example.clear();
		return i;
	}

	@Override
	@Transactional
	public Integer regis(String account, String pwd) {
		userBaseInfo.setAccount(account);
		userBaseInfo.setPasswd(pwd);
		userBaseInfo.setUserId(null);
		mapper.insert(userBaseInfo);
		System.out.println(userBaseInfo.getUserId());
		return userBaseInfo.getUserId();
	}
	
}

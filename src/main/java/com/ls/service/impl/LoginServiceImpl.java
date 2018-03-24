package com.ls.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.dao.UserBaseInfoMapper;
import com.ls.entity.UserBaseInfo;
import com.ls.entity.UserBaseInfoExample;
import com.ls.entity.UserBaseInfoExample.Criteria;
import com.ls.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private UserBaseInfoExample example;
	@Autowired
	private UserBaseInfoMapper mapper;
	
	@Override
	public String loginCheck(String loginac,String loginpwd) {
		Criteria criteria = example.createCriteria();
		criteria.andAccountEqualTo(loginac);
		criteria.andPasswdEqualTo(loginpwd);
		List<UserBaseInfo> result = mapper.selectByExample(example);
		example.clear();
		if (!result.isEmpty()) {
			if (result.get(0).getType()!=null) {
				return result.get(0).getUserId()+"_success2";
			}
			return result.get(0).getUserId()+"_success1";
		} else return "error";
	}

	@Override
	public Date banTimeCheck(Integer userId) throws Exception {
		return mapper.selectByPrimaryKey(userId).getLiftBanTime();
	}
}

package com.ls.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.dao.UserBaseInfoMapper;
import com.ls.entity.UserBaseInfo;
import com.ls.entity.UserBaseInfoExample;
import com.ls.entity.UserBaseInfoExample.Criteria;
import com.ls.service.LoginService;
import com.ls.utils.CommonUtil;

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

	@Override
	public Integer selectUserType(Integer userId) {
			UserBaseInfo userBaseInfo = mapper.selectByPrimaryKey(userId);
			return userBaseInfo.getType();
	}

	@Override
	public String updateBanTimeByUserID(Integer userId, Date liftBanTime) {
		try {
			UserBaseInfo userBaseInfo = new UserBaseInfo();
			userBaseInfo.setLiftBanTime(liftBanTime);
			Criteria criteria = example.createCriteria();
			criteria.andUserIdEqualTo(userId);
			mapper.updateByExampleSelective(userBaseInfo, example);
		} catch (Exception e) {
			return "error";
		} finally {
			example.clear();
		}
		return "success";
	}

	@Override
	public Date conversionTime(Integer banType) throws Exception {
		Calendar c = Calendar.getInstance();  
        c.setTime(CommonUtil.nowTime());  
        c.add(Calendar.DAY_OF_MONTH, banType);
		return c.getTime();
	}

	@Override
	public String updateTypeByUser(Integer userId, Integer type) {
		try {
			UserBaseInfo userBaseInfo = new UserBaseInfo();
			userBaseInfo.setType(type);
			Criteria criteria = example.createCriteria();
			criteria.andUserIdEqualTo(userId);
			mapper.updateByExampleSelective(userBaseInfo, example);
		} catch (Exception e) {
			return "error";
		} finally {
			example.clear();
		}
		return "success";
	}

	@Override
	public String updateTypeToNormalByUser(Integer userId) {
		try {
			mapper.updateTypeToNormalByUserID(userId);
		} catch (Exception e) {
			return "error";
		}
		return "success";
	}

	@Override
	public Integer selectUserCount() {
		return mapper.countByExample(example);
	}
}

package com.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.dao.UserDetailInfoMapper;
import com.ls.entity.UserDetailInfoExample.Criteria;
import com.ls.entity.UserDetailInfo;
import com.ls.entity.UserDetailInfoExample;
import com.ls.service.DetailInfoService;

@Service
public class DetailInfoServiceImpl implements DetailInfoService{
	@Autowired
	private UserDetailInfoMapper mapper;
	@Autowired
	private UserDetailInfoExample example;
	
	@Override
	public String saveDetailInfo(UserDetailInfo userDetailInfo) {
		try {
			Criteria criteria = example.createCriteria();
			criteria.andUserIdEqualTo(userDetailInfo.getUserId());
			mapper.updateByExampleSelective(userDetailInfo, example);
			example.clear();
			return "success";
		} catch (Exception e) {
			example.clear();
			return "error";
		}
	}

	@Override
	public String savePhotoWallInfo() {
		return null;
	}

	@Override
	public UserDetailInfo selectUserDetailInfo(Integer userid) {
		UserDetailInfo info =new UserDetailInfo();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userid);
		if(mapper.countByExample(example)==0){
			info.setUserId(userid);
			mapper.insert(info);
		}
		List<UserDetailInfo> list = mapper.selectByExampleWithBLOBs(example);
		return list.get(0);
	}
}

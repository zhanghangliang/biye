package com.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.dao.ExperienceBaseInfoMapper;
import com.ls.dao.ExperienceDetailInfoMapper;
import com.ls.entity.ExperienceBaseInfo;
import com.ls.entity.ExperienceDetailInfo;
import com.ls.entity.ExperienceDetailInfoExample;
import com.ls.entity.ExperienceDetailInfoExample.Criteria;
import com.ls.service.SingleExpService;

@Service
public class SingleExpServiceImpl implements SingleExpService{
	@Autowired
	private ExperienceBaseInfoMapper baseInfoMapper;
	@Autowired
	private ExperienceDetailInfoMapper detailInfoMapper;
	@Autowired
	private ExperienceDetailInfoExample detailInfoExample;

	@Override
	public ExperienceBaseInfo selectExpBaseInfoByID(Integer ExpID) {
		return baseInfoMapper.selectByPrimaryKey(ExpID);
	}
	
	@Override
	public List<ExperienceDetailInfo> selectExpDetailInfoByID(Integer ExpID) {
		Criteria criteria = detailInfoExample.createCriteria();
		criteria.andExperienceIdEqualTo(ExpID);
		List<ExperienceDetailInfo> selectByExample = detailInfoMapper.selectByExample(detailInfoExample);
		detailInfoExample.clear();
		return selectByExample;
	}
}

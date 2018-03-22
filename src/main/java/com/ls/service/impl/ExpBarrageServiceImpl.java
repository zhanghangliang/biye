package com.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.dao.ExperienceBarrageMapper;
import com.ls.entity.ExperienceBarrage;
import com.ls.entity.ExperienceBarrageExample;
import com.ls.entity.ExperienceBarrageExample.Criteria;
import com.ls.service.ExpBarrageService;

@Service
public class ExpBarrageServiceImpl implements ExpBarrageService{
	@Autowired
	private ExperienceBarrageExample example;
	@Autowired
	private ExperienceBarrageMapper mapper;
	@Autowired
	private ExperienceBarrage experienceBarrage;

	@Override
	public List<ExperienceBarrage> selectBarrageByPostID(Integer expID) {
		Criteria criteria =  example.createCriteria();
		criteria.andExperienceIdEqualTo(expID);
		List<ExperienceBarrage> selectByExample = mapper.selectByExample(example);
		example.clear();
		return selectByExample;
	}

	@Override
	public void insertBarrageByPostIDAndUserID(String barrage, Integer expID, Integer userid) {
		experienceBarrage.setExperienceId(expID);
		experienceBarrage.setExpBarrage(barrage);
		experienceBarrage.setUserId(userid);
		mapper.insert(experienceBarrage);
	}

}

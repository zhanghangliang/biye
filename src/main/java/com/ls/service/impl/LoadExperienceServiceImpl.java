package com.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.dao.ExperienceBaseInfoMapper;
import com.ls.entity.ExperienceBaseInfo;
import com.ls.entity.ExperienceBaseInfoExample;
import com.ls.entity.ExperienceBaseInfoExample.Criteria;
import com.ls.service.LoadExperienceService;

@Service
public class LoadExperienceServiceImpl implements LoadExperienceService{
	@Autowired
	private ExperienceBaseInfoMapper mapper;
	@Autowired
	private ExperienceBaseInfoExample example;
	
	@Override
	public List<ExperienceBaseInfo> selectExpBaseInfoByStatus(Integer status,Integer num) {
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(status);
		List<ExperienceBaseInfo> list = mapper.selectByStatus(status,num);
		while (list.size()<num) {
			list = mapper.selectByStatus(status,num);			
		}
		System.out.println(list.size());
		example.clear();
		return list;
	}

}

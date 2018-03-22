package com.ls.service;

import java.util.List;

import com.ls.entity.ExperienceBaseInfo;

public interface LoadExperienceService {
	public List<ExperienceBaseInfo> selectExpBaseInfoByStatus(Integer status,Integer times);
}

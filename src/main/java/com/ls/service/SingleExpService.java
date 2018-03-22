package com.ls.service;

import java.util.List;

import com.ls.entity.ExperienceBaseInfo;
import com.ls.entity.ExperienceDetailInfo;

public interface SingleExpService {
	public ExperienceBaseInfo selectExpBaseInfoByID(Integer ExpID);
	public List<ExperienceDetailInfo> selectExpDetailInfoByID(Integer ExpID);
}

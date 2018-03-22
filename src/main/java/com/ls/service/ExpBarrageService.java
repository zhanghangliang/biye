package com.ls.service;

import java.util.List;

import com.ls.entity.ExperienceBarrage;

public interface ExpBarrageService {
	public List<ExperienceBarrage> selectBarrageByPostID(Integer expID);
	public void insertBarrageByPostIDAndUserID(String barrage,Integer expID,Integer userid);
}

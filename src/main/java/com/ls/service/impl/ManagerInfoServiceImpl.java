package com.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.dao.ManagerLimitMapper;
import com.ls.entity.ManagerInfo;
import com.ls.service.ManagerInfoService;

@Service
public class ManagerInfoServiceImpl implements ManagerInfoService{
	@Autowired
	private ManagerLimitMapper mapper;
	
	@Override
	public List<ManagerInfo> selectManagerInfoByLimit(Integer limit) {
		return mapper.selectManagerInfoByLimit(limit);
	}

}

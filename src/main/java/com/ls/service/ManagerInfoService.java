package com.ls.service;

import java.util.List;

import com.ls.entity.ManagerInfo;

public interface ManagerInfoService {
	public List<ManagerInfo> selectManagerInfoByLimit(Integer limit);
}

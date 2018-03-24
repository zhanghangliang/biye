package com.ls.service;

import com.ls.entity.SystemConf;

public interface SystemConfService {
	public SystemConf selectConfById(Integer id);
	public String updateConfById(Integer id,String noteContent);
}

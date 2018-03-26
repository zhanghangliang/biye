package com.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ls.dao.SystemConfMapper;
import com.ls.entity.SystemConf;
import com.ls.entity.SystemConfExample;
import com.ls.entity.SystemConfExample.Criteria;
import com.ls.service.SystemConfService;

@Service
public class SystemConfServiceImpl implements SystemConfService{
	@Autowired
	private SystemConfMapper mapper;
	@Autowired
	private SystemConfExample example;
	
	@Override
	public SystemConf selectConfById(Integer id) {
		Criteria criteria = example.createCriteria();
		criteria.andInnerNoteEqualTo(id);
		List<SystemConf> selectByExample = mapper.selectByExampleWithBLOBs(example);
		example.clear();
		return selectByExample.get(0);
	}

	@Override
	public String updateConfById(Integer id,String noteContent) {
		try {
			SystemConf systemConf = new SystemConf();
			systemConf.setNoteContent(noteContent);
			Criteria criteria = example.createCriteria();
			criteria.andInnerNoteEqualTo(id);
			mapper.updateByExampleSelective(systemConf, example);
			example.clear();
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

}

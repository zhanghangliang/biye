package com.ls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ls.entity.SystemConf;
import com.ls.service.impl.SystemConfServiceImpl;
import com.ls.utils.CommonUtil;

@Controller
public class SystemConfigController {
	@Autowired
	private SystemConfServiceImpl systemConfServiceImpl;
	
	@RequestMapping("/sysnote")
	@ResponseBody
	public String sysNote(){
		SystemConf selectConfById = systemConfServiceImpl.selectConfById(1);
		String beanToJSONStr = CommonUtil.beanToJSONStr(selectConfById);
		return beanToJSONStr;
	}
	
	@RequestMapping("/renote")
	@ResponseBody
	public String reNote(String note){
		return systemConfServiceImpl.updateConfById(1, note);
	}
}

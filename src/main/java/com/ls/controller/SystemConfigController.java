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
//	获取系统公告
	@RequestMapping("/sysnote")
	@ResponseBody
	public String sysNote(){
		SystemConf selectConfById = systemConfServiceImpl.selectConfById(1);
		String beanToJSONStr = CommonUtil.beanToJSONStr(selectConfById);
		return beanToJSONStr;
	}
//	更改系统公告
	@RequestMapping("/renote")
	@ResponseBody
	public String reNote(String note){
		return systemConfServiceImpl.updateConfById(1, note);
	}
}

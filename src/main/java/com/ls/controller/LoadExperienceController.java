package com.ls.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ls.entity.ExperienceBaseInfo;
import com.ls.service.impl.LoadExperienceServiceImpl;
import com.ls.utils.CommonUtil;

@Controller
public class LoadExperienceController {
	@Autowired
	private LoadExperienceServiceImpl loadExperienceServiceImpl;
//	返回首页经验分享
	@RequestMapping("/loadExp")
	@ResponseBody
	public String loadExp(){
		System.out.println("1111");
		List<ExperienceBaseInfo> selectExpBaseInfoByStatus = loadExperienceServiceImpl.selectExpBaseInfoByStatus(1, 6);
		for (ExperienceBaseInfo experienceBaseInfo : selectExpBaseInfoByStatus) {
			System.out.println(experienceBaseInfo.getExperienceTitle());
		}
		String normal = CommonUtil.beanListToJSONStr(loadExperienceServiceImpl.selectExpBaseInfoByStatus(1,6));
		System.out.println("normal"+normal);
		return normal;
	}
}

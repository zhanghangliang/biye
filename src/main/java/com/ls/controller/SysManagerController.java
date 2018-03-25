package com.ls.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ls.service.impl.LoginServiceImpl;
import com.ls.utils.CommonUtil;

@Controller
public class SysManagerController {
	@Autowired
	private LoginServiceImpl loginServiceImpl;
	
	@RequestMapping("checkManager")
	public ModelAndView checkManager(HttpServletRequest request) {
		ModelAndView mv =new ModelAndView();
		try {
			Integer userType = loginServiceImpl.selectUserType(CommonUtil.getUserID(request));
			if (userType==1||userType==2) {
				mv.setViewName("/manager");
				mv.addObject("userType",userType);
			}else{
				mv.setViewName("/message");
				mv.addObject("message","error");
			}
			return mv;
		} catch (Exception e) {
			mv.setViewName("/message");
			mv.addObject("message","error");
			return mv;
		}
	}
}

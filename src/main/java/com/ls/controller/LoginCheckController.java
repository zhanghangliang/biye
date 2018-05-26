package com.ls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ls.service.impl.LoginServiceImpl;

@Controller
public class LoginCheckController {
	@Autowired
	private LoginServiceImpl loginServiceImpl;
//	判断登录时输入的密码账号
	@RequestMapping("/logincheck")
	@ResponseBody
	public String allcheck(@RequestParam("loginac")String loginac,@RequestParam("loginpwd")String loginpwd) {
		return loginServiceImpl.loginCheck(loginac, loginpwd);
	}
//	登录时判读是否被ban
	@RequestMapping(value="/banTime",method=RequestMethod.GET)
	public ModelAndView ban(@RequestParam("time")String time){
		 ModelAndView mv=new ModelAndView();
	     mv.setViewName("/ban");
	     mv.addObject("time",time);
	     return mv;
	}
}

package com.ls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ls.service.impl.RegisServiceImpl;
//注册检测账号是否存在
@Controller
@RequestMapping(value = "/regischeck", method = RequestMethod.POST)
public class RegisCheckController {
	@Autowired
	private RegisServiceImpl regisServiceImpl;

	@RequestMapping("/accheck")
	@ResponseBody
	public String accheck(@RequestParam("lsaccount") String lsaccount) {
		if (lsaccount.length() > 4 && lsaccount.length() < 13&&regisServiceImpl.checkAccount(lsaccount)==0) {
			return "success";
		} else
			return "error";
	}
//注册检测账号密码是否符合规则
	@RequestMapping("/allcheck")
	@ResponseBody
	public String allcheck(@RequestParam("lsaccount") String lsaccount, @RequestParam("lspwd") String lspwd,
			@RequestParam("repwd") String repwd) {
		if (lsaccount.length() >= 5 && lsaccount.length() < 13&&regisServiceImpl.checkAccount(lsaccount)==0){
			if(lspwd.equals(repwd)&&lspwd.length()>5&&lspwd.length()<15){
				Integer regis = regisServiceImpl.regis(lsaccount, lspwd);
				return regis.toString()+"_"+lsaccount;
			}
			return "pwd";
		}
			return "ac";
	}
}

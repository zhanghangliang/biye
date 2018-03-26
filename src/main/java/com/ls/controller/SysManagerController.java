package com.ls.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ls.service.impl.LoginServiceImpl;
import com.ls.service.impl.ManagerInfoServiceImpl;
import com.ls.utils.CommonUtil;

@Controller
public class SysManagerController {
	@Autowired
	private LoginServiceImpl loginServiceImpl;
	@Autowired
	private ManagerInfoServiceImpl managerInfoServiceImpl;
	
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
	
	@RequestMapping("getUserLimit")
	@ResponseBody
	public String getUserLimit(@RequestParam("limit")Integer limit) {
		String beanListToJSONStr = CommonUtil.beanListToJSONStr(managerInfoServiceImpl.selectManagerInfoByLimit(limit));
		System.out.println(beanListToJSONStr);
		return beanListToJSONStr;
	}
	
	@RequestMapping("banByType")
	@ResponseBody
	public String banByType(@RequestParam("banUserList")String banUserList,@RequestParam("banType")Integer banType) {
		try {
			Date conversionTime = loginServiceImpl.conversionTime(banType);
			String[] split = banUserList.split(",");
			for (String userId : split) {
				loginServiceImpl.updateBanTimeByUserID(Integer.parseInt(userId), conversionTime);
			}
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
	
	@RequestMapping("changeType")
	@ResponseBody
	public String changeType(@RequestParam("banUserList")String banUserList,@RequestParam("accType")Integer accType) {
		try {
			String[] split = banUserList.split(",");
			for (String userId : split) {
				if (accType==1) {
					loginServiceImpl.updateTypeByUser(Integer.parseInt(userId), accType);
				}else if(accType==0){
					loginServiceImpl.updateTypeToNormalByUser(Integer.parseInt(userId));
				}
			}
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
}

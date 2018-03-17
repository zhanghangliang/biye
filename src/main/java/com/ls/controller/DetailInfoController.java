package com.ls.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ls.entity.UserDetailInfo;
import com.ls.service.impl.DetailInfoServiceImpl;

@Controller
public class DetailInfoController {
	@Autowired
	private DetailInfoServiceImpl detailInfoServiceImpl;
	
	@RequestMapping("/detailInfo")
	public ModelAndView saveDetailInfo(@RequestParam("cutename")String name,@RequestParam("sex")String sex,@RequestParam("email")String email,@RequestParam("personalProfile")String personalProfile,HttpServletRequest request)
    {
		UserDetailInfo userDetailInfo = new UserDetailInfo();
        ModelAndView mv=new ModelAndView();
		Cookie[] cookies = request.getCookies();
		String message = "error";
		if(cookies!=null){
			for(Cookie cookie:cookies){
				 if ("loginUserid".equals(cookie.getName())) {
					 userDetailInfo.setName(name);
					 userDetailInfo.setEmail(email);
					 userDetailInfo.setPersonalProfile(personalProfile);
					 userDetailInfo.setSex(sex);
					 userDetailInfo.setUserId(Integer.parseInt(cookie.getValue()));
					 message = detailInfoServiceImpl.saveDetailInfo(userDetailInfo);
				}
			}
		}
		mv.addObject("message",message);
        mv.setViewName("/message");
        return mv;
    }
	
	@RequestMapping("/contact")
    public ModelAndView list(HttpServletRequest request)
    {
		UserDetailInfo userDetailInfo = new UserDetailInfo();
        ModelAndView mv=new ModelAndView();
        Cookie[] cookies = request.getCookies();
        if(cookies!=null){
			for(Cookie cookie:cookies){
				 if ("loginUserid".equals(cookie.getName())) {
					 userDetailInfo = detailInfoServiceImpl.selectUserDetailInfo(Integer.parseInt(cookie.getValue()));
				}
			}
		}
        System.out.println(userDetailInfo.getPersonalProfile());
        mv.addObject("User",userDetailInfo);
        mv.setViewName("/contact");
        return mv;
    }
}

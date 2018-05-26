package com.ls.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ls.entity.UserDetailInfo;
import com.ls.service.impl.DetailInfoServiceImpl;
//个人中心
@Controller
public class DetailInfoController {
	@Autowired
	private DetailInfoServiceImpl detailInfoServiceImpl;
	
//	个人昵称信息修改
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
	//跳转个人中心页面
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
        mv.addObject("User",userDetailInfo);
        mv.setViewName("/contact");
        return mv;
    }
//	照片墙修改
	@RequestMapping("/changeSinglePhoto")
    public ModelAndView changePhoto(HttpServletRequest request,@RequestParam("postimg")MultipartFile photo,@RequestParam("which")Integer which)
    {
		String message ="error";
        ModelAndView mv=new ModelAndView("/contact");
        Cookie[] cookies = request.getCookies();
        if(cookies!=null){
			for(Cookie cookie:cookies){
				 if ("loginUserid".equals(cookie.getName())) {
					 message = detailInfoServiceImpl.savePhotoWallInfo(Integer.parseInt(cookie.getValue()), photo, which);
				}
			}
		}
        mv.addObject("message",message);
        mv.setViewName("/message");
        return mv;
    }
}

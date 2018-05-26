package com.ls.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ls.entity.PostBaseInfo;
import com.ls.service.impl.NewPostServiceImpl;
import com.ls.utils.CommonUtil;

@Controller
public class NewPostController {
	@Autowired
	private NewPostServiceImpl newPostServiceImpl;
	@Autowired
	private PostBaseInfo postBaseInfo;
	
	@RequestMapping("/newpost")
	public ModelAndView topage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/uploadpost");
		return mv;
	}
//	上传个人作品
	@RequestMapping(value = "/checkpost")
	@ResponseBody
	public ModelAndView checkpost(HttpServletRequest request,@RequestParam("name") String post_title,
			@RequestParam("postimg") MultipartFile post_file, @RequestParam("message") String post_intro)
			throws Exception {
		ModelAndView mv = new ModelAndView();
		String message = newPostServiceImpl.checkpost(request,post_title, post_file, post_intro);
		if (!"error".equals(message)) {
			Cookie[] cookies = request.getCookies();
			if(cookies!=null){
				for(Cookie cookie:cookies){
					 System.out.println(cookie.getName()+"------"+cookie.getValue());
					 if ("loginUserid".equals(cookie.getName())) {
						 postBaseInfo.setUserId(Integer.parseInt(cookie.getValue()));
						 postBaseInfo.setPostTime(CommonUtil.nowTime());
						 postBaseInfo.setPostImg(message);
						 postBaseInfo.setPostTitle(post_title);
						 postBaseInfo.setPostIntro(post_intro);
						 postBaseInfo.setPostId(null);
						 message = newPostServiceImpl.saveInfo(postBaseInfo);
					}
				}
			}
		}
		mv.addObject("message",message);
		mv.setViewName("/message");
		return mv;
	}
}

package com.ls.controller;

import java.text.ParseException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ls.entity.PostBaseInfo;
import com.ls.entity.PostLike;
import com.ls.service.impl.BarrageServiceImpl;
import com.ls.service.impl.IndexSelectServiceImpl;
import com.ls.service.impl.SinglePostServiceImpl;
import com.ls.utils.CommonUtil;

@Controller
public class SinglePostController {
	@Autowired
	private SinglePostServiceImpl singlePostServiceImpl;
	@Autowired
	private BarrageServiceImpl barrageServiceImpl;
	@Autowired
	private IndexSelectServiceImpl indexSelectServiceImpl;
//	跳转单个作品页面
	@RequestMapping(value = "/single", method = RequestMethod.GET)
	public ModelAndView list(@RequestParam("postid") Integer postID) throws ParseException {
		ModelAndView mv = new ModelAndView();
		PostBaseInfo postBaseInfo = singlePostServiceImpl.selectSingleByPostID(postID);
		String s = CommonUtil.timeparse(postBaseInfo.getPostTime());
		PostLike postLike = singlePostServiceImpl.selectLikeByPostID(postID);
		mv.addObject("postBaseInfo", postBaseInfo);
		mv.addObject("postLike", postLike);
		mv.addObject("time", s);
		mv.setViewName("/single");
		return mv;
	}
//	返回作品评论
	@RequestMapping(value = "/getBarrage", method = RequestMethod.GET)
	@ResponseBody
	public String getBarrage(@RequestParam("postid") Integer postid) {
		String beanListToJSONStr = CommonUtil.beanListToJSONStr(barrageServiceImpl.selectBarrageByPostID(postid));
		System.out.println(beanListToJSONStr);
		return beanListToJSONStr;
	}
//	上传新作品评论
	@RequestMapping("/newBarrage")
	public void newBarrage(HttpServletRequest request, @RequestParam("barrage") String barrage,
			@RequestParam("postid") Integer postid) {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				System.out.println(cookie.getName() + "------" + cookie.getValue());
				if ("loginUserid".equals(cookie.getName())) {
					barrageServiceImpl.insertBarrageByPostIDAndUserID(barrage, postid, Integer.parseInt(cookie.getValue()));
				}
			}
		}
	}
//	删除单个作品
	@RequestMapping("/delByPostID")
	@ResponseBody
	public String delByPostID(@RequestParam("postid")Integer postid) {
		System.out.println(postid);
		indexSelectServiceImpl.deleteLikeByPostID(postid);
		barrageServiceImpl.deleteBarrageByPostID(postid);
		return singlePostServiceImpl.deleteByPostID(postid).toString();
	}
}




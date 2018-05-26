package com.ls.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ls.entity.ExperienceBaseInfo;
import com.ls.entity.ExperienceDetailInfo;
import com.ls.service.impl.ExpBarrageServiceImpl;
import com.ls.service.impl.SingleExpServiceImpl;
import com.ls.utils.CommonUtil;

@Controller
public class ExperienceController {
	@Autowired
	private SingleExpServiceImpl singleExpServiceImpl;
	@Autowired
	private ExpBarrageServiceImpl expBarrageServiceImpl;
//	跳转单个经验分享界面
	@RequestMapping(value="/experience",method=RequestMethod.GET)
    public ModelAndView toExperience(@RequestParam("expID")Integer expID)
    {
		ExperienceBaseInfo baseInfo = singleExpServiceImpl.selectExpBaseInfoByID(expID);
		List<ExperienceDetailInfo> detailInfos = singleExpServiceImpl.selectExpDetailInfoByID(expID);
		if (detailInfos.isEmpty()) {
			detailInfos = singleExpServiceImpl.selectExpDetailInfoByID(11);
		}
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/experience");
        String s = CommonUtil.timeparse(baseInfo.getExperienceTime());
        mv.addObject("baseInfo",baseInfo);
        mv.addObject("detailInfos",detailInfos);
        mv.addObject("time",s);
        return mv;
    }
//	获取经验评论
	@RequestMapping(value = "/getExpBarrage", method = RequestMethod.GET)
	@ResponseBody
	public String getExpBarrage(@RequestParam("expID")Integer expID) {
		String beanListToJSONStr = CommonUtil.beanListToJSONStr(expBarrageServiceImpl.selectBarrageByPostID(expID));
		System.out.println(beanListToJSONStr);
		return beanListToJSONStr;
	}
//	上传新经验评论
	@RequestMapping("/newExpBarrage")
	public void newExpBarrage(HttpServletRequest request, @RequestParam("barrage") String barrage,
			@RequestParam("expID") Integer expID) {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				System.out.println(cookie.getName() + "------" + cookie.getValue());
				if ("loginUserid".equals(cookie.getName())) {
					expBarrageServiceImpl.insertBarrageByPostIDAndUserID(barrage, expID, Integer.parseInt(cookie.getValue()));
				}
			}
		}
	}
}

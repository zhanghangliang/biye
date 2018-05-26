package com.ls.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ls.entity.PostBaseInfo;
import com.ls.service.impl.IndexSelectServiceImpl;

@Controller
public class IndexController {
	@Autowired
	private IndexSelectServiceImpl indexSelectServiceImpl;
//	跳转首页，根据不同搜索条件返回作品
	@RequestMapping(value="/index1",method=RequestMethod.GET)
	public ModelAndView list(@RequestParam("search")String content)
    {
		List<PostBaseInfo> selectFirst = new ArrayList<PostBaseInfo>();
        ModelAndView mv=new ModelAndView();
        if ("all".equals(content)) {
        	content = "想搜点什么呢....";
        	selectFirst = indexSelectServiceImpl.selectFirst("%%",0);
		} else {
			selectFirst = indexSelectServiceImpl.selectFirst("%"+content+"%",0);
			content = "当前搜索："+content;
		}
        if (selectFirst.isEmpty()) {
        	selectFirst = indexSelectServiceImpl.selectFirst("%%",0);
		}
        mv.addObject("searchtype", content);
        mv.addObject("selectFirst", selectFirst);
        mv.setViewName("/inde");
        return mv;
    }
//	返回点赞数
	@RequestMapping("/goodTime")
	@ResponseBody
	public String goodTime(@RequestParam("postid")Integer postid){
		return postid+"_"+indexSelectServiceImpl.selectLike(postid).get(0).getLike().toString();
	}
}

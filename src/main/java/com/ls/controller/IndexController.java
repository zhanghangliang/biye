package com.ls.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping(value="/index1",method=RequestMethod.GET)
	public ModelAndView list(@RequestParam("search")String content)
    {
        ModelAndView mv=new ModelAndView();
        if ("all".equals(content)) {
			content = "想搜点什么呢....";
		}
        mv.addObject("searchtype", content);
        mv.setViewName("/inde");
        return mv;
    }
}

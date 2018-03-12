package com.ls.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SinglePostController {
	
    @RequestMapping("/single")
    public ModelAndView list()
    {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/single");
        return mv;
    }

}

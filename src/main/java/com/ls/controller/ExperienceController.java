package com.ls.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExperienceController {
	@RequestMapping("/experience")
    public ModelAndView toExperience()
    {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("/experience");
        return mv;
    }
}

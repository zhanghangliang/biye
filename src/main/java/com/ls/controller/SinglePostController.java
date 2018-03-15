package com.ls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ls.entity.PostBaseInfo;
import com.ls.entity.PostLike;
import com.ls.service.impl.SinglePostServiceImpl;

@Controller
public class SinglePostController {
	@Autowired
	private SinglePostServiceImpl singlePostServiceImpl;
	
    @RequestMapping(value="/single",method=RequestMethod.GET)
    public ModelAndView list(@RequestParam("postid")Integer postID)
    {
        ModelAndView mv=new ModelAndView();
        PostBaseInfo postBaseInfo = singlePostServiceImpl.selectSingleByPostID(postID);
        PostLike postLike = singlePostServiceImpl.selectLikeByPostID(postID);
        mv.addObject("postBaseInfo",postBaseInfo);
        mv.addObject("postLike",postLike);
        mv.setViewName("/single");
        return mv;
    }

}

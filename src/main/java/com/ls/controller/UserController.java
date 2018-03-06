package com.ls.controller;

import com.ls.entity.User;
import com.ls.service.UserSercice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/test")
public class UserController {
	@Autowired
    UserSercice userService;

    @RequestMapping("/list")
    public ModelAndView list()
    {
        ModelAndView mv=new ModelAndView();
        List<User>  userList=userService.getUser();
        mv.addObject("userList",userList);
        mv.setViewName("/show");
        return mv;
    }

}

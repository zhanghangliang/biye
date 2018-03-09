package com.ls.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginCheckController {
    @RequestMapping(value="/logincheck",method=RequestMethod.POST)
    @ResponseBody
    public String list(@RequestParam("lsaccount")String lsaccount)
    {
    	if ("adm11".equals(lsaccount)) {
    		return "success";
		}
    	else return "error";
    }

}

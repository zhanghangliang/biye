package com.ls.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginHandlerInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		Cookie[] cookies = arg0.getCookies();
		if(cookies!=null){
			for(Cookie cookie:cookies){
				 System.out.println(cookie.getName()+"------"+cookie.getValue());
				 if ("loginUserid".equals(cookie.getName())) {
					return true;
				}
			}
		}
		arg1.sendRedirect("/tipLogin.jsp");
		return false;
	}

}

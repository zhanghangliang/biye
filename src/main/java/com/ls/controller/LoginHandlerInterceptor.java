package com.ls.controller;

import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.ls.service.impl.LoginServiceImpl;
import com.ls.utils.CommonUtil;
//SpringMVC拦截器调用，AOP判断是否被禁
public class LoginHandlerInterceptor implements HandlerInterceptor{
	@Autowired
	private LoginServiceImpl loginServiceImpl;

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
					Date liftBanTime = loginServiceImpl.banTimeCheck(Integer.parseInt(cookie.getValue()));
					if (liftBanTime!=null) {
						if (liftBanTime.compareTo(CommonUtil.nowTime())<=0) {
							return true;
						} else {
							arg1.sendRedirect("/banTime?time="+CommonUtil.timeparse(liftBanTime));
							return false;
						}
					}else return true;
				}
			}
		}
		arg1.sendRedirect("/tipLogin.jsp");
		return false;
	}
}

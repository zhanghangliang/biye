package com.ls.service;

import java.util.Date;

public interface LoginService {
	//登录名密码判断
	public String loginCheck(String loginac,String loginpwd);
	//封禁时间判断
	public Date banTimeCheck(Integer userId) throws Exception;
}

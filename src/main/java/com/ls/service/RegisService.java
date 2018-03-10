package com.ls.service;

public interface RegisService {
	//检查拟用户名是否存在于数据库
	public int checkAccount(String account);
	
	//将新用户信息插入数据库
	public Integer regis(String account,String pwd);
}

package com.ls.service;

import java.util.Date;

public interface LoginService {
	//登录名密码判断
	public String loginCheck(String loginac,String loginpwd);
	//封禁时间判断
	public Date banTimeCheck(Integer userId) throws Exception;
	//管理员，超管，普通用户判断
	public Integer selectUserType(Integer userId);
	//对账号进行封禁
	public String updateBanTimeByUserID(Integer userId,Date liftBanTime);
	//转换封禁时间
	public Date conversionTime(Integer banType) throws Exception;
	//提升为管理员
	public String updateTypeByUser(Integer userId,Integer type);
	//将管理员设为普通用户
	public String updateTypeToNormalByUser(Integer userId);
	//获得用户总数
	public Integer selectUserCount();
}

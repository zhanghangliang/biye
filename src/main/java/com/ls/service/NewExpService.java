package com.ls.service;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public interface NewExpService {
	public String insertFirstCommit(Integer userID, String title, Date time, String content);
	public String insertElseCommit(Integer orderID, Integer expID, String subtitle, MultipartFile subimg, String subcontent) throws Exception;
	public String updateExpStatus(Integer expID,Integer status);
}

package com.ls.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.ls.entity.PostBaseInfo;

public interface NewPostService {
	public String checkpost(HttpServletRequest request,String post_title,MultipartFile post_file,String post_intro);
	public String saveInfo(PostBaseInfo postBaseInfo);
}

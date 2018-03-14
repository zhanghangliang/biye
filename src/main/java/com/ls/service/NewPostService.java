package com.ls.service;

import java.io.InputStream;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import com.ls.entity.PostBaseInfo;

public interface NewPostService {
	public String checkpost(String post_title,MultipartFile post_file,String post_intro);
	public String getStringRandom(int length);
	public void SaveFileFromInputStream(InputStream stream, String path, String filename) throws Exception;
	public String saveInfo(PostBaseInfo postBaseInfo);
	public Date nowTime() throws Exception;
}

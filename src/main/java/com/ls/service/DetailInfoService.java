package com.ls.service;

import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;

import com.ls.entity.UserDetailInfo;

public interface DetailInfoService {
	public String saveDetailInfo(UserDetailInfo userDetailInfo);
	public String savePhotoWallInfo(Integer user,MultipartFile photo,Integer which);
	public UserDetailInfo selectUserDetailInfo(Integer userid);
	void SaveFileFromInputStream(InputStream stream, String path, String filename) throws Exception;
	String getStringRandom(int length);
}

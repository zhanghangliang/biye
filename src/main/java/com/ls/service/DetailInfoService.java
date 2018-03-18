package com.ls.service;

import org.springframework.web.multipart.MultipartFile;

import com.ls.entity.UserDetailInfo;

public interface DetailInfoService {
	public String saveDetailInfo(UserDetailInfo userDetailInfo);
	public String savePhotoWallInfo(Integer user,MultipartFile photo,Integer which);
	public UserDetailInfo selectUserDetailInfo(Integer userid);
}

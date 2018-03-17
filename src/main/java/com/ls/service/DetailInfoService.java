package com.ls.service;

import com.ls.entity.UserDetailInfo;

public interface DetailInfoService {
	public String saveDetailInfo(UserDetailInfo userDetailInfo);
	public String savePhotoWallInfo();
	public UserDetailInfo selectUserDetailInfo(Integer userid);
}

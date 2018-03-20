package com.ls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ls.dao.UserDetailInfoMapper;
import com.ls.entity.UserDetailInfoExample.Criteria;
import com.ls.entity.UserDetailInfo;
import com.ls.entity.UserDetailInfoExample;
import com.ls.service.DetailInfoService;
import com.ls.utils.CommonUtil;

@Service
public class DetailInfoServiceImpl implements DetailInfoService{
	@Autowired
	private UserDetailInfoMapper mapper;
	@Autowired
	private UserDetailInfoExample example;
	
	@Override
	public String saveDetailInfo(UserDetailInfo userDetailInfo) {
		try {
			Criteria criteria = example.createCriteria();
			criteria.andUserIdEqualTo(userDetailInfo.getUserId());
			mapper.updateByExampleSelective(userDetailInfo, example);
			example.clear();
			return "success";
		} catch (Exception e) {
			example.clear();
			return "error";
		}
	}

	@Override
	public String savePhotoWallInfo(Integer user, MultipartFile photo, Integer which) {
		try {
			String stringRandom = CommonUtil.getStringRandom(8);
			switch (photo.getContentType()) {
				case "image/jpeg":
					stringRandom += ".jpg";
					break;
				case "image/bmp":
					stringRandom += ".bmp";
					break;
				case "image/png":
					stringRandom += ".png";
					break;
			}
			/*
			 * 此处地址写死
			 */
			CommonUtil.SaveFileFromInputStream(photo.getInputStream(), CommonUtil.showImgPath()+"photowall/"+user, stringRandom);
			mapper.updateByUseridAndWhich("photo"+which, "images/photowall/"+user+"/"+stringRandom, user);
			return "wait";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
	
	@Override
	public UserDetailInfo selectUserDetailInfo(Integer userid) {
		UserDetailInfo info =new UserDetailInfo();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userid);
		if(mapper.countByExample(example)==0){
			info.setUserId(userid);
			mapper.insert(info);
		}
		List<UserDetailInfo> list = mapper.selectByExampleWithBLOBs(example);
		example.clear();
		return list.get(0);
	}
}

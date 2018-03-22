package com.ls.service.impl;

import java.io.File;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ls.dao.ExperienceBaseInfoMapper;
import com.ls.dao.ExperienceDetailInfoMapper;
import com.ls.entity.ExperienceBaseInfo;
import com.ls.entity.ExperienceBaseInfoExample;
import com.ls.entity.ExperienceBaseInfoExample.Criteria;
import com.ls.entity.ExperienceDetailInfo;
import com.ls.service.NewExpService;
import com.ls.utils.CommonUtil;

@Service
public class NewExpServiceImpl implements NewExpService{
	@Autowired
	private ExperienceBaseInfoMapper baseInfoMapper;
	@Autowired
	private ExperienceDetailInfoMapper detailInfoMapper;
	@Autowired
	private ExperienceBaseInfoExample baseInfoExample;
	

	@Override
	public String insertFirstCommit(Integer userID, String title, Date time, String content) {
		ExperienceBaseInfo experienceBaseInfo = new ExperienceBaseInfo();
		experienceBaseInfo.setUserId(userID);
		experienceBaseInfo.setExperienceTitle(title);
		experienceBaseInfo.setExperienceTime(time);
		experienceBaseInfo.setExperienceContent(content);
		experienceBaseInfo.setStatus(0);
		baseInfoMapper.insert(experienceBaseInfo);
		experienceBaseInfo.getExperienceId();
		return experienceBaseInfo.getExperienceId().toString();
	}

	@Override
	public String insertElseCommit(Integer orderID, Integer expID, String subtitle, MultipartFile subimg,
			String subcontent) throws Exception{
		File root2=new File(".");
		String rootDir2=root2.getCanonicalPath();
		System.out.println(rootDir2);
		ExperienceDetailInfo experienceDetailInfo = new ExperienceDetailInfo();
		String stringRandom = CommonUtil.getStringRandom(8);
		switch (subimg.getContentType()) {
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
		CommonUtil.SaveFileFromInputStream(subimg.getInputStream(), CommonUtil.showImgPath()+"exp/"+expID, stringRandom);
		try {
			experienceDetailInfo.setExperienceId(expID);
			experienceDetailInfo.setExperienceSubcontent(subcontent);
			experienceDetailInfo.setExperienceSubtitle(subtitle);
			experienceDetailInfo.setOrderId(orderID);
			experienceDetailInfo.setExperienceSubimg("exp/"+expID+"/"+stringRandom);
			detailInfoMapper.insert(experienceDetailInfo);
		} catch (Exception e) {
			return "error";
		}
		return "success";
	}

	@Override
	public String updateExpStatus(Integer expID, Integer status) {
		try {
			Criteria criteria = baseInfoExample.createCriteria();
			criteria.andExperienceIdEqualTo(expID);
			ExperienceBaseInfo experienceBaseInfo = new ExperienceBaseInfo();
			experienceBaseInfo.setStatus(status);
			baseInfoMapper.updateByExampleSelective(experienceBaseInfo, baseInfoExample);
			baseInfoExample.clear();
			return "success";
		} catch (Exception e) {
			return "error";
		}
	}
}

package com.ls.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ls.dao.UserDetailInfoMapper;
import com.ls.entity.UserDetailInfoExample.Criteria;
import com.ls.entity.UserDetailInfo;
import com.ls.entity.UserDetailInfoExample;
import com.ls.service.DetailInfoService;

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
			String stringRandom = getStringRandom(8);
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
			SaveFileFromInputStream(photo.getInputStream(), "E:/L&SWorkspace/LS/WebContent/images/photowall/"+user, stringRandom);
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
	
	@Override
	public void SaveFileFromInputStream(InputStream stream, String path, String filename) throws Exception {
		File file =new File(path);
		//如果文件夹不存在则创建    
		if  (!file .exists()  && !file .isDirectory())      
		{file .mkdir();}
		FileOutputStream fs = new FileOutputStream(path + "/" + filename);
		byte[] buffer = new byte[1024 * 1024];
		int bytesum = 0;
		int byteread = 0;
		while ((byteread = stream.read(buffer)) != -1) {
			bytesum += byteread;
			fs.write(buffer, 0, byteread);
			fs.flush();
		}
		fs.close();
		stream.close();
	}
	
	@Override
	public String getStringRandom(int length) {
		String val = "";
		Random random = new Random();
		// length为几位密码
		for (int i = 0; i < length; i++) {
			String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
			// 输出字母还是数字
			if ("char".equalsIgnoreCase(charOrNum)) {
				// 输出是大写字母还是小写字母
				int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
				val += (char) (random.nextInt(26) + temp);
			} else if ("num".equalsIgnoreCase(charOrNum)) {
				val += String.valueOf(random.nextInt(10));
			}
		}
		return val;
	}
}

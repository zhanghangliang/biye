package com.ls.service.impl;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.ls.dao.PostBaseInfoMapper;
import com.ls.dao.PostLikeMapper;
import com.ls.entity.PostBaseInfo;
import com.ls.entity.PostLike;
import com.ls.service.NewPostService;

@Service
public class NewPostServiceImpl implements NewPostService {
	@Autowired
	private PostBaseInfoMapper postBaseInfoMapper;
	@Autowired
	private PostLikeMapper postLikeMapper;
	@Autowired
	private PostLike postLike;
	
	@Override
	public String checkpost(String post_title, MultipartFile post_file, String post_intro){
		try {
			System.out.println(post_title);
			System.out.println(post_intro);
			System.out.println(post_file.getContentType());
			String stringRandom = getStringRandom(8);
			switch (post_file.getContentType()) {
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
			SaveFileFromInputStream(post_file.getInputStream(), "D:/LS/newpost", stringRandom);
			return "D:/LS/newpost/"+stringRandom;
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
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

	@Override
	public void SaveFileFromInputStream(InputStream stream, String path, String filename) throws Exception {
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
	public Date nowTime() throws Exception {
		Date now=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(now);
		return sdf.parse(s);
	}
	
	@Override
	public String saveInfo(PostBaseInfo postBaseInfo) {
			postBaseInfoMapper.insert(postBaseInfo);
			postLike.setPostId(postBaseInfo.getPostId());
			postLike.setLike(0);
			postLikeMapper.insert(postLike);
			return "success";
	}
}

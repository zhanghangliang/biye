package com.ls.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ls.dao.PostBaseInfoMapper;
import com.ls.dao.PostLikeMapper;
import com.ls.entity.PostBaseInfo;
import com.ls.entity.PostLike;
import com.ls.service.NewPostService;
import com.ls.utils.CommonUtil;

@Service
public class NewPostServiceImpl implements NewPostService {
	@Autowired
	private PostBaseInfoMapper postBaseInfoMapper;
	@Autowired
	private PostLikeMapper postLikeMapper;
	@Autowired
	private PostLike postLike;
	
	@Override
	public String checkpost(HttpServletRequest request,String post_title, MultipartFile post_file, String post_intro){
		try {
			System.out.println(post_title);
			System.out.println(post_intro);
			System.out.println(post_file.getContentType());
			String stringRandom = CommonUtil.getStringRandom(8);
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
			/*
			 * 此处地址写死
			 */
			CommonUtil.SaveFileFromInputStream(post_file.getInputStream(), CommonUtil.showImgPath()+"newpost", stringRandom);
			return "newpost/"+stringRandom;
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	@Override
	public String saveInfo(PostBaseInfo postBaseInfo) {
			postBaseInfoMapper.insert(postBaseInfo);
			postLike.setPostId(postBaseInfo.getPostId());
			postLike.setLike(0);
			postLikeMapper.insert(postLike);
			return postBaseInfo.getPostId().toString();
	}
}

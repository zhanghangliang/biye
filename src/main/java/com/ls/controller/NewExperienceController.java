package com.ls.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ls.service.impl.NewExpServiceImpl;
import com.ls.utils.CommonUtil;

@Controller
public class NewExperienceController {
	@Autowired
	private NewExpServiceImpl newExpServiceImpl;

	private void showURL() throws IOException {

        // 第一种：获取类加载的根路径   D:\git\daotie\daotie\target\classes
        File f = new File(this.getClass().getResource("/").getPath());
        System.out.println(f);

        // 获取当前类的所在工程路径; 如果不加“/”  获取当前类的加载目录  D:\git\daotie\daotie\target\classes\my
        File f2 = new File(this.getClass().getResource("").getPath());
        System.out.println(f2);

        // 第二种：获取项目路径    D:\git\daotie\daotie
        File directory = new File("");// 参数为空
        String courseFile = directory.getCanonicalPath();
        System.out.println(courseFile);


        // 第三种：  file:/D:/git/daotie/daotie/target/classes/
        URL xmlpath = this.getClass().getClassLoader().getResource("");
        System.out.println(xmlpath);


        // 第四种： D:\git\daotie\daotie
        System.out.println(System.getProperty("user.dir"));
        /*
         * 结果： C:\Documents and Settings\Administrator\workspace\projectName
         * 获取当前工程路径
         */

        // 第五种：  获取所有的类路径 包括jar包的路径
        System.out.println(System.getProperty("java.class.path"));

    }
//	跳转上传经验界面
	@RequestMapping("/newExperience")
	public ModelAndView toExperience() throws Exception {
		ModelAndView mv = new ModelAndView();
		showURL();
		mv.setViewName("/newExperience");
		return mv;
	}
//	上传经验第一部分
	@RequestMapping("firstCommit")
	@ResponseBody
	public String firstCommit(HttpServletRequest request, @RequestParam("name") String title,
			@RequestParam("message") String content) throws Exception {
		Integer userID = CommonUtil.getUserID(request);
		String result = "error";
		if (userID != null) {
			result = newExpServiceImpl.insertFirstCommit(userID, title, CommonUtil.nowTime(), content);
		}
		return result;
	}
//	上传经验副部分
	@RequestMapping("elseCommit")
	@ResponseBody
	public String elseCommit(@RequestParam("orderID") Integer orderID, @RequestParam("name") String subtitle,
			@RequestParam("message") String subcontent, @RequestParam("postimg") MultipartFile subimg,
			@RequestParam("expID") Integer expID) throws Exception {
		return newExpServiceImpl.insertElseCommit(orderID, expID, subtitle, subimg, subcontent);
	}
//	用户点击结束后，修改经验状态码
	@RequestMapping(value="/finalCommit",method=RequestMethod.GET)
	public ModelAndView finalCommit(@RequestParam("expID")Integer expID) {
		ModelAndView mv = new ModelAndView();
		if("success".equals(newExpServiceImpl.updateExpStatus(expID, 1))){
			mv.addObject("message","wait");
		}else {
			mv.addObject("message","error");
		}
		mv.setViewName("/message");
		return mv;
	}
}

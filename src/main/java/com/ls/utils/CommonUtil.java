package com.ls.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

public class CommonUtil {
	/**
     * 将对象转换成JSON格式的字符串 适用于单个对象(单个对象里可以包含List<T>)的转换
     */
    public static <T> String beanToJSONStr(T t) {
        String json = "";
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class,
                new JsonDateValueProcessor());
        if(t!=null){
        json = JSONObject.fromObject(t, jsonConfig).toString();
        }else{
            json="[]";
        }
        return json;
    }
    /**
     * 将实体类List转换成JSON格式的字符串
     */
    public static <T> String beanListToJSONStr(List<T> t) {
        String json = "";
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class,
                new JsonDateValueProcessor());
        if(t!=null){
        json = JSONArray.fromObject(t, jsonConfig).toString();
        }else{
            json="[]";
        }
        return json;
    }
	
	/**
	 * 获取指定位数的随机值(包含字母数字)
	 */
	public static String getStringRandom(int length) {
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
	
	/**
	 * 储存MultipartFile
	 */
	public static void SaveFileFromInputStream(InputStream stream, String path, String filename) throws Exception {
		File file =new File(path);
		//如果文件夹不存在则创建    
		if  (!file .exists()  && !file .isDirectory())      
		{file .mkdirs();}
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
	
	/**
	 * date转换为通用时间格式
	 */
	public static String timeparse(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}
	
	/**
	 * 按通用格式获取当前时间
	 */
	public static Date nowTime() throws Exception {
		Date now=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(now);
		return sdf.parse(s);
	}
	
	/**
	 * 获取request中cookie的userid
	 */
	public static Integer getUserID(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if(cookies!=null){
			for(Cookie cookie:cookies){
				 if ("loginUserid".equals(cookie.getName())) {
					 return Integer.parseInt(cookie.getValue());
				 }
			}
		}
		return null;
	}
	
	/**
	 * 返回图片img储存位置
	 */
	public static String showImgPath() throws Exception {
        File directory = new File("");// 参数为空
        String courseFile = directory.getCanonicalPath();
        courseFile = courseFile.replace("\\", "/");    
//		return courseFile+"/WebContent/images/";
        return "E:/L&SWorkspace/LS/WebContent/images/";
    }
}

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Light & Shadow </title>
		<link rel="stylesheet" href="css/menu.css">
		<link rel="stylesheet" href="css/style.css">
		<link rel="stylesheet" type="text/css" href="css/newpost/newpost.css">
		
		    <!-- 按钮美化 -->
    <link rel="stylesheet" type="text/css" href="css/button/normalize.css" />
	<link rel="stylesheet" type="text/css" href="css/button/vicons-font.css" />
	<link rel="stylesheet" type="text/css" href="css/button/base.css" />
	<link rel="stylesheet" type="text/css" href="css/button/buttons.css" />
	
	</head>
	<body>
		<div class="header">
		<div id='cssmenu' >
			<ul>
			<li class="active"><a href='index1?search=all'><span style="word-spacing:3px">L i g h t  &  S h a d o w</span></a></li>
			   <li id="Exp" class=' has-sub'><a href="#"><span>| 经验分享专区 |</span></a>
				  <ul>
					 <li class='has-sub'><a href="#"><span>&nbsp&nbsp&nbsp&nbsp随便看看</span></a>
						<ul>
						   <li id="Exp1">
						   </li>
						</ul>
					 </li>
					 <li class='has-sub'><a href="#"><span>&nbsp&nbsp&nbsp&nbsp大师专区</span></a>
						<ul>
						   <li id="Exp2">
						   </li>
						</ul>
					 </li>
				  </ul>
			   </li>
			   <li><a href="/newpost"><span>| 个人作品上传 |</span></a></li>
			   <li><a href='/newExperience'><span>| 摄影经验分享 |</span></a></li>
			   <li class='last'><a href='/contact'><span>| 个人中心 |</span></a></li>
			</ul>
		</div>
	</div>
		<form action="/checkpost" method="post" class="smart-green" enctype="multipart/form-data" onsubmit="return check();">
			<h1>摄影作品上传<span>与同一个世界 · 分享 · 不一样的美好</span></h1>
			<label> 
				<br><span>作品标题:</span>
				<input id="name" type="text" name="name" placeholder="给你的作品起个名字吧！" maxlength="14"/>
			</label>
			<label>
				<br>
				<span>图片素材:</span>
				<label><label id="filelabel" for="file"><span id="postimg">点击此处上传</span></label><br><br></label>
				<input type="file" accept="image/*" id="file" name="postimg" style="display: none"/>
				<div id="image1" style="width:auto;height:auto; background:#CCCCCC;" hidden="hidden">
				    <center><img id="showspan" height="auto" width="auto" border="5px"/></center>
				</div>
			</label>
			<label>
				<br><span>图片简介:</span>
				<textarea id="message" name="message" placeholder="最大字数不超过200字" maxlength="200"></textarea> 
			</label>
			<center>
					<br><span>&nbsp;</span>
					<input type="submit">
			</center>
		</form>
	<script type="text/javascript" src="js/jquery-2.1.1.js" ></script>
	<script type="text/javascript" src="js/newpost/newpost.js" ></script>
	
	<!-- Exp -->
	<script type="text/javascript" src="js/exp/loadExp.js" ></script>
	
	</body>
</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Light & Shadow </title>

<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/default.css">
<link rel="stylesheet" type="text/css" href="css/menu.css">

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
						   <div>
<a href="http://localhost:8080/experience?expID=15"><button class="button button--ujarak button--border-thin button--text-thick">[摄影大讲堂001]美食摄影技巧</button></a>
<span style="width:200px;border:1px;float:right;border-style:dashed none;padding:2px 20px;margin:0px 0px 5px 0px">2018-03-21 16:51:17</span><br><br><span style="font-size:14px;float:left;text-indent:2em;max-width:200px;margin:0px 0px 20px 20px">在拍摄的过程中，你有哪些适用于自己的经验？又有哪些技巧可以便于拍摄？以下是来自Photoventure优秀摄影师们的9条经验之谈，不知是否会对你有所帮助。</span>
</div>
<div>
<a href="http://localhost:8080/experience?expID=11"><button class="button button--ujarak button--border-thin button--text-thick">[摄影大讲堂005]美食摄影技巧</button></a>
<span style="width:200px;border:1px;float:right;border-style:dashed none;padding:2px 20px;margin:0px 0px 5px 0px">2018-03-21 16:51:17</span><br><br><span style="font-size:14px;float:left;text-indent:2em;max-width:200px;margin:0px 0px 0px 20px;">在拍摄的过程中，你有哪些适用于自己的经验？又有哪些技巧可以便于拍摄？以下是来自Photoventure优秀摄影师们的9条经验之谈，不知是否会对你有所帮助。</span>
</div>
<center><input id="reExp1" type="button" style="margin:0"/></i></center>
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
			   <li class='last' id="loginOut"><a href="/index1?search=all" onclick="loginOut()"><span>| 退出账户 |</span></a></li>
			</ul>
		</div>
<div id="wrapper">
  <div id="left-side">
	<ul>
	  <li class="choose active">
		照片墙预览
	  </li>
	  <li class="pay">
		信息管理
	  </li>
	  <li class="wrap">
		个人统计
	  </li>
	  <li class="ship">
		个性展示
	  </li>
	</ul>
  </div>

  <div id="border">
	<div id="line" class="one"></div>
  </div>

  <div id="right-side">
	<div id="first" class="active">
		<input class="photowallimg" type="button" value="更改说明" onclick=note()>
	  <fieldset>
		<legend class="title">
			照片墙
		</legend>
		<div class="cont">
			<div class="wall">
				<img title="照片墙1" class="img1" src="${User.photo1}" height="105" width="125" alt="未上传">
				<img title="照片墙2" class="img2" src="${User.photo2}" height="105" width="125" alt="未上传">
			</div>
			<div class="wall">
				<img title="照片墙3" class="img3" src="${User.photo3}" height="90" width="105" alt="未上传">
				<img title="照片墙4" class="img4" src="${User.photo4}" height="135" width="150" alt="未上传">
				<img title="照片墙5" class="img5" src="${User.photo5}" height="60" width="75" alt="未上传">
			</div>
			<div class="wall">
				<img title="照片墙6" class="img6" src="${User.photo6}" height="105" width="125" alt="未上传">
				<img title="照片墙7" class="img7" src="${User.photo7}" height="105" width="125" alt="未上传">
			</div>
		</div>
	  </fieldset>
	  <label id="filelabel" for="file"><span class="photowallimg">上传图片</span></label>
	  <form action="/changeSinglePhoto" method="post" enctype="multipart/form-data" onsubmit=>
	  	<input value="准备图片" type="file" accept="image/*" id="file" name="postimg" size="10" style="display: none"/>
	  	<input id="which" type="text" name="which" style="display: none"/>
	  	<input id="wallpush" type="submit" style="display: none"/>
	  </form>
	
	
		
	</div>
	
	
	<div id="second">
	  <div id="testleft">
		<form action="/detailInfo" method="post">
			<span class='baseInf'>昵&nbsp&nbsp称&nbsp&nbsp
				<input type="text" value="${User.name}" name="cutename" placeholder="昵称限8字以内" required>
			</span>
			<br>
			<br>
			<div style='height:7px'></div>
			<span class='baseInf'>性&nbsp&nbsp别&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
				<tr><td>
					<input class="sex" type="radio" name="sex" value="1"/>男&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<input class="sex" type="radio" name="sex" value="2" checked="checked"/>女
				</td></tr>
			</span>
		</div>
		<div id="testright">
			<span>邮&nbsp&nbsp箱&nbsp&nbsp<input type="email" value="${User.email}" name="email" placeholder="请输入有效的邮箱地址" required></span>
			<br><br>
			<span>签名档<input type="text" value="${User.personalProfile}" name="personalProfile" required></span>
			<br><br>
			<input class="rightButton" type="submit" value=" 提交信息 "/>
		</form>
		</div>
	</div>
	
	<div id="third">
		<div class="one"><center>个人作品数</center><div class="bott">8篇</div></div>
		<div class="two"><center>个人摄影数</center><div class="bott">2篇</div></div>
		<div class="three"><center>个人评论数</center><div class="bott">34条</div></div>
	</div>
	
	<div id="fourth">
	  <div class="icon big">
		<svg viewBox="0 0 32 32">
		  <g filter="">
			<use xlink:href="#package"></use>
		  </g>
		</svg>
	  </div>

	  <h1>个人简介</h1>

	  <p>大家很容易在网络或各类摄影书籍，学习到正统摄影技术。但正所谓理论是死，摄影是活的，很多技巧都要经验累积和自我判断才能拍到张出色相片。若新手想提升摄影技术，不妨参考一下我的文章哦~</p>

	</div>
  </div>
</div>

<script type="text/javascript" src="js/jquery-2.1.1.js"></script>
<script type="text/javascript" src="js/cookie.js"></script>
<script type="text/javascript" src="js/contact/person.js"></script>
<script type="text/javascript" src="js/contact/photowall.js"></script>

<!-- Exp -->
	<script type="text/javascript" src="js/exp/loadExp.js" ></script>

</body>
</html>

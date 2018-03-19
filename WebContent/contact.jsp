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

</head>
<body>
	<div class="header">
		<div id='cssmenu' >
			<ul>
			   <li class="active"><a href='index1?search=all'><span>L&nbspI&nbspG&nbspH&nbspT&nbsp&nbsp&amp&nbsp&nbspS&nbspH&nbspA&nbspD&nbspO&nbspW</span></a></li>
			   <li class=' has-sub'><a href="#"><span>Category</span></a>
				  <ul>
					 <li class='has-sub'><a href="#"><span>Sub Item</span></a>
						<ul>
						   <li><a href="#"><span>Sub Item</span></a></li>
						   <li class='last'><a href="#"><span>Sub Item</span></a></li>
						</ul>
					 </li>
					 <li class='has-sub'><a href="#"><span>Item 2</span></a>
						<ul>
						   <li><a href="#"><span>Sub Item</span></a></li>
						   <li class='last'><a href="#"><span>Sub Item</span></a></li>
						</ul>
					 </li>
				  </ul>
			   </li>
			   <li><a href="/newpost"><span>| 摄影作品上传 |</span></a></li>
			   <li><a href='/experience'><span>| 摄影经验分享 |</span></a></li>
			   <li class='last'><a href='/contact'><span>| 个人中心 |</span></a></li>
			   <li class='last' id="loginOut"><a href="/index1?search=all" onclick="loginOut()"><span>| 退出账户 |</span></a></li>
			</ul>
		</div>
<div id="wrapper">
  <div id="left-side">
	<ul>
	  <li class="choose active">
		个人资料
	  </li>
	  <li class="pay">
		照片墙预览
	  </li>
	  <li class="wrap">
		信息管理
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
		
		
		
	</div>
	
	
	<div id="second">
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
	
	<div id="third">
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
	
	
	<div id="fourth">
	  <div class="icon big">
		<svg viewBox="0 0 32 32">
		  <g filter="">
			<use xlink:href="#package"></use>
		  </g>
		</svg>
	  </div>

	  <h1>Ship it</h1>

	  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec at viverra est, eu finibus mauris. Quisque tempus vestibulum fringilla. Morbi tortor eros, sollicitudin eu arcu sit amet, aliquet sagittis dolor. </p>

	</div>
  </div>
</div>

<script type="text/javascript" src="js/jquery-2.1.1.js"></script>
<script type="text/javascript" src="js/cookie.js"></script>
<script type="text/javascript" src="js/contact/person.js"></script>
<script type="text/javascript" src="js/contact/photowall.js"></script>

</body>
</html>

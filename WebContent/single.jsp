<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta name="author" content="#">

<title>Light & Shadow</title>

<!-- SmartMenus jQuery Bootstrap Addon CSS -->
<link href="css/menu.css" rel="stylesheet">

<!-- Custom CSS -->
<link rel="stylesheet" type="text/css" href="css/style.css">

<!-- Custom Fonts -->
<link rel="stylesheet"
	href="font-awesome-4.4.0/css/font-awesome.min.css" type="text/css">

<link rel="stylesheet" href="css/lightbox.css">

<!-- 右侧评论框 -->
<link rel="stylesheet" href="css/single/swiper.min.css">
<link rel="stylesheet" href="css/single/barrage.css">

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
				  </ul>
			   </li>
			   <li><a href="/newpost"><span>| 个人作品上传 |</span></a></li>
			   <li><a href='/newExperience'><span>| 摄影经验分享 |</span></a></li>
				<li class='last'><a href='/contact'><span>| 个人中心 |</span></a></li>
			</ul>
		</div>
	</div>

	<div id="page-content" class="sub-page">
		<div class="container" id="${postBaseInfo.postId}">
			<center>
				<article>
					<a class="example-image-link"
						href="http://localhost:8080/images/${postBaseInfo.postImg}"
						data-lightbox="example-set"> <img class="example-image"
						src="http://localhost:8080/images/${postBaseInfo.postImg}" alt="" /></a>
					<div class="content-item">
						<h3 class="title-item">
							<a href="#">${postBaseInfo.postTitle}</a>
						</h3>
						<div class="time">${time}</div>
						<ul class="list-inline">
							<li><a href="#"><i class="fa fa-eye"></i> 260</a></li>
							<li><a href="#"><i class="fa fa-comment"></i> 260</a></li>
							<li><a href="#"><i class="fa fa-heart"></i>${postLike.like}</a></li>
							<li><a href="#"><i class="fa fa-share"></i> 260</a></li>
						</ul>
						<br>
						<p class="info">${postBaseInfo.postIntro}</p>
						<br>
					</div>
					<div class="bottom-item">
						<a href="#" class="btn btn-share share"><i
							class="fa fa-share-alt"></i> Share</a> <span class="user f-right">Posted
							by <a href="#">Jason Lemon</a><img src="images/ava-1.jpg">
						</span>
					</div>
				</article>
			</center>
			</div>
		</div>
	</div>
	
	<div class="NYwishes">
		<h2>图片评论</h2>
		<div class="swiper-container">
			<div id="conts">
				<div class="dm">
					<!--d_screen start-->
					<div class="d_screen">
						<div class="d_show">
						<jsp:useBean id="time" class="java.util.Date"/>  
							<div><center><fmt:formatDate value="<%=time%>" pattern="yyyy-MM-dd HH:mm:ss"/></center></div>
							<div><center>Light & Shadow</center></div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="send">
			<div class="input">
				<input id="reply-write" name="content" type="text" value=""
					placeholder="分享你的感受">
			</div>
			<div class="send-btn">
				<a onClick="send_reply2()">发送</a>
			</div>
		</div>
	</div>
	
	<script type="text/javascript" src="js/jquery-2.1.1.js"></script>

	<script src="js/lightbox-plus-jquery.min.js"></script>

	<!-- Menu -->
	<script src="js/script.js"></script>
	
	<!-- 右侧评论框 -->
	<script type="text/javascript" src="js/single/swiper.min.js"></script>
	<script type="text/javascript" src="js/single/barrage.js"></script>
	
	<!-- Exp -->
	<script type="text/javascript" src="js/exp/loadExp.js" ></script>
</body>
</html>
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

<!-- 仿微博评论功能 -->
<link rel="stylesheet" href="css/pinglun/style.css">
<link rel="stylesheet" href="css/pinglun/comment.css">

<!-- 右侧评论框 -->
<link rel="stylesheet" href="css/single/swiper.min.css">
<link rel="stylesheet" href="css/single/barrage.css">

</head>
<body>

	<div class="header">
		<div id='cssmenu'>
			<ul>
				<li class="active"><a href='index1?search=all'><span>L&nbspI&nbspG&nbspH&nbspT&nbsp&nbsp&amp&nbsp&nbspS&nbspH&nbspA&nbspD&nbspO&nbspW</span></a></li>
				<li class=' has-sub'><a href='#'><span>Category</span></a>
					<ul>
						<li class='has-sub'><a href='#'><span>Item 1</span></a>
							<ul>
								<li><a href='#'><span>Sub Item</span></a></li>
								<li class='last'><a href='#'><span>Sub Item</span></a></li>
							</ul></li>
						<li class='has-sub'><a href='#'><span>Item 2</span></a>
							<ul>
								<li><a href='#'><span>Sub Item</span></a></li>
								<li class='last'><a href='#'><span>Sub Item</span></a></li>
							</ul></li>
					</ul></li>
				<li><a href="/newpost"><span>| 摄影作品上传 |</span></a></li>
				<li><a href='/single'><span>| 摄影经验分享 |</span></a></li>
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

			<div class="commentAll">
				<!--评论区域 begin-->
				<div class="reviewArea clearfix">
					<textarea class="content comment-input"
						placeholder="Please enter a comment&hellip;" onkeyup="keyUP(this)"></textarea>
					<a href="javascript:;" class="plBtn">评论</a>
				</div>
				<!--评论区域 end-->
				<!--回复区域 begin-->
				<div class="comment-show">
					<div class="comment-show-con clearfix">
						<div class="comment-show-con-img pull-left">
							<img src="images/header-img-comment_03.png" alt="">
						</div>
						<div class="comment-show-con-list pull-left clearfix">
							<div class="pl-text clearfix">
								<a href="#" class="comment-size-name">张三 : </a> <span
									class="my-pl-con">&nbsp;来啊 造作啊!</span>
							</div>
							<div class="date-dz">
								<span class="date-dz-left pull-left comment-time">2017-5-2
									11:11:39</span>
								<div class="date-dz-right pull-right comment-pl-block">
									<a href="javascript:;" class="removeBlock">删除</a> <a
										href="javascript:;"
										class="date-dz-pl pl-hf hf-con-block pull-left">回复</a> <span
										class="pull-left date-dz-line">|</span> <a href="javascript:;"
										class="date-dz-z pull-left"><i class="date-dz-z-click-red"></i>赞
										(<i class="z-num">666</i>)</a>
								</div>
							</div>
							<div class="hf-list-con"></div>
						</div>
					</div>
				</div>
				<!--回复区域 end-->
			</div>
		</div>
	</div>
	
	<!-- 右侧评论框 -->
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

	<!-- 仿微博评论功能 -->
	<script type="text/javascript" src="js/pinglun/jquery.flexText.js"></script>
	<script type="text/javascript" src="js/pinglun/pinglun.js"></script>
	
	<!-- 右侧评论框 -->
	<script type="text/javascript" src="js/single/swiper.min.js"></script>
	<script type="text/javascript" src="js/single/barrage.js"></script>
</body>
</html>
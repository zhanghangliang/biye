<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
	
    <title>Light & Shadow </title>
	
	<link rel="stylesheet" href="css/menu.css">
	
	<!-- CSS -->
    <link rel="stylesheet" type="text/css" href="css/style.css">
	
	<!-- Fonts -->
    <link rel="stylesheet" href="font-awesome-4.4.0/css/font-awesome.min.css"  type="text/css">
	
	<link rel="stylesheet" href="css/lightbox.css">
	
	<!-- Icon -->
	<link rel="shortcut icon" href="images/favicon.ico" />
	
	<!-- login --> 
	<link rel="stylesheet" type="text/css" href="css/component.css" />
	<link rel="stylesheet" type="text/css" href="css/content.css" />
	
	<!-- 缩放搜索栏 -->
	<link rel="stylesheet" href="css/sou.css">
	
	<!-- 初始化 jQuery -->
    <script type="text/javascript" src="js/jquery-2.1.1.js" ></script>
	
	<!-- jQuery 瀑布流 -->
	<script type="text/javascript" src="js/jquery.pinto.js"></script>
	
    <!-- cookies 操作 -->
    <script type="text/javascript" src="js/cookie.js"></script>
	
	<!-- jQuery 主控js：无限下拉 -->
	<script type="text/javascript" src="js/main.js"></script>
	
</head>
<body>
	
		<!-- search -->
	<div id="search_bar" class="search_bar">
		<form id="myform">
			<input class="input" placeholder=${searchtype} 
			type="text" name="searchtype" id="search" maxlength="10">
			<input class="search_btn" type="submit" value="">
			<span class="search_ico"><i class="fa fa-search"></i></span>
		</form>
	</div>
		<!-- search end -->
		
	<div class="header">
		<div id='cssmenu' >
			<ul>
			   <li class="active"><a href='index.jsp'><span>L&nbspI&nbspG&nbspH&nbspT&nbsp&nbsp&amp&nbsp&nbspS&nbspH&nbspA&nbspD&nbspO&nbspW</span></a></li>
			   <li class=' has-sub'><a href="#"><span>Category</span></a>
				  <ul>
					 <li class='has-sub'><a href="#"><span>Item 1</span></a>
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
			   <li><a href='/single'><span>| 摄影经验分享 |</span></a></li>
			</ul>
		</div>
		
			   <!-- login -->
			   <div class="mockup-content" value="1" hidden="hidden">
					<div class="morph-button morph-button-modal morph-button-modal-2 morph-button-fixed">
						<button type="button">登 录</button>
						<div class="morph-content">
							<div>
								<div class="content-style-form content-style-form-1">
									<span class="icon icon-close">Close the dialog</span>
									<h2 style="font-size:40px;font-weight:bold;">登&nbsp&nbsp&nbsp&nbsp录</h2>
									<form>
										<p><label>用户名</label><input id="loginac" type="text" /></p>
										<p><label>密码</label><input id="loginpwd" type="password" /></p>
										<p><button type="button" id="login">点&nbsp&nbsp击&nbsp&nbsp登&nbsp&nbsp录</button></p>
									</form>
								</div>
							</div>
						</div>
					</div><!-- morph-button -->
					<div class="morph-button morph-button-modal morph-button-modal-3 morph-button-fixed">
						<button type="button">注 册</button>
						<div class="morph-content">
							<div>
								<div class="content-style-form content-style-form-2">
									<span class="icon icon-close">Close the dialog</span>
									<h2 style="font-size:40px;font-weight:bold;" >注&nbsp&nbsp&nbsp&nbsp册</i></h2>
									<form>
										<p><label>登录账号</label><input id="zhuceaccount" name="lsaccount" type="text" onkeyup="value=value.replace(/[^\w\.\/]/ig,'')" maxlength="13" placeholder="请输入5-13位账号"/></p>
										<p><label>密码</label><input id="lspwd" name="lspasswd" type="password" maxlength="15" placeholder="请输入6-15位密码"/></p>
										<p><label>再次输入密码</label><input id="repwd" type="password" maxlength="15" placeholder="请再次输入密码"/></p>
										<p><button id="newregis" type="button" >点&nbsp&nbsp击&nbsp&nbsp注&nbsp&nbsp册</button></p>
									</form>
								</div>
							</div>
						</div>
					</div><!-- morph-button -->
				</div><!-- /form-mockup -->
				<!-- login end -->
		
	</div>
	<div id="page-content" class="index-page">
		<div id="container">
			<div class="item">
				<a class="example-image-link" href="images/25.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/25.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Children</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.Aenean feugiat in ante et blandit, Vestibulum e risu. Aenean feugiat in ante et blandit.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞99999+ <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/27.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/27.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Startup</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.Aenean feugiat in ante et blandit, Vestibulum e risu. Aenean feugiat in ante et blandit.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/28.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/28.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Sun</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.Aenean feugiat in ante et blandit, Vestibulum e risu. Aenean feugiat in ante et blandit.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/29.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/29.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">The Eiffel Tower</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.Aenean feugiat in ante et blandit, Vestibulum e risu. Aenean feugiat in ante et blandit.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/30.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/30.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Water drops</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.Aenean feugiat in ante et blandit, Vestibulum e risu. Aenean feugiat in ante et blandit.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/01.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/01.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Agfa</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/02.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/02.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Auto</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.</p>
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/03.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/03.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Bald eagle</a></h3>
					<span class="time">SEPTEMBER 30TH</span>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.</p>
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/04.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/04.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Black swan</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.Aenean feugiat in ante et blandit. Vestibulum e risu.</p>
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/05.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/05.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Book shelf</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risu.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/06.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/06.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Camera</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risu.Aenean feugiat in ante et blandit. Vestibulum e risu.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/07.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/07.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Camera</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risu.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/08.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/08.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Vintage camera</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/09.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/09.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Coffee</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/10.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/10.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Cookies</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/12.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/12.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">DJ</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.Aenean feugiat in ante et blandit. Vestibulum e risu.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/11.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/11.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Cubes</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.Aenean feugiat in ante et blandit. Vestibulum e risu.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/13.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/13.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Doors</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/14.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/14.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Matchbox</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.Aenean feugiat in ante et blandit, Vestibulum e risu. Aenean feugiat in ante et blandit.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/15.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/15.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Freiburg</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.Aenean feugiat in ante et blandit.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/16.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/16.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Henna</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. nte et blandit, Vestibulum e risu. Aenean feugiat in ante et blandit.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/17.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/17.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Home office</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.Aenean feugiat in ante et blandit, Vestibulum e risu. Aenean feugiat in ante et blandit.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/18.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/18.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">iPad</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.Aenean fenean feugiat in ante et blandit.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/19.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/19.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Matchbox</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac i, Vestibulum e risu. Aenean feugiat in ante et blandit.Vestibulum e risu. Aenean feugiat in ante et blandit.Vestibulum e risu. Aenean feugiat in ante et blandit.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/20.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/20.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Lynx</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.Aenean feugiat in ante et blandit, Vestibulum e risu. Aenean feugiat in ante et blandit.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/21.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/21.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Mac</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.Aenean feugiat in ante et blandit, Vestibulum e risu. Aenean feugiat in ante et blandit.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/22.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/22.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Notebook</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.Aenean feugiat in ante et blandit, Vestibulum e risu. Aenean feugiat in ante et blandit.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/23.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/23.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Thoughts</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.Aenean feugiat in ante et blandit, Vestibulum e risu. Aenean feugiat in ante et blandit.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/24.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/24.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Office</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.Aenean feugiat in ante et blandit, Vestibulum e risu. Aenean feugiat in ante et blandit.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
			<div class="item">
				<a class="example-image-link" href="images/26.jpg" data-lightbox="example-set" data-title="点击图像右半部分向前移动"><img class="example-image" src="images/26.jpg" alt="#"/></a>
				<div class="content-item">
					<h3 class="title-item"><a href="/single">Portrait</a></h3>
					<div class="time"> SEPTEMBER 30TH<input class="adminDelete" type="image" src="images/dell.jpg" name="img" style="float:right;height:20px;width:20px;display:none"></div>
					<p class="info">Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus, ac interdum magna porta non.Aenean feugiat in ante et blandit, Vestibulum e risu. Aenean feugiat in ante et blandit.</p>
					
				</div>
				<div class="bottom-item">
					<span class='btn btn-like'>赞10 <i class='fa fa-thumbs-o-up'></i></span>
					<a href="#" class="btn btn-comment"><i class="fa fa-comment-o"></i></a>
					<a href="/single" class="btn btn-more"><i class="fa fa-long-arrow-right "></i></a>
				</div>
			</div>
		</div>
	</div>
    
	<!-- jQuery 点赞 -->
	<script type="text/javascript" src="js/good.js"></script>

	<!-- Light Box -->
	<script src="js/lightbox-plus-jquery.min.js"></script>
	
	<!-- Menu -->
	<script src="js/script.js"></script>
	
	<!-- jQuery 登录注册 -->
	<script src="js/modernizr.custom.js"></script>
	<script src="js/classie.js"></script>
	<script src="js/uiMorphingButton_fixed.js"></script>
	
	<!-- 缩放搜索栏 -->
	<script type="text/javascript" src="js/sou.js" ></script>
	
	<!-- admin Del -->
	<script type="text/javascript" src="js/adminDel.js"></script>
	
	<!-- regis check -->
	<script type="text/javascript" src="js/logincheck/regislogincheck.js" ></script>
	
</body>
</html>
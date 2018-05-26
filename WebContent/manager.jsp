<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<title>系统管理平台</title>
	<link rel="stylesheet" href="css/manager/manager.css" type="text/css" media="all" />
</head>
<body>
<!-- Header -->
<div id="header">
	<div class="shell">
		<!-- Logo + Top Nav -->
		<div id="top">
			<h1><a href="/index1?search=all">Light & Shadow 系统管理平台</a></h1>
			<div id="top-navigation">
				欢迎您 <a href="#"><strong>系统管理员(${userType}级)</strong></a>
				<span>|</span>
				<a href="/index1?search=all" onclick="loginOut()">退出账户</a>
			</div>
		</div>
		<!-- End Logo + Top Nav -->
	</div>
</div>
<!-- End Header -->
<!-- Container -->
<div id="container">
	<div class="shell">	
		<br />
		<!-- Main -->
		<div id="main">
			
			<!-- Content -->
			<div id="content">
				
				<!-- Box -->
				<div class="box">
					<!-- Box Head -->
					<div class="box-head">
						<h2 class="left">用户列表</h2>
						<div class="right">
							<label>欢迎使用| 光影之间  |后台管理系统</label>
						</div>
					</div>
					<!-- End Box Head -->	

					<!-- Table -->
					<div class="table">
						<table id="area" width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<th width="13"><input type="button" id="allcheck" value="全选" onclick="allone()"/></th>
								<th>用户名</th>
								<th>账号状态</th>
								<th>账号类别</th>
								<th>上传作品</th>
								<th>摄影经验</th>
								<th>经验评论</th>
								<th>作品评论</th>
								<th width="80" class="ac">查看发布作品</th>
							</tr>
						</table>
						
						
						<!-- Pagging -->
						<div class="pagging">
							<div class="left">总计 <i id="all">45</i> 位用户</div>
							<div class="right">
								<a href="#" onclick="jumpPage('up')">上一页</a>
								<a href="#" onclick="choosePage()">当前页：<i id="nowPage">1</i></a>
								<a href="#" onclick="jumpPage('down')">下一页</a>
								<a href="#" onclick="jumpPage('last')">最后一页</a>
							</div>
						</div>
						<!-- End Pagging -->
						
					</div>
					<!-- Table -->
					
				</div>
				<!-- End Box -->
				
				<div id="msgArea"></div>

			</div>
			<!-- End Content -->
			
			<!-- Sidebar -->
			<div id="sidebar">
				
				<!-- Box -->
				<div class="box">
					
					<!-- Box Head -->
					<div class="box-head">
						<h2>管理工具</h2>
					</div>
					<!-- End Box Head-->
					
					<div class="box-content">
						<div class="cl">&nbsp;</div>
						
						<a href="#" class="add-button" onclick="ban(3)"><span>封三天</span></a>
						<a href="#" class="add-button" onclick="ban(15)"><span>封十五天</span></a>
						<a href="#" class="add-button" onclick="ban(9999)"><span>永久封禁</span></a>
						<a href="#" class="add-button" onclick="ban(0)"><span>账号解封</span></a>
						<c:choose>
							<c:when test="${userType ==2}">
								<a href="#" class="add-button" onclick="changeType(1)"><span>提为管理</span></a>
								<a href="#" class="add-button" onclick="changeType(0)"><span>降为用户</span></a>
							</c:when>	
						</c:choose>
						<div class="cl">&nbsp;</div>
					</div>
					<div class="box-head">
						<h2>系统设置</h2>
					</div>
					<div class="box-content">
							<a href="#" class="add-button" onclick="reNote()"><span>更新公告</span></a>
						<div class="cl">&nbsp;</div>				
					</div>
					
				</div>
				<!-- End Box -->
			</div>
			<!-- End Sidebar -->
			
			<div class="cl">&nbsp;</div>			
		</div>
		<!-- Main -->
	</div>
</div>
<!-- End Container -->

	<script type="text/javascript" src="js/jquery-2.1.1.js"></script>
	<script type="text/javascript" src="js/cookie.js"></script>
	<script type="text/javascript" src="js/manager/manager.js" ></script>
	
</body>
</html>
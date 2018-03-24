<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background: url(../images/wood.png)">
	<center><div style="height:200px"></div>
		<div style="padding:50px;width:40%;background-color:rgba(255,255,255,0.8);">
			<center><span style="font-size:24px;font-weight:600;">您的账号因发布敏感言论，已被封禁</span></center>
			<center><span style="font-size:20px;font-weight:600;"><br><br>解封时间为：${time}</span></center>
		</div>
	</center>
	<meta http-equiv="refresh" content="6;url=/index1?search=all">
</body>
</html>
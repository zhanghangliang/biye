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
			<c:choose>
				<c:when test="${message =='error'}">
					<center><span style="font-size:24px;font-weight:600;">抱歉，出现了一点问题</span></center>
					<center><span style="font-size:20px;font-weight:600;"><br><br>即将跳转到首页</span></center>
					<meta http-equiv="refresh" content="3;url=/index1?search=all">
				</c:when>
				<c:when test="${message =='wait'}">
					<center><span style="font-size:24px;font-weight:600;">正在审核中，先逛逛首页吧</span></center>
					<center><span style="font-size:20px;font-weight:600;"><br><br>即将跳转到首页</span></center>
					<meta http-equiv="refresh" content="3;url=/index1?search=all">
				</c:when>
				<c:when test="${message =='success'}">
					<center><span style="font-size:24px;font-weight:600;">修改个人信息成功!</span></center>
					<center><span style="font-size:20px;font-weight:600;"><br><br>即将跳转到个人中心</span></center>
					<meta http-equiv="refresh" content="3;url=/contact">
				</c:when>
				<c:otherwise>
					<center><span style="font-size:24px;font-weight:600;">上传作品成功!</span></center>
					<center><span style="font-size:20px;font-weight:600;"><br><br>即将跳转到详细界面</span></center>
					<meta http-equiv="refresh" content="3;url=/single?postid=${message}">
				</c:otherwise>
			</c:choose>
		</div>
	</center>
	
</body>
</html>
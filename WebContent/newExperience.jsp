<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
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
<link rel="stylesheet" type="text/css" href="css/menu.css">
<link rel="stylesheet" type="text/css" href="css/newpost/newpost.css">

    <!-- 按钮美化 -->
    <link rel="stylesheet" type="text/css" href="css/button/normalize.css" />
	<link rel="stylesheet" type="text/css" href="css/button/vicons-font.css" />
	<link rel="stylesheet" type="text/css" href="css/button/base.css" />
	<link rel="stylesheet" type="text/css" href="css/button/buttons.css" />

</head>
<body>
	<div id="saveExpID"style="display:none" value="">这是存放expID的</div>
	<div id='cssmenu' >
			<ul>
			   <li class="active"><a href='index1?search=all'><span>L&nbspI&nbspG&nbspH&nbspT&nbsp&nbsp&amp&nbsp&nbspS&nbspH&nbspA&nbspD&nbspO&nbspW</span></a></li>
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
	
	<script type="text/javascript" src="js/jquery-2.1.1.js"></script>

	<!-- Menu -->
	<script src="js/script.js"></script>

	<script type="text/javascript" src="js/jquery-form.js"></script>
	<script type="text/javascript" src="js/experience/experience.js"></script>
	
	<!-- Exp -->
	<script type="text/javascript" src="js/exp/loadExp.js" ></script>

</body>
</html>
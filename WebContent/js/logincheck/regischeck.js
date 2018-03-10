$("#zhuceaccount").change(function() {
	accountcheck();
});
$("#repwd").keyup(function(){
	pwdcheck();
});
$("#lspwd").keyup(function(){
	pwdcheck();
});
$("#newregis").click(function(){
	overcheck();
});



function overcheck(){
	$.post("/regischeck/allcheck", {
		lsaccount : $("#zhuceaccount").val(),
		lspwd : $("#lspwd").val(),
		repwd : $("#repwd").val()
	}, function(data,status) {
		if (data == "pwd"){
			alert("密码不符合规范");
			pwdcheck();
		}else if (data == "ac"){
			alert("账号不符合规范");
			accountcheck();
		} else {
			setCookie('loginUser',data,1);
			setCookie('loginType','travel',1);
			alert("注册成功,点击返回首页");
			window.location.href="index1?search=all";
		}
	})
}
function accountcheck(){
	$("#equalA").remove();
	$.post("/regischeck/accheck", {
		lsaccount : $("#zhuceaccount").val()
	}, function(data,status) {
		if (data == "success") {
				$('#zhuceaccount').css("width","92%")
				$('#zhuceaccount').parent().append('<i id="equalA" class="fa fa-check-circle-o" style="color: #33cc33;font-size:24px;padding-left:5px"></i>');
		} else {
			$('#zhuceaccount').css("width","92%")
			$('#zhuceaccount').parent().append('<i id="equalA" class="fa fa-times-circle-o" style="color: #ff0000;font-size:24px;padding-left:5px"></i>');
		}
	})
}
function pwdcheck(){
	$("#equalB").remove();
	if($("#lspwd").val()==$("#repwd").val()&&$("#lspwd").val().length>4){
		$('#repwd').css("width","92%");
		$('#repwd').parent().append('<i id="equalB" class="fa fa-check-circle-o" style="color: #33cc33;font-size:24px;padding-left:5px"></i>');
		var i = 1;
	} else {
		$('#repwd').css("width","92%");
		$('#repwd').parent().append('<i id="equalB" class="fa fa-times-circle-o" style="color: #ff0000;font-size:24px;padding-left:5px"></i>');
	}
}
//登出
function loginOut(){
	delCookie("loginUserid");
	delCookie("loginUser");
	delCookie("loginType");
}

//全选反选
$("#allcheck").click(function(){
	if($(this).prop('checked')){
		$(".checkbox").prop("checked",true);
	}else {
		$(".checkbox").prop("checked",false);
	}
});

//显示成功(1)或失败(2)提示
var num = 1;
function showTip(type){
	$("#msgArea").children().remove();
	if(type==1){
		$("#msgArea").append('<div class="msg msg-ok"> <p><strong>操作编号：'+num+++' 成功！</strong></p></div>');
	}
	else if(type==2){
		$("#msgArea").append('<div class="msg msg-error"> <p><strong>操作编号：'+num+++' 取消，请按规定进行操作</strong></p></div>');
	}
}

//选择页数
function choosePage(){
	var name = prompt("请输入页码(共"+10+"页)：", "");
}

//更新公告
function reNote(){
	var note = prompt("请输入公告(100字以内)：", "");
	if(note!=null&&note.length<=100){
		$.post("/renote", {
			note : note
		}, function(data,status) {
			if (data == "success"){
				showTip(1);
			} else {
				showTip(2);
			}
		})
	}else{
		showTip(2);
	}
}
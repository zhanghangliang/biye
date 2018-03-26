//登出
function loginOut() {
	delCookie("loginUserid");
	delCookie("loginUser");
	delCookie("loginType");
}
// 全选反选
var checked = 0;
$("#allcheck").click(function() {
	if (checked == 0) {
		$(".checkbox").prop("checked", true);
		checked = 1;
	} else {
		$(".checkbox").prop("checked", false);
		checked = 0;
	}
});
// 初始化全选
function recheck() {
	$(".checkbox").prop("checked", false);
	checked = 0;
}
// 显示成功(1)或失败(2)提示
var num = 1;
function showTip(type) {
	$("#msgArea").children().remove();
	if (type == 1) {
		$("#msgArea").append(
				'<div class="msg msg-ok"> <p><strong>操作编号：' + num++
						+ ' 成功！</strong></p></div>');
	} else if (type == 2) {
		$("#msgArea").append(
				'<div class="msg msg-error"> <p><strong>操作编号：' + num++
						+ ' 取消，请按规定进行操作</strong></p></div>');
	}
}
// 选择页数
function choosePage() {
	var name = prompt("请输入页码(共" + 10 + "页)：", "");
}
// 获取所有checkbox状态
function getCheckbox() {
	var list = "";
	$.each($('input:checkbox:checked'), function() {
		list += $(this).parent().parent().parent().attr("id");
		list += ",";
	});
	return list;
}
// 封号与解封
function ban(bantype) {
	var list = getCheckbox();
	if (list == "" || list == undefined || list == null || list == "[]") {
		alert("请选择进行该操作的用户");
		return;
	}
	console.log(list);
	$.post("/banByType", {
		banUserList : list,
		banType : bantype
	}, function(data, status) {
		if (data == "success") {
			showTip(1);
		} else {
			showTip(2);
		}
	})
	recheck();
}
//提升与降低权限
function changeType(accType){
	var list = getCheckbox();
	if (list == "" || list == undefined || list == null || list == "[]") {
		alert("请选择进行该操作的用户");
		return;
	}
	console.log(list);
	$.post("/changeType", {
		banUserList : list,
		accType : accType
	}, function(data, status) {
		if (data == "success") {
			showTip(1);
		} else {
			showTip(2);
		}
	})
	recheck();
}
// 更新公告
function reNote() {
	var note = prompt("请输入公告(100字以内)：", "");
	if (note != null && note.length <= 100) {
		$.post("/renote", {
			note : note
		}, function(data, status) {
			if (data == "success") {
				showTip(1);
			} else {
				showTip(2);
			}
		})
	} else {
		showTip(2);
	}
}
// 请求分页并渲染页面
var limit = 0;
function getUser(num) {
	$
			.ajax({
				url : "/getUserLimit",
				type : "post",
				data : {
					limit : limit
				},
				dataType : "json",
				complete : function(data) {
					var date = eval("(" + JSON.stringify(data) + ")").responseJSON;
					console.log(eval("(" + JSON.stringify(data) + ")"));
					for (i = 0; i < date.length; i++) {
						$("#area")
								.append(
										'<tr class="odd" id='
												+ date[i].userId
												+ '> <td><center><input type="checkbox" class="checkbox" /></center></td> <td><h3><a href="#">'
												+ date[i].account
												+ '</a></h3></td> <td>'
												+ date[i].ban
												+ '</td> <td>'
												+ date[i].type
												+ '</td> <td>'
												+ date[i].postNum
												+ '</td> <td>'
												+ date[i].expNum
												+ '</td> <td>'
												+ date[i].postBarrageNum
												+ '</td> <td>'
												+ date[i].expBarrageNum
												+ '</td> <td><center><a href="#" class="ico edit">详情</a></center></td> </tr>');
					}
				}
			});
}
// 页面加载完毕后，进行user分页初始化
$(function() {
	$("#nowbegin").text("45");
	getUser(limit);
});
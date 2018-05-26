//登出
function loginOut() {
	delCookie("loginUserid");
	delCookie("loginUser");
	delCookie("loginType");
}
// 全选反选
var checked = 0;
function allone() {
	if (checked == 0) {
		$.each($('input:checkbox'), function() {
			$(this).prop("checked", true);
		});
		checked = 1;
	} else {
		$.each($('input:checkbox'), function() {
			$(this).prop("checked", false);
		});
		checked = 0;
	}
};
// 初始化全选
function recheck() {
	$.each($('input:checkbox'), function() {
		$(this).prop("checked", false);
	});
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
var zhengze = /^[0-9]+$/ ;
function choosePage() {
	var name = prompt("请输入页码(共" + Math.ceil(acnum / 8) + "页)：", "");
	if (name <= Math.ceil(acnum / 8)&&name>0&&zhengze.test(name)) {
		jumpPage(name);
	} else {
		showTip(2);
	}
}
// 根据传入值调用相应函数(数字为页数，up为上一页，down为下一页，last为末页)
function jumpPage(pageNum) {
	if (pageNum == "up") {
		if ($("#nowPage").text() == 1) {
			alert("当前已为第一页");
		} else {
			jumpToPage(parseInt($("#nowPage").text()) - parseInt(1));
		}
	} else if (pageNum == "down") {
		if ($("#nowPage").text() == Math.ceil(acnum / 8)) {
			alert("当前已为最后一页");
		} else {
			jumpToPage(parseInt($("#nowPage").text()) + parseInt(1));
		}
	} else if (pageNum == "last") {
		if ($("#nowPage").text() == Math.ceil(acnum / 8)) {
			alert("当前已为最后一页");
		} else {
			jumpToPage(Math.ceil(acnum / 8));
		}
	} else {
		if($("#nowPage").text()==pageNum){
			alert("当前已为所选页");
		} else {
			jumpToPage(pageNum);
		}
	}
}
// 获取所选页面数据
function jumpToPage(jumpTo) {
	limit = jumpTo*8-8;
	reArea();
	getUser();
	countUser();
	$("#nowPage").text(jumpTo);
	showTip(1);
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
			jumpToPage($("#nowPage").text());
			reArea();
			showTip(1);
		} else {
			showTip(2);
		}
	})
	recheck();
}
// 提升与降低权限
function changeType(accType) {
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
			jumpToPage($("#nowPage").text());
			reArea();
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
function getUser() {
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
//初始化用户展示区域
function reArea(){
	$("#area").children().remove();
	$("#area").append('<tr> <th width="13"><input type="button" id="allcheck" value="全选" onclick="allone()"/></th> <th>用户名</th> <th>账号状态</th> <th>账号类别</th> <th>上传作品</th> <th>摄影经验</th> <th>经验评论</th> <th>作品评论</th> <th width="80" class="ac">查看发布作品</th> </tr>');
}
// 获得用户总数
var acnum = 0;
function countUser() {
	$.post("/getUserCount", function(data, status) {
		$("#all").text(data - 1);
		acnum = data - 1;
	})
}
// 页面加载完毕后，进行user分页初始化
$(function() {
	countUser();
	getUser(limit);
});

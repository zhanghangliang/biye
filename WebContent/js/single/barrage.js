function send_reply2() {
var content = $("#reply-write").val();

if ($.trim(content) == "") {
	alert("亲，您发送的内容为空！");
	return false;
}
	$.post("/newBarrage",{
		barrage : $("#reply-write").val(),
		postid  : $(".container").attr("id")
	})
	var text=$("#reply-write").val();
	input(text);
	$("#reply-write").val("");
   	if($(".d_show").height()>180){
   		init_screen();
		$($(".d_show").children("div").get(0)).toggle(1000);
		$($(".d_show").children("div").get(0)).remove();
	}
}
$(function(){
	var date=[{"barrage":"哇美女","postId":5,"userId":5},{"barrage":"看起来完全不像死板的犹太人，能够感受到那种犹太节日不一样的气息","postId":5,"userId":3},{"barrage":"看起来不错哦","postId":5,"userId":26},{"barrage":"这背景模糊绝了！","postId":5,"userId":3},{"barrage":"给up主点赞！！！","postId":5,"userId":27},{"barrage":"前排瓜子花生出售","postId":5,"userId":2},{"barrage":"66666","postId":5,"userId":2},{"barrage":"萌萌哒","postId":5,"userId":25},{"barrage":"66666666666","postId":5,"userId":5},{"barrage":"前排露脸+1","postId":5,"userId":5},{"barrage":"还有类似的图片咩","postId":5,"userId":5}];
	$.ajax({url:"/getBarrage",dataType:"json",data:"postid="+$(".container").attr("id"),complete:function(data){date=eval("("+JSON.stringify(data)+")").responseJSON}});
	var i=2;
	setInterval(function(){
		if($(".d_show").height()<280){
			if(i<date.length){
				input(date[i].barrage)
				i++;
			}else{
				i=0	
				input(date[i].barrage)
				i++;
			}
		}else{
			init_screen();
			$($(".d_show").children("div").get(0)).remove();
			if(i<date.length){
				input(date[i].barrage)
				i++;
			}else{
				i=0	
				input(date[i].barrage)
				i++;
			}
		}
	},1000);
	
	$("#reply-write").keyup(function(ev){
		var ev=ev||event;
		if(ev.keyCode==13){
			send_reply2();
		}
	});
})
function init_screen(){
	$(".d_show").find("div").show().each(function () {
		setInterval(function(){
		 $($(".d_show").children("div").get(0)).toggle(1000);
		},1000);
	});
}	
function input(val){
	var div=$("<div>"+val+"</div>");
	$(".d_show").append(div.fadeIn(1000));
}
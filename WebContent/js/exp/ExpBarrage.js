function send_reply2() {
var content = $("#reply-write").val();

if ($.trim(content) == "") {
	alert("亲，您发送的内容为空！");
	return false;
}
	$.post("/newExpBarrage",{
		barrage : $("#reply-write").val(),
		expID  : $(".container").attr("id")
	})
	var text=$("#reply-write").val();
	input(text)
	$("#reply-write").val("");
   	if($(".d_show").height()>180){
   		init_screen();  
		$($(".d_show").children("div").get(0)).toggle(1000);
		$($(".d_show").children("div").get(0)).remove();
	}
}
$(function(){
	var date=[];
	$.ajax({url:"/getExpBarrage",dataType:"json",data:"expID="+$(".container").attr("id"),complete:function(data){date=eval("("+JSON.stringify(data)+")").responseJSON}});
	var i=2;
	setInterval(function(){
		if($(".d_show").height()<280){
			if(i<date.length){
				input(date[i].expBarrage)
				i++;
			}else{
				i=0	
				input(date[i].expBarrage)
				i++;
			}
		}else{
			init_screen();
			$($(".d_show").children("div").get(0)).remove();
			if(i<date.length){
				input(date[i].expBarrage)
				i++;
			}else{
				i=0	
				input(date[i].expBarrage)
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
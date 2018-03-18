function send_reply2() {
var content = $("#reply-write").val();
if ($.trim(content) == "") {
	alert("亲，您发送的内容为空！");
	return false;
}
	var text=$("#reply-write").val();
	input(text)
	$("#reply-write").val("");
   	init_screen();  
   	if($(".d_show").height()>180){
		$($(".d_show").children("div").get(0)).toggle(1000);
		$($(".d_show").children("div").get(0)).remove();
	}
}
$(function(){
	var date=[{'id':1,'val':'站长素材'},{'id':2,'val':'新年花枝俏'},{'id':3,'val':'俏也不争春'},{'id':4,'val':'只报福来报'},{'id':4,'val':'冬雪静静飘'},{'id':4,'val':'祝福悄悄到'},{'id':4,'val':'快乐在你身边绕'},{'id':4,'val':'好运相伴不会少'},{'id':4,'val':'sc.chinaz.com'}];
	var i=0;
	setInterval(function(){
		if($(".d_show").height()<280){
			if(i<date.length){
				input(date[i].val)
				i++;
			}else{
				i=0	
				input(date[i].val)
				i++;
			}
		}else{
			init_screen();
			$($(".d_show").children("div").get(0)).remove();
			if(i<date.length){
				input(date[i].val)
				i++;
			}else{
				i=0	
				input(date[i].val)
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
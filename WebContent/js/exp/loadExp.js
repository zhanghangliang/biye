var tip = 0;
//加载Exp
$("#Exp").hover(function(){
	if(tip==0){
		var date = [{"experienceContent":"双目捕捉那落日的光环，它融于整个天际，在山的后面，在树的后面。日落时段可爱的时光，同时也是完美无瑕的风景。对于艺术家来说，日落是永不凋落的艺术主题，同样，对于摄影师来说，亦然。这里我们收集到了一些非常","experienceId":11,"experienceTime":"2018-03-20 17:11:43","experienceTitle":"[新手]实战教学—夕阳拍摄","status":1,"userId":29}];
		$.ajax({url:"/loadExp",dataType:"json",complete:function(data){date=eval("("+JSON.stringify(data)+")").responseJSON;console.log(date[1].experienceTitle);
		$("#Exp1").append(
			'<div><a href="/experience?expID='+date[0].experienceId+'"><button class="button button--ujarak button--border-thin button--text-thick">'
			+ date[0].experienceTitle
			+ '</button></a> <a href="/experience?expID='+date[0].experienceId+'"><button class="button button--ujarak button--border-thin button--text-thick">'
			+ date[1].experienceTitle
			+ '</button></a> <a href="/experience?expID='+date[0].experienceId+'"><button class="button button--ujarak button--border-thin button--text-thick">'
			+ date[2].experienceTitle
			+ '</button></a> </div> <div> <a href="/experience?expID='+date[0].experienceId+'"><button class="button button--ujarak button--border-thin button--text-thick">'
			+ date[3].experienceTitle
			+ '</button></a> <a href="/experience?expID='+date[0].experienceId+'"><button class="button button--ujarak button--border-thin button--text-thick">'
			+ date[4].experienceTitle
			+ '</button></a> <a href="/experience?expID='+date[0].experienceId+'"><button class="button button--ujarak button--border-thin button--text-thick">'
			+ date[5].experienceTitle
			+ '</button></a> </div> <center><i class="fa fa-repeat"><input id="reExp1" type="button" value="换一批"/></i></center>');
		}});
		tip=1;
	}
},function(){});
//换一批    随便看看
$("#Exp").children($("#reExp1")).click(function(){
	var date = [];
	$("#Exp1").children().remove();
	$.ajax({url:"/loadExp",dataType:"json",complete:function(data){date=eval("("+JSON.stringify(data)+")").responseJSON;console.log(date[1].experienceTitle);
	$("#Exp1").append(
		'<div><a href="/experience?expID='+date[0].experienceId+'"><button class="button button--ujarak button--border-thin button--text-thick">'
		+ date[0].experienceTitle
		+ '</button></a> <a href="/experience?expID='+date[0].experienceId+'"><button class="button button--ujarak button--border-thin button--text-thick">'
		+ date[1].experienceTitle
		+ '</button></a> <a href="/experience?expID='+date[0].experienceId+'"><button class="button button--ujarak button--border-thin button--text-thick">'
		+ date[2].experienceTitle
		+ '</button></a> </div> <div> <a href="/experience?expID='+date[0].experienceId+'"><button class="button button--ujarak button--border-thin button--text-thick">'
		+ date[3].experienceTitle
		+ '</button></a> <a href="/experience?expID='+date[0].experienceId+'"><button class="button button--ujarak button--border-thin button--text-thick">'
		+ date[4].experienceTitle
		+ '</button></a> <a href="/experience?expID='+date[0].experienceId+'"><button class="button button--ujarak button--border-thin button--text-thick">'
		+ date[5].experienceTitle
		+ '</button></a> </div> <center><i class="fa fa-repeat"><input id="reExp1" type="button" value="换一批"/></i></center>');
	}});
});

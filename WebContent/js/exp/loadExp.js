var status = 0;
//加载Exp
$("#Exp").hover(function(){
	if(status==0){
		$("#Exp1").append('<div> <a href="#1"><button class="button button--ujarak button--border-thin button--text-thick">[摄影大讲堂001]美食摄影技巧</button></a> <a href="#2"><button class="button button--ujarak button--border-thin button--text-thick">[摄影大讲堂</button></a> <a href="#3"><button class="button button--ujarak button--border-thin button--text-thick">[摄影大讲堂003]美食摄影技巧</button></a> <a href="#4"><button class="button button--ujarak button--border-thin button--text-thick">[摄影大讲堂004]美食摄影技巧</button></a> </div> <div> <a href="#5"><button class="button button--ujarak button--border-thin button--text-thick">[摄影大讲堂005]美食摄影技巧</button></a> <a href="#6"><button class="button button--ujarak button--border-thin button--text-thick">[摄影大讲堂006]美食摄影技巧</button></a> <a href="#7"><button class="button button--ujarak button--border-thin button--text-thick">[摄影大讲堂007]美食摄影技巧</button></a> <a href="#8"><button class="button button--ujarak button--border-thin button--text-thick">[摄影大讲堂008]美食摄影技巧</button></a> </div> <center><i class="fa fa-repeat"><input id="reExp1" type="button" value="换一批"/></i></center>')
		status=1;
	}
},function(){});
//换一批    随便看看
$("#reExp1").click(function(){
	alert("reExp1");
});
//换一批   大师专区
$("#reExp2").click(function(){
	alert("reExp2");
});
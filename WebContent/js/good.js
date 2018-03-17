$(function () {
	$.extend({
    tipsBox: function (options) {
      options = $.extend({
        obj: null, //jq对象，要在那个html标签上显示
        str: "+1", //字符串，要显示的内容;也可以传一段html，如: "<b style='font-family:Microsoft YaHei;'>+1</b>"
        startSize: "15px", //动画开始的文字大小
        endSize: "35px", //动画结束的文字大小
        interval: 600, //动画时间间隔
        color: "red", //文字颜色
        callback: function () { } //回调函数
      }, options);
      $("body").append("<span class='num'>" + options.str + "</span>");
      var box = $(".num");
      var left = options.obj.offset().left + options.obj.width() / 2;
      var top = options.obj.offset().top - options.obj.height();
      box.css({
        "position": "absolute",
        "left": left + "px",
        "top": top + "px",
        "z-index": 9999,
        "font-size": options.startSize,
        "line-height": options.endSize,
        "color": options.color
      });
      box.animate({
        "font-size": options.endSize,
        "opacity": "0",
        "top": top - parseInt(options.endSize) + "px"
      }, options.interval, function () {
        box.remove();
        options.callback();
      });
    }
  });
	//这种把子元素（.btn-like）代理到父元素（#container）的方式，可满足动态元素,动态添加的 button 也是有事件的。
	$("#container").on('click','.btn-like',function () {
		goodTime = getCookie('goodTime');
		if(goodTime<10 ||goodTime == null){
		    $.tipsBox({
		      obj: $(this),
		      str: "<i class='fa fa-heart'></i>+1",
		      callback: function () {
		      }
		    });
		    var i = parseInt($(this).text().replace(/[^0-9]/ig,""));
		    i++;
		    if(i>=100000){
		    	$(this).text("赞99999+ ");
		    }else{
		    	$(this).text("赞 "+i+" ");
		    }
		    $(this).append("<i class='fa fa-thumbs-o-up'></i>");
		    
		    if(goodTime==null||goodTime==""){
		    	goodTime = 0;
		    }
		    goodTime = parseInt(goodTime)+1;
		    setCookie('goodTime',goodTime,1);
		}
		else{
			alert("您今日点赞次数已达上限!");
		}
	});
	
	$(".btn-like").hover(function(){
		if($(this).parent().parent().attr("value")==0){
			var goods = 0;
			$.post("/goodTime", {
				postid : $(this).parent().parent().attr("id")
			}, function(data,status) {
				var words = data.split("_");
				if(words[1]>=100000){
					$("#"+words[0]).children(".bottom-item").children(".btn-like").text("赞99999+ ");
				}else {
					$("#"+words[0]).children(".bottom-item").children(".btn-like").text("赞"+words[1]+" ");
				}
				$("#"+words[0]).children(".bottom-item").children(".btn-like").append("<i class='fa fa-thumbs-o-up'></i>");
			})
			$(this).parent().parent().attr("value",1);
		}
	},function(){});
});
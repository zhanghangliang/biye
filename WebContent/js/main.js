$(document).ready(function($) {
    "use strict";
    $('#container').pinto({
        itemWidth:230,
        gapX:10,
        gapY:10,
        onItemLayout: function($item, column, position) {
        }
    });

    function checkScrollDirector(){      //判断滚动条是否滑到底部  
        var flag=0;  
        if($(document).scrollTop()+$(window).height()>=$(document).height()*0.95){  
            flag=1;  
        }     
        return flag;           
    }
   window.onload=function(){
    var json={"data":[  
             {"src":"images/01.jpg"},{"src":"images/02.jpg"},{"src":"images/03.jpg"},{"src":"images/04.jpg"},{"src":"images/05.jpg"},  
             {"src":"images/06.jpg"},{"src":"images/07.jpg"},{"src":"images/08.jpg"},{"src":"images/09.jpg"},{"src":"images/10.jpg"},  
             {"src":"images/11.jpg"},{"src":"images/12.jpg"}]};
   window.onscroll=function(){           //滚动条滚动执行  
        if(checkScrollDirector()){
        	$(".btn-like").off('click');
            for(var i=0;i<json.data.length;i++){ 
                var html="<div class='item'>" +
                			"<a class='example-image-link' href="+json.data[i].src+" data-lightbox='example-set' data-title='Click the right half of the image to move forward.'><img class='example-image' src="+json.data[i].src+" alt=''/></a>" +
                			"<div class='content-item'>" +
                				"<h3 class='title-item'><a href='single.html'>Vintage camera</a></h3>" +
                				"<div class='time'> SEPTEMBER 30TH</div>" +
                				"<p class='info'>Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus.</p>" +
                			"</div>" +
                			"<div class='bottom-item'>" +
                				"<span class='btn btn-like'>赞999 <i class='fa fa-thumbs-o-up'></i></span>" +
                				"<a href='#' class='btn btn-comment'><i class='fa fa-comment-o'></i></a>" +
                				"<a href='single.html' class='btn btn-more'><i class='fa fa-long-arrow-right '></i></a>" +
                			"</div>" +
                		 "</div>"; 
                $("#container").append(html);                       //向容器内一次性添加12个图片
            }
            $('#container').pinto("destroy");
            $('#container').pinto();
        }  
   	  }  
   }
});
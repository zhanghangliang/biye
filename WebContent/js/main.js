$(document).ready(function($) {
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
//		根据情况提示信息（1.系统设置中的公告  2.拦截器拦截后提示登录）
	   	var date =[];
	   	$.ajax({url:"/sysnote",dataType:"json",complete:function(data){date=eval("("+JSON.stringify(data)+")").responseJSON;
	   		console.log(date);
	   		$("body").append("<div id='sysnote'>系统公告："+date.noteContent+"</div>");
			setTimeout("document.getElementById('sysnote').style.display='none'",6000);
	   	}});
//		根据用户显示按钮,登录注册(标签内hidden="hidden")
	    if(getCookie('loginType')=="senior"){
	    	$(".adminDelete").show();
	    }
		if(getCookie('loginType')==null||getCookie('loginType')==""){
			$(".mockup-content").show();
		} else{
			$("#cssmenu").children().append("<li><a href='/contact'><span>| 个人中心 |</span></a></li>");
		}
//		二次布局
		$('#container').pinto("destroy");
		$('#container').pinto();
		
//	初始化json
    var json={"data":[  
             {"src":"images/01.jpg"},{"src":"images/02.jpg"},{"src":"images/03.jpg"},{"src":"images/04.jpg"},{"src":"images/05.jpg"},  
             {"src":"images/06.jpg"},{"src":"images/07.jpg"},{"src":"images/08.jpg"},{"src":"images/09.jpg"},{"src":"images/10.jpg"},  
             {"src":"images/11.jpg"},{"src":"images/12.jpg"}]};
   window.onscroll=function(){           //滚动条滚动执行 
        if(checkScrollDirector()){
        	$(".btn-like").off('click');
            for(var i=0;i<json.data.length;i++){ 
                var html="<div class='item'>" +
                			"<a class='example-image-link' href="+json.data[i].src+" data-lightbox='example-set' data-title='点击图像右半部分向前移动。'><img class='example-image' src="+json.data[i].src+" alt=''/></a>" +
                			"<div class='content-item'>" +
                				"<h3 class='title-item'><a href='/single'>Vintage camera</a></h3>" +
                				"<div class='time'> SEPTEMBER 30TH</div>" +
                				"<p class='info'>Aenean feugiat in ante et blandit. Vestibulum posuere molestie risus.</p>" +
                			"</div>" +
                			"<div class='bottom-item'>" +
                				"<span class='btn btn-like'>赞999 <i class='fa fa-thumbs-o-up'></i></span>" +
                				"<a href='#' class='btn btn-comment'><i class='fa fa-comment-o'></i></a>" +
                				"<a href='/single' class='btn btn-more'><i class='fa fa-long-arrow-right '></i></a>" +
                			"</div>" +
                		 "</div>"; 
                $("#container").append(html);                       //向容器内一次性添加12个图片
            }
            $('#container').pinto("destroy");
            $('#container').pinto();
        }  
   	  }  
   }
   
   //login
   var docElem = window.document.documentElement, didScroll, scrollPosition;

	// trick to prevent scrolling when opening/closing button
	function noScrollFn() {
		window.scrollTo( scrollPosition ? scrollPosition.x : 0, scrollPosition ? scrollPosition.y : 0 );
	}

	function noScroll() {
		window.removeEventListener( 'scroll', scrollHandler );
		window.addEventListener( 'scroll', noScrollFn );
	}

	function scrollFn() {
		window.addEventListener( 'scroll', scrollHandler );
	}

	function canScroll() {
		window.removeEventListener( 'scroll', noScrollFn );
		scrollFn();
	}

	function scrollHandler() {
		if( !didScroll ) {
			didScroll = true;
			setTimeout( function() { scrollPage(); }, 60 );
		}
	};

	function scrollPage() {
		scrollPosition = { x : window.pageXOffset || docElem.scrollLeft, y : window.pageYOffset || docElem.scrollTop };
		didScroll = false;
	};

	scrollFn();

	[].slice.call( document.querySelectorAll( '.morph-button' ) ).forEach( function( bttn ) {
		new UIMorphingButton( bttn, {
			closeEl : '.icon-close',
			onBeforeOpen : function() {
				// don't allow to scroll
				noScroll();
			},
			onAfterOpen : function() {
				// can scroll again
				canScroll();
			},
			onBeforeClose : function() {
				// don't allow to scroll
				noScroll();
			},
			onAfterClose : function() {
				// can scroll again
				canScroll();
			}
		} );
	} );

//	// for demo purposes only
//	[].slice.call( document.querySelectorAll( 'form button' ) ).forEach( function( bttn ) { 
//		bttn.addEventListener( 'click', function( ev ) { ev.preventDefault(); } );
//	} );
	
});
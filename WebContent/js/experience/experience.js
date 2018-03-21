var number=new Array();
	number[0]="副标题一：";
	number[1]="副标题二：";
	number[2]="副标题三：";
	number[3]="副标题四：";
	number[4]="副标题五：";
var id=new Array();
	id[0]="first";
	id[1]="second";
	id[2]="third";
	id[3]="fourth";
	id[4]="fifth";
	id[5]="sixth";
var i = 0;
$(function(){
	$("body").append('<form id="first" action="/firstCommit" class="smart-green" onsubmit="return firstcheck();"> <h1 id="blue-h1">摄影经验上传<span>与同一个世界 · 分享 · 不一样的美好</span></h1> <label> <br><span>主标题</span> <input id="name" type="text" name="name" placeholder="给你分享的经验起个名字吧！" maxlength="20"/> </label> <label> <br><span>经验导言:</span> <textarea id="message" name="message" placeholder="最大字数不超过100字" maxlength="100"></textarea> </label> <center> <br><input class="blue-sub" type="submit" value="下一步"> </center> </form>')
});

function firstcheck() {
	if($("#name").val()==""||$("#message").val()==""){
		alert("请完善信息");
		return false;
	}
	/*
	 * 将form内容，存到经验基础信息表中，状态码设为0，返回值为expID并赋给body
	 * 通过ajaxSubmit，将普通form提交方式变为ajax提交，data为MVC返回值
	 */
	$("#"+id[0]).ajaxSubmit({
		 dataType:"text",
		 error:function(result){alert("网络不稳定，请稍后尝试");window.location="/index1?search=all"},
		 success:function(result){$("#saveExpID").attr("value",result);}
	});
	addForm();
	return false;
};

function elsecheck(){
	if($("#name").val()==""||$("#message").val()==""||$("#file").val()==""){
		alert("请完善信息");
		return false;
	}
	var fileType = getFileType($("#file").val());
	var fileSize = document.getElementById("file").files[0].size / 1024;
	// 判断上传的附件是否为图片
	if ("jpg" != fileType && "jpeg" != fileType && "bmp" != fileType
			&& "png" != fileType) {
		alert("请上传JPG,JPEG,BMP,PNG格式的图片");
		$("#showspan").attr("src", "");
		return false;
	} else if (fileSize > 4096) {
		$("#showspan").attr("src", "");
		alert("图片大小不能超过4MB");
		return false;
	} 
	/*
	 * 点击下一步时，上传form内容，增加新的form
	 */
	$("#"+id[i]).ajaxSubmit({
		 dataType:"text",
		 data: {
	            'expID': $("#saveExpID").attr("value"),
	            'orderID': i
	         },
		 error:function(result){alert("网络不稳定，请稍后尝试");window.location="/index1?search=all"},
		 success:function(result){}
	});
	addForm();
	return false;
};

function end(){
	if($("#name").val()==""||$("#message").val()==""||$("#file").val()==""){
		alert("请完善信息");
		return false;
	}
	var fileType = getFileType($("#file").val());
	var fileSize = document.getElementById("file").files[0].size / 1024;
	// 判断上传的附件是否为图片
	if ("jpg" != fileType && "jpeg" != fileType && "bmp" != fileType
			&& "png" != fileType) {
		alert("请上传JPG,JPEG,BMP,PNG格式的图片");
		$("#showspan").attr("src", "");
		return false;
	} else if (fileSize > 4096) {
		$("#showspan").attr("src", "");
		alert("图片大小不能超过4MB");
		return false;
	} 
	/*
	 * 点击结束提交时，上传form内容，在回调函数中将经验状态改为1，然后重定向到详细页面
	 */
	$("#"+id[i]).ajaxSubmit({
		 dataType:"text",
		 data: {
	            'expID': $("#saveExpID").attr("value"),
	            'orderID': i
	         },
		 error:function(result){alert("网络不稳定，请稍后尝试");window.location="/index1?search=all"},
		 success:function(result){
			 window.location="/finalCommit?expID="+$("#saveExpID").attr("value");
		 }
	});
}

function addForm(){
	$("#"+id[i]).remove("");
	$("body").append(' <form id="'+id[i+1]+'" action="/elseCommit" method="post" class="smart-green" enctype="multipart/form-data" onsubmit="return elsecheck();" style="display:none"> <h1 id="blue-h1">摄影经验上传<span>与同一个世界 · 分享 · 不一样的美好</span></h1> <label> <br><span>'+
			number[i]+
			' </span> <input id="name" type="text" name="name" placeholder="为此段作品命名副标题！" maxlength="20"/> </label> <label> <br> <span>图片素材:</span> <label><label id="filelabel" for="file"><span id="postimg">点击此处上传</span></label><br><br></label> <input type="file" accept="image/*" id="file" name="postimg" style="display: none"/> <div id="image1" style="width:auto;height:auto; background:#CCCCCC;" hidden="hidden"> <center><img id="showspan" height="auto" width="auto" border="5px"/></center> </div> </label> <label> <br><span>图片简介:</span> <textarea id="message" name="message" placeholder="最大字数不超过300字" maxlength="300"></textarea> </label> <center> <br><input class="blue-sub" type="button" value="结束提交" onclick="end()"><input class="blue-sub" id="endSub" type="submit" value="下一步"> </center> </form>'
	);
	if(i=="4"){
		$("#endSub").remove();
	}
	$("#"+id[i+1]).fadeIn(800);
	i++;
};
//show img 上传图片后展示
$("body").on('change','#file',function(){
	var imgFile = this.files[0];
	var fr = new FileReader();
	fr.onload = function() {
		document.getElementById('image1').getElementsByTagName('img')[0].src = fr.result;
	};
	fr.readAsDataURL(imgFile);
	$("#image1").show("normal");
});

function getFileType(filePath) {
	var startIndex = filePath.lastIndexOf(".");
	if (startIndex != -1)
		return filePath.substring(startIndex + 1, filePath.length)
				.toLowerCase();
	else
		return "";
};
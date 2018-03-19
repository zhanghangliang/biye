//show img 上传图片后展示
document.getElementById('file').onchange = function() {
	var imgFile = this.files[0];
	var fr = new FileReader();
	fr.onload = function() {
		document.getElementById('image1').getElementsByTagName('img')[0].src = fr.result;
	};
	fr.readAsDataURL(imgFile);
	$("#image1").show("normal");
};

// 上传数据
function check() {
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
	return true;
}

function getFileType(filePath) {
	var startIndex = filePath.lastIndexOf(".");
	if (startIndex != -1)
		return filePath.substring(startIndex + 1, filePath.length)
				.toLowerCase();
	else
		return "";
}
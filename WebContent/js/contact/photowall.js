document.getElementById('file').onchange = function() {
	var imgFile = this.files[0];
	var fr = new FileReader();
	fr.onload = function() {
		var name = prompt("请输入需要替换的编号(1-7)", "");
		if(name==1){
			$(".img1").attr("src",fr.result);
		}
		else if(name==2){
			$(".img2").attr("src",fr.result);
		}
		else if(name==3){
			$(".img3").attr("src",fr.result);
		}
		else if(name==4){
			$(".img4").attr("src",fr.result);
		}
		else if(name==5){
			$(".img5").attr("src",fr.result);
		}
		else if(name==6){
			$(".img6").attr("src",fr.result);
		}
		else if(name==7){
			$(".img7").attr("src",fr.result);
		}
		else{
			$("#file").val("");
			alert("您选择了不存在的编号，请重新上传");
			return;
		}
		$("#which").val(name);
		$("#wallpush").trigger("click");
	};
	fr.readAsDataURL(imgFile);
};
function note(){
	alert("1.点击按钮【上传图片】\n\n" +
			"2.选择图片及替换编号\n");
}
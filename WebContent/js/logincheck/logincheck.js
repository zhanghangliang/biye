$("#zhuceaccount").change(function() {
	if($("#equal").length>0){
		$("#equal").remove();
	}
	$.post("/logincheck", {
		lsaccount : $("#zhuceaccount").val()
	}, function(data,status) {
		if (data == "success") {
				$('#zhuceaccount').css("width","92%")
				$('#zhuceaccount').parent().append('<i id="equal" class="fa fa-check-circle-o" style="color: #33cc33;font-size:24px;padding-left:5px"></i>');
		} else {
				$('#zhuceaccount').css("width","92%")
				$('#zhuceaccount').parent().append('<i id="equal" class="fa fa-times-circle-o" style="color: #ff0000;font-size:24px;padding-left:5px"></i>');
		}
	})
});
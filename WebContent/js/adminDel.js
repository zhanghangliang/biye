$(function() {
	$(".adminDelete").click(function() {
		console.log($(this).parent().parent().parent().attr("id"));
		$(this).parent().parent().parent().hide("slow");
		$.post("/delByPostID", {
			postid : $(this).parent().parent().parent().attr("id"),
		}, function(data, status) {
			console(data);
		})
     });
});
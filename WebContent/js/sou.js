$(function() {
	$(".search_ico").click(function() {
		$(".search_bar").toggleClass('search_open');
		var keys = $("#search").val();
		if (keys.length > 0) {
			$("#search").val('');
			window.location.href="index1?search="+keys;
		} else {
			return false;
		}
	});
});
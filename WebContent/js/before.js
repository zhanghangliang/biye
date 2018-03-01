$(function() {
     $("#login").click(function() {
    	 var value = $(".mockup-content").attr("value");
    	 alert(value);
    	 if(value == "1"){
    		 $(".dell").remove();
    		 alert("12313123");
    	 }
      });
})
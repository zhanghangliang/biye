document.getElementById('file').onchange = function() {
    var imgFile = this.files[0];
    var fr = new FileReader();
    fr.onload = function() {
        document.getElementById('image1').getElementsByTagName('img')[0].src = fr.result;
    };
    fr.readAsDataURL(imgFile);
	$("#image1").show("normal");
};
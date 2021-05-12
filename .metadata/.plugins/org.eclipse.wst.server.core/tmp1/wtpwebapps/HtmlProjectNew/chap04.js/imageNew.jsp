<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
	
	</style>
	<script type="text/javascript">
	
	</script>
</head>
<body>
	<img alt="a" src="./../images/book1_01.gif" width="300" height="180" onmouseover="applyImage(this.src);">
	<img alt="b" src="./../images/book1_02.gif" width="300" height="180" onmouseover="applyImage(this.src);">
	<img alt="c" src="./../images/book1_03.gif" width="300" height="180" onmouseover="applyImage(this.src);">
	<img alt="d" src="./../images/book1_04.gif" width="300" height="180" onmouseover="applyImage(this.src);">
	<hr>
	<form action="" name="myform">
		너비 : <input type="text" name="mywidth" value="330">
		
		높이 : <input type="text" name="myheight" value="150">
	</form>
	<hr>
	<div id="myarea"></div>
	<script type="text/javascript">
		function applyImage(srcimg) {
			var mywidth = Number(document.myform.mywidth.value);
			var myheight = Number(document.myform.myheight.value);
			
			var imgInfo = "<img src='" + srcimg ;
			imgInfo += "' width='" + mywidth ;
			imgInfo += "' height='" + myheight + "'></img>";
			
			//document.write(imgInfo);
			var target = document.getElementById('myarea');
			target.innerHTML = imgInfo;
		}
		
	
	</script>
</body>
</html>
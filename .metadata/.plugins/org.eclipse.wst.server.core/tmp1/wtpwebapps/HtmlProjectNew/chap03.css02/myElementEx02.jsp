<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		#mydiv{
			position: absolute;
			top: 0px;
			left: 0px;
			width: 300px;
			height: 200px;
			background: red;
		}
		.test1{
			position: absolute;
			top: 30px;
			left: 30px;
			width: 20px;
			height: 20px;
			background: aqua;
			overflow: scroll;
		}
		.test2{
			position: absolute;
			top: 30px;
			right: 50px;
			width: 20px;
			height: 20px;
			background: yellow;
			overflow: auto ;
		}
		.test3{
			position: absolute;
			bottom: 30px;
			left: 50px;
			width: 20px;
			height: 20px;
			background: #CC6666;
			visibility: visible;
		}
		.test4{
			position: absolute;
			top: 50px;
			left: 150px;
			width: 60px;
			height: 60px;
			background: blue;
			visibility: hidden;/* visible */
		}
	</style>
</head>
<body>
	<div id="mydiv">
		<div class="test1">소녀 시대</div>
		<div class="test2">원더 걸스</div>
		<div class="test3">티아라</div>
		<div class="test4">exid</div>
	</div>
</body>
</html>
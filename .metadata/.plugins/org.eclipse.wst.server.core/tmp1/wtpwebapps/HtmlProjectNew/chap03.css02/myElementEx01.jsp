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
			top: 10px;
			left: 30px;
			background: aqua;
		}
		.test2{
			position: absolute;
			bottom: 100px;/* '원더걸스' 칸 바닥에서 부터 100px */
			right: 30px;
			background: green;
		}
		.test3{
			position: absolute;
			top: 60px;/* '원더걸스' 칸 바닥에서 부터 100px */
			width: 150px;
			height: 75px;
			background: yellow;
		}
	</style>
</head>
<body>
	<div id="mydiv">
		<div class="test1">소녀 시대</div>
		<div class="test2">원더 걸스</div>
		<div class="test3">티아라</div>
	</div>
</body>
</html>
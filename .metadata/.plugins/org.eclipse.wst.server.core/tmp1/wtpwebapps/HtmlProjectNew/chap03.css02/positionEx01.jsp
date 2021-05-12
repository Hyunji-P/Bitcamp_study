<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		div{
			width: 100px;
			height: 100px;
			position: absolute;
		}
		#mydiv{
			top: 10px;
			left: 10px;
			width: 300px;
			height: 300px;
			background: red;
		}
		.test1{
		/* #mydiv 가 부모 , 부모를 기준으로 absolute */
		/* 원점기준 top은 30 떨어져 있음 , 부모(10) + 자기(20) */
			top: 20px;
			left: 30px;
			background: aqua;
		}
		.test2{
			bottom: 20px;
			background: green;
		}
		.test3{
			top: 40px;
			left: 50px;
			background: blue;
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
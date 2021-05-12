<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		div{
			width: 50px;
			height: 50px;
			position: relative;
		}
		#mydiv{
			top: 50px;
			left: 50px;
			width: 400px;
			height: 400px;
			position: relative;
			background: red;
		}
		.test1{
			top: 10px;
			left: 40px;
			background: aqua;
		}
		.test2{
		/* .test2 top - .test1 top = 10  */
			top: 20px;
			left: 20px;
			background: green;
		}
		.test3{
		/* .test3 top - .test2 top = 20  */
			top: 40px;
			left: 70px;
			background: yellow;
		}
		.test4{
			top: 20px;
			left: 100px;
			background: blue;
		}
	</style>
</head>
<body>
	<div id="mydiv">
		<div class="test1">소녀 시대</div>
		<div class="test2">원더 걸스</div>
		<div class="test3">티아라</div>
		<div class="test4">오마이걸</div>
	</div>
</body>
</html>
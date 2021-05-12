<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		div{
			position: static;
			width: 200px;
			height: 100px;
			border: 1px solid #000000;
		}
		.test1{
		/* top, right, bottom, left 등을 지정해도 값이 무시가 됩니다.  */
			top: 100px; /* 무시됨 */
			left: 100px; /* 무시됨 */
			width: 300px;
			background: green;
		}
		.test2{
			width: 400px;
			height: 200px;
			background: yellow;
		}
		.test3{
			width: 500px;
			height: 300px;
			background: blue;
		}
	
	</style>
</head>
<body>
	position:static은 기본 값이다.<br>
	top, right, bottom, left 등을<br>지정해도 값이 무시가 됩니다.<br><br>
	<div class="test1">소녀 시대</div>
	<div class="test2">원더 걸스</div>
	<div class="test3">티아라</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%
	int twelve = 12 ; // 전체 컬럼
	int left = 3 ; // 왼쪽
	int right = twelve - left ; // 오른쪽 
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="./../css/bootstrap.min.css">
	<script src="./../js/jquery.min.js"></script>
	<script src="./../js/popper.min.js"></script>
	<script src="./../js/bootstrap.min.js"></script>
	<script type="text/javascript">
	
	</script>
	<style type="text/css">
		.style1{background-color: red;}
		.style2{background-color: green;}
		.style3{background-color: blue;}
		.style4{background-color: yellow;}
	</style>
</head>
<body>
	<div class="container-fluid">
		<!-- 화면 전체 -->
		<h1>Responsive Columns</h1>
		<div class="row">
			<div class="col-sm-3 style1" >동해물과</div>
			<div class="col-sm-3 style2">백두산이</div>
			<div class="col-sm-3 style3">마르고</div>
			<div class="col-sm-3 style4">닳도록</div>
		</div>
	</div>
	<hr>
	<div class="container">
		<!-- 여백 -->
		<h1>Responsive Columns</h1>
		<div class="row">
			<div class="col-sm-3 style1" >동해물과</div>
			<div class="col-sm-3 style2">백두산이</div>
			<div class="col-sm-3 style3">마르고</div>
			<div class="col-sm-3 style4">닳도록</div>
		</div>
	</div>
	<hr>
	<div class="container">
		<!-- 여백 -->
		<h1>Responsive Columns</h1>
		<div class="row">
			<div class="col-sm-<%=left%> style1" >동해물과</div>
			<div class="col-sm-<%=right%> style2">백두산이</div>
		</div>
	</div>
	<hr>
	<div class="container">
		<!-- 여백 -->
		<h1>Responsive Columns</h1>
		<div class="row">
			<div class="col-sm-2" style="background-color: lavender;">.col-sm-2</div>
			<div class="col-sm-4" style="background-color: lavenderblush;">.col-sm-4</div>
			<div class="col-sm-6" style="background-color: lavenderblush;">.col-sm-6</div>
		</div>
	</div>
	<hr>
	<div class="container">
		<h1>옵셋 사용하기</h1>
		<div class="row">
			<div class="col-sm-offset-2 col-sm-8" style="background-color: navy;">동해물과</div>
		</div>
	</div>
</body>
</html>
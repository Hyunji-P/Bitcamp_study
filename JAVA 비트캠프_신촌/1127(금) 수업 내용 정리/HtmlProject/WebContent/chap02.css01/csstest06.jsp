<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		li{
			width:200px;
		}
		li:nth-child(odd){
			color:red;
			background-color: silver ;
			padding :7px;
		}
		li:nth-child(even){
			color:blue;
			background-color: yellow ;
			padding :5px;
		}
		li:first-child {
			color:pink;
			background-color: brown ;
			padding :5px;
		}
		li:nth-child(4){
			color: silver ;
			background-color: red ;
			padding :10px;
		}
		li:last-child{
			color:white;
			background-color: black;
		}
	</style>
</head>
<body>
	<h1>순서와 관련있는 가상 선택자</h1>
	<hr />
	<h2>전통 한과 차 만들기</h2> 
	<ul>
		<li>약식</li>
		<li>감주</li>
		<li>곶감쌈</li>
		<li>수정과</li>
		<li>오미자차</li>
		<li>쌍화차</li>
		<li>수박떡화채</li>
	</ul>
</body>
</html>
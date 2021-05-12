<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE HTML>
<html>
<head>
	<title> overflow, clip</title>
	<meta charset="UTF-8" />
	<style type="text/css">
		body{
			margin:20px 0px 0px 150px;
			padding:0px;
			font-size:0.7em;
		}
	 	div { 
			width:200px;
			border:1px solid #666;
			float:left;
			margin-right:10px;
			margin-top:10px;
		}
		h1 {
			background:url(./../images/css_design.png) no-repeat;
			font-size:1.2em;
			font-family:arial;
			height:400px;
			text-align:center;
			margin:0px;
			padding:0px;
		}
		#box1 {
			background:#F69;
			overflow:hidden ; /* 박스의 범위를 넘는 부분을 표시하지 않음 */	
			height:200px;
		}
		#box2 {
			background:#FC9;
			overflow:auto; /* 필요한 부분에만 스크롤 바가 생겨서 내용을 볼 수 있음 */
			height:200px;
		}
		#box3 {
			background:#3CF;
			overflow:scroll; /* 항상 수직, 수평 스크롤 바가 생겨서 내용을 볼 수 있음. */
			height:200px;
		}
		#box4 {
			position:relative;
			background:#6C3;
			height:400px;
			clear:left;
		}
		#box5 {
			position:relative;
			background:#C9F;
			height:400px;
		}		
		#box4 h1{
			position:absolute;
			clip:rect(0px,200px,150px, 0px);
		}
		#box5 h1{
			position:absolute;
			clip:rect(150px,200px,400px,0px);
		}		
	</style>
</head>

<body>
	<div id="box1">
		<h1>overflow:hidden</h1>
	</div>
	<div id="box2">
		<h1>overflow:auto</h1>
	</div>
	<div id="box3">
		<h1>overflow:scroll</h1>
	</div>
	<div id="box4">
		<h1>clip:rect(0px,200px,150px, 0px)</h1>
	</div>
	<div id="box5">
		<h1>clip:rect(150px,200px,400px,0px)</h1>
	</div>
</body>
</html>
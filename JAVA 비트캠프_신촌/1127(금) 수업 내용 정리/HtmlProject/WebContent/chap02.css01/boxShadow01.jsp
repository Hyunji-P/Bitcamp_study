<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE HTML>
<html>
<head>
	<title>그림자 효과 만들기</title>
	<meta charset="UTF-8" />
	<style type="text/css">
		body {
			font-family:"맑은 고딕", 돋움, arial;
			margin:0px 50px;
			padding:20px;
			min-height:400px;
			border-top:15px solid #000000;
			box-shadow:0px 10px 2px rgba(0,0,0,.5);
		}
		h1 {
			text-align:center;
			width:400px;
			padding:10px 20px;
			margin:10px auto;
			background:#ffcc33;
			border-radius:20px 0px;
			text-shadow:7px 5px 7px #000000;
			box-shadow:10px 10px 0px #ff0066;
		}
		div {
			width:377px;
			height:231px;
			margin:20px auto;
			background:url(images/frame_beige.png) no-repeat;
			border-radius:25px;
			box-shadow:5px 5px 40px #666666;
		}
		p {
			padding-top:45px;
			width:90%;
			margin:20px auto;
		}
	</style>
</head>

<body>
	<h1>자라섬도 침수</h1>
	<div>
		<p>
			집중호우가 이어지고 있는 가운데 강원 춘천시 남이섬이 물에 잠겼다. 남이섬이 이처럼 침수 피해를 본건 20년 만이다. <br>
			경기 가평군 북한강에 있는 '축제의 섬' 자라섬도 침수됐다.<br>
			남이섬과 자라섬은 지난 5일 소양강댐 방류로 쏟아져 나온 물이 가평에 도달해 북한강 수위가 상승한 시간대에 침수피해를 봤다.
		</p>
	</div>
</body>
</html>
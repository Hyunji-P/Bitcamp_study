<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1>목록 문단 입력하기</h1>
	<h2>비순서 목록 문단</h2>
	<h3>Web design</h3>
	<!-- ul, li 태그를 이용하여 비순서 목록 문단 구성하기 -->
	<ul>
		<li>css</li>
		<li>html</li>
		<li>photoshop</li>
	</ul>
	<h2>순서 목록 문단</h2>
	<h3>5월 1중 영화 예매 순위</h3>
	<!-- ol, li 태그를 이용하여 순서 목록 문단 구성하기 -->
	<ol>
		<li>토르 : 천둥의 신</li>
		<li>분노의 질주 : 언리미티드</li>
		<li>위험한 상견례</li>
	</ol>
	
	<hr>
	<h1>목록 정의하기</h1>
	<h2>와인의 종류</h2>
	<!-- dl, dt, dd 요소를 이용하여 정의 목록 구성하기 -->
	<dl>
		<dt>적포도주</dt>
		<dd>
			포도를 껍질채 발효 시킨 것으로 스테이크와 같은 
			육류요리와 함께 들면 고기 맛을 돋구면서 분위기를 새롭게 하여 준다.
		</dd>
		
		<dt>백포도주</dt>
		<dd>
			포도 껍질을 제거하고 포도즙만 발효시킨 것으로 반드시 차게 해서 마신다.  
			생선요리나 조개류,  가금류 앙트레 등과 같이 하면 더욱 좋다.
		</dd>
	</dl>
</body>
</html>
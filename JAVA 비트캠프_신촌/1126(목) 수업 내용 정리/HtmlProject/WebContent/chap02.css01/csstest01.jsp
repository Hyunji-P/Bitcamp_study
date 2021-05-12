<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
<head>
	<title> 문서 전체의 배경 색상, 글자 색상 적용하기 </title>
	<meta charset="UTF-8" />
	
	<style type="text/css">
		/* background-color는 배경 색상, color는 글자 속성을  지정합니다. */
		body { 
			background-color:#F0F0F0; 
			color:#FFFFFF; 
		}
		/* width는 가로 크기를 지정하는 속성으로 수치와 함께 %, px과 같은 단위를 사용할 수 있습니다.  */
		p { 
			background-color:#F0000F; 
			color:#FFFFFF; 
			width:400px;
		}
	</style>
	<link rel="stylesheet" type="text/css" href="./../css/someStyle01.css" />
</head>

<body>
	<h1> link 요소로 CSS 문서 연결하기 </h1>
	<!-- 배경 색상 검정색, 글자 색상을 흰색으로 지정합니다. -->
	<!-- p 요소에 배경 색상, 글자 색상, 가로 크기에 관련된 CSS 속성을 지정합니다. -->		
	<p>
		쉬워 보이는 일도 해보면 어렵다. 못할 것 같은 일도 시작해 놓으면 이루어진다. 
		쉽다고 얕볼 것이 아니고, 어렵다고 팔짱을 끼고 있을 것이 아니다. 
		쉬운 일도 신중히 하고 곤란한 일도 겁내지 말고 해보아야 한다.- 채근담 
	</p>
	<p>
		많은 벗을 가진 사람은 한 사람의 진실한 벗을 가질 수 없다.- 아리스토텔레스
	</p>
</body>
</html>
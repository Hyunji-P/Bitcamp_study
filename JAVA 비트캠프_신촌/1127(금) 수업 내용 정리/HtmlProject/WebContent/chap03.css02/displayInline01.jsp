<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE HTML>
<html>
<head>
	<title>목록 요소를 가로로 배치하기</title>
	<meta charset="UTF-8">
	<style type="text/css">
		body { 
			margin:50px 0px;
		}
		#topMenu { /* 컨테이너 박스 */
			list-style:none;
			width:100%;
			background-color:#FF66DD;
			margin:0px;
			padding:10px;
			text-align:center;
		}			
		#topMenu li {
			display:inline; /* block inline  */
			padding-left:50px;
		}		
		a {
			font:1.5em "Times New Roman",Georgia,Serif;
			color:#FFFFFF; /* 글자 흰색 */
			text-decoration:none;
		}
		a:hover { /* 마우스가 영역으로 들어 오면 */
			color:#FFFF33;
		}		
	</style>
</head>

<body>
	<ul id="topMenu">
		<li><a href="#">Home</a></li>
		<li><a href="#">About</a></li>
		<li><a href="#">Sitemap</a></li>
		<li><a href="#">BBS</a></li>
		<li><a href="#">Help</a></li>
	</ul>
</body>
</html>
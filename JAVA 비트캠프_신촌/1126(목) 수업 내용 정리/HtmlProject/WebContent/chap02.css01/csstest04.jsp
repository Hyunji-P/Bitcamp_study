<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		a[class]{
			color:#FF0000 ;
			text-decoration: none;
		}
		a[title="조주기능사"]{
			background-color:lightred;
			color:blue;
		}
		a[title]{
			background-color:#FFFF99 ;
			font-weight: bolder;
		}
		a[title^="제과"]{
			background-color:#006600 ;
			color:#FFFFFF ;
			font-weight: bold;
		}
		a[title$="(중식)"]{
			background-color:#66CC00 ;
			color:#FFFFFF ;
			font-weight: bold;
		}
		a[title*="산업기사"]{
			background-color:#FF3366 ;
			color:#FFFFFF ;
			font-weight: bolder;
		}		
	</style>
</head>
<body>
	<h1>속성  선택자 사용하기</h1>
	<hr />
	<h2>조리학부 자격증</h2> 
	<ul>
		<li><a>복어조리기능사</a></li>
		<li><a class="abc">양식조리기능사</a></li>
		<li><a>일식조리기능사</a></li>
		<li><a>제과기능장</a></li>
		<li><a>조리기능장</a></li>
		<li><a>조리산업기사(복어조리)</a></li> 
		<li><a title="제과 조리산업기사(양식)">제과 조리산업기사(양식)</a></li> 
		<li><a title="제과 조리산업기사(일식)">제과 조리산업기사(일식)</a></li> 
		<li><a title="조리 기사(중식)">조리 기사(중식)</a></li> 
		<li><a title="조리산업기사(한식)">조리산업기사(한식)</a></li> 
		<li><a title="조주기능사">조주기능사</a></li> 
		<li><a title="중식조리기능사" class="abc">중식조리기능사</a></li> 
		<li><a title="한식조리기능사">한식조리기능사</a></li> 
	</ul>
</body>
</html>
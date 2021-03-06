<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		a[class]{
			color: #FF0000;
			text-decoration: none;
		}
		a[title="조주기능사"]{
			background-color: black;
			color: blue;
		}
		a[title]{
			background-color: yellow;
			font-weight: bold;
		}
		a[title^="제과"]{
			background-color: #F4A460;
			color:#800000;
			font-weight: bold;
		}
		a[title$="(중식)"]{
			background-color: #808000;
			color:#FFF8DC;
			font-weight: bold;
		}
		a[title*="산업기사"]{
			background-color: #2F4F4F;
			color:#DCDCDC;
			font-weight: bold;
		}
		
	</style>
</head>
<body>
	<h1>속성 선택자 사용하기</h1>
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
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		body {
			font: 0.9em "맑은 고딕" , 돋움 , sans-serif;
		}
		#list1{
			list-style-image: url('./../images/arrow.png');
			list-style-position: inside;/* outside; */
		}
		#list2{
			list-style-type:upper-roman;
			list-style-position: outside;
		}
		#list2 li:first-child {
			list-style-image: url('./../images/num1_green.gif');
		}
		#list2 li:last-child {
			/* 속성 표기법 */
			list-style: hiragana inside;
		}
	</style>
</head>
<body>
 <h1>목록 문단 속성 알아보기</h1>
	<hr>
	<h2>테마별 명언 모음</h2> 
	<ul id="list1">
		<li>도전</li>
		<li>사랑 </li>
		<li>우정 </li>
		<li>이별</li>
		<li>인생</li>
		<li>희망</li>
	</ul>
	<h2>인물별 명언 모음</h2> 
	<ol id="list2">
		<li>간디</li>
		<li>공자 </li>
		<li>나폴레옹 </li>
		<li>아인슈타인</li>
		<li>에디슨</li>
	</ol>
</body>
</html>
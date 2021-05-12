<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE HTML>
<html>
<head>
	<title>목록 문단에 이미지, 위치, 스타일 제어하기</title>
	<meta charset="UTF-8" />

	<style type="text/css">
		body {
			font:0.9em "맑은 고딕",돋움,sans-serif;
			}
		#list1 { 
			list-style-image:url('./../images/arrow.png'); /* 리스트 목록에 사용할 이미지 지정 */
			list-style-position:inside;
		}
		#list2 {
			list-style-type:upper-roman;
			list-style-position:outside;
		}
		#list2 li:first-child { /* 요소의 첫 번째 항목 */
			list-style:url('./../images/num1_green.gif') inside ;
		}
		#list2 li:last-child { /* 요소의 마지막 항목 */
			list-style:hiragana inside ;
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
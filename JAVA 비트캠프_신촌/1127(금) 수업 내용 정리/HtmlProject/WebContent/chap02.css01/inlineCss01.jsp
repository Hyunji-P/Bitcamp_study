<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
	<head>
		<title> 블록 요소에 인라인 방식으로 CSS 적용하기 </title>
		<meta charset="UTF-8" />
	</head>

	<body>
		<h1>블록 요소에 인라인 방식으로 CSS 적용</h1>	
		<!-- 인라인 스타일로 p 요소에 CSS를 적용합니다. -->
		<p style="font-size:12px;color:#006699;line-height:150%;">	
			강원 <span style="color:#ffffff;background-color:#009900;">폭우</span> 6일째
			지난 1일부터 6일째 이어지고 있는 폭우로 강원도는 곳곳에서 피해가 속출하고 있다.<br>
			6일 강원소방본부에 따르면 지난 1일부터 6일 오후 5시까지 집계된 <br>
			폭우피해는 침수 168건, 토사유출 51건, 기타 250건으로 총 469건이다.<br>
			이날 끝없이 내리는 폭우로 실종사고가 있었다.
		</p>
		
		<hr>
		<p style="font-size:15px;color:#660099;line-height:300%;">	
			강원 <span style="color:#ffffff;background-color:#009900;">폭우</span> 6일째
			지난 1일부터 6일째 이어지고 있는 폭우로 강원도는 곳곳에서 피해가 속출하고 있다.<br>
			6일 <span style="color:#ffffff;background-color:#ff3366;">강원소방본부</span>에 따르면 지난 1일부터 6일 오후 5시까지 집계된 <br>
			폭우피해는 침수 168건, 토사유출 51건, 기타 250건으로 총 469건이다.<br>
			이날 끝없이 내리는 폭우로 실종사고가 있었다.
		</p>		
	</body>
</html>
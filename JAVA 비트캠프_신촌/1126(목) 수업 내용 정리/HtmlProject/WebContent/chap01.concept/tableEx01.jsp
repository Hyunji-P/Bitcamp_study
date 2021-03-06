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
	<h1>테이블 삽입하기</h1>
	<hr />
	<!-- summary : 테이블에 대한 간단한 설명글 -->
	<table summary="2011년 6월 다운로드 순위입니다.">
		<tr>
			<!-- scope 속성이 col이라는 것은 [열을 위한 제목]이라는 의미이다.  -->
			<th scope="col" id="mRank">순위</th>
			<th scope="col" id="mTitle">제목</th>
			<th scope="col" id="mType">장르</th>
			<th scope="col" id="mPreRank">지난주 순위</th>
		</tr>
		<tr>
			<!-- headers는 html5에서 새롭게 추가된 속성으로 -->
			<!-- id 속성으로 값을 지정한 열과 제목 셀을 연결하게 해준다. -->
			<th scope="row" headers="mRank">1</th>
			<td headers="mTitle">캐러비안의 해적</td>
			<td headers="mType">판타지</td>
			<td rowspan="3" headers="mPreRank">없음(New)</td>
		</tr>
		<tr>
			<th scope="row" headers="mRank">2</th>
			<td headers="mTitle">트랜스포머</td>
			<td headers="mType">SF</td>
		</tr>
		<tr>
			<th scope="row" headers="mRank">3</th>
			<td headers="mTitle">카2</td>
			<td headers="mType">애니메이션</td>
		</tr>
		<tr>
			<th scope="row" headers="mRank">4</th>
			<td headers="mTitle">엑스맨</td>
			<td headers="mType">SF</td>
			<td headers="mPreRank">2</td>
		</tr>
		<tr>
			<th scope="row" headers="mRank">5</th>
			<td headers="mTitle">노팅힐</td>
			<td headers="mType">드라마</td>
			<td headers="mPreRank">1</td>
		</tr>
		<tr>
			<td colspan="4">2011년 6월 다운로드 순위</td>
		</tr>
	</table>
</body>
</html>
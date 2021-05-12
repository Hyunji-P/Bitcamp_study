<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border = "1">
		<tr>
			<!-- scope 가 col 이면 열을 위한 제목이다. -->
			<th scope="col" id="rank">순위</th>
			<th scope="col" id="title">제목</th>
			<th scope="col" id="type">장르</th>
			<th scope="col" id="prerank">지난주 순위</th>
		</tr>
		<tr >
			<td scope="row" headers="rank">1</td>
			<td scope="row" headers="title">캐리비안의 해적</td>
			<td scope="row" headers="type">판타지</td>
			<td scope="row" headers="prerank">없음(new)</td>
		</tr>
		<tr>
			<td colspan="4"><!-- rowspan도 있음 -->
				2020년도 영화 랭킹
			</td>
		</tr>
	</table>
</body>
</html>
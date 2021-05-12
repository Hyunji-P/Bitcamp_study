<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		/* 내장 스타일 지정 방식 */
		/* 선택자(selector) : 스타일 작업을 위한 항목을 지정하는것* /
		/* caption은 선택자, 이름 : 속성; */
		caption {
			font-size: 40px;
			background-color: black;
			color: yellow;
		}
	</style>
</head>
<body>
	<table>
		<caption>렌터카 요금표</caption>
		<colgroup><!-- 인라인 스타일 지정 방식 --> 
			<col span="1" style="background-color:#CCCC66;">
			<col span="4" style="background-color:#FFFF99;">
		</colgroup>
		<thead style="background-color:#CCCCCC;">
			<tr>
				<th>차종</th>
				<th>24시간</th>
				<th>48시간</th>
				<th>72시간</th>
				<th>추가 요금</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>SM3</td>
				<td>45,000</td>
				<td>90,000</td>
				<td>135,000</td>
				<td>6,000</td>
			</tr>
			<tr>
				<td>모닝</td>
				<td>42,000</td>
				<td>84,000</td>
				<td>126,000</td>
				<td>6,000</td>
			</tr>
		</tbody>
		<tfoot style="background-color:#CCFFFF;">
			<tr>
				<td colspan="5">제주 5월 기준이며 추가 요금은 시간당입니다.</td>
			</tr>
		</tfoot>
	</table>
</body>
</html>
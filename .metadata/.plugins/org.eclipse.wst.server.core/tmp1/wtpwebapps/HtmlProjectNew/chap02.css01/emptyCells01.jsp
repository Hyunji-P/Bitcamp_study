<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		body , th , td{
			font: 12px "맑은 고딕" , 돋움 , sans-serif;
		}
		#table2{
			border-spacing: 40px;
			margin: 20px auto;
			empty-cells: inherit;
		}
		#table2 caption, #table2 th	, #table2 td{
			border: 1px solid #FF0000;
			border-radius:10px; 
		}
	
	</style>
</head>
<body>
<body>
	<table id="table1">
		<caption>렌터카 요금표</caption>
		<tr>
			<th>차종</th>
			<th>24시간</th>
			<th>48시간</th>
			<th>72시간</th>
			<th>추가요금</th>
		</tr>
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
		<tr>
			<td>쏘울</td>
			<td>61,000</td>
			<td>122,000</td>
			<td>183,000</td>
			<td>9,000</td>
		</tr>
		<tr>
			<td>윈스톰</td>
			<td>94,000</td>
			<td>188,000</td>
			<td>282,000</td>
			<td>13,000</td>
		</tr>
		<tr>
			<td colspan="5">제주 5월 기준이며 추가 요금은 시간당입니다.</td>
		</tr>
	</table>
	<table id="table2">
		<caption>렌터카 요금표</caption>
		<tr>
			<th>차종</th>
			<th>24시간</th>
			<th>48시간</th>
			<th>72시간</th>
			<th>추가요금</th>
		</tr>
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
		<tr>
			<td>쏘울</td>
			<td>61,000</td>
			<td>122,000</td>
			<td>183,000</td>
			<td></td>
		</tr>
		<tr>
			<td>윈스톰</td>
			<td>94,000</td>
			<td>188,000</td>
			<td>282,000</td>
			<td></td>
		</tr>
		<tr>
			<td colspan="5">제주 5월 기준이며 추가 요금은 시간당입니다.</td>
		</tr>
	</table>
</body>
</html>
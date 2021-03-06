<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
<head>
	<title>렌터카 요금표</title>
	<meta charset="UTF-8">
	<style type="text/css">
		caption {
			font-size: 25px;
		}
	</style>
</head>
<body>
	<table>
		<caption>렌터카 요금표</caption>
		<colgroup>
			<!-- colgroup 태그 : col 요소를 묶기 위한 용도로 사용한다.  -->
			<col span="1" style="background-color:#CC6;"  />
			<col span="4" style="background-color:#FF9;"  />
		</colgroup>          
		<thead style="background-color:#CCC;">
			<tr>
				<th scope="col">차종 </th>
				<th scope="col">24시간</th>
				<th scope="col">48시간</th>
				<th scope="col">72시간</th>
				<th scope="col">추가요금</th>
			</tr>
		</thead>

		<tbody>
			<tr>
				<td>SM3</td>
				<td> 45,000</td>
				<td> 90,000</td>
				<td> 135,000</td>
				<td> 6,000</td>
			</tr>
			<tr>
				<td>모닝</td>
				<td>42,000</td>
				<td>84,000</td>
				<td>126,000</td>
				<td>6,000</td>
			</tr>
		</tbody>

		<tfoot style="background-color:#CFF;">
			<tr>
				<td colspan="5">제주 5월 기준이며 추가 요금은 시간당입니다. </td>
			</tr>
		</tfoot>
	</table>
</body>
</html>
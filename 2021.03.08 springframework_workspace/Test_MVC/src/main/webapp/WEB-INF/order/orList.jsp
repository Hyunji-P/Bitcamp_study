<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결제 목록 보기</title>
</head>
<body>
	<h2>결제 목록</h2>
	<hr>
	<table border="1">
		<tr>
			<td colspan="10" align="center">
				<a href="<%=request.getContextPath()%>/insert.or">
					데이터 추가하기
				</a>
			</td>		
		</tr>
		<tr>
			<td>결제 번호</td>
			<td>회원 ID</td>
			<td>좌석 번호</td>
			<td>예약 일자</td>
			<td>예약 시간(첫시간)</td>
			<td>예약 시간(마지막 시간)</td>
			<td>총 예약 시간</td>
			<td>총 가격</td>
			<td>결제 일시</td>
			<td>비고</td>
		</tr>
		<c:forEach var="order" items="${lists}">
			<tr>
				<td>${order.or_no}</td>
				<td>${order.or_id}</td>
				<td>${order.or_seat}</td>
				<td>${order.or_date}</td>
				<td>${order.or_stime}</td>
				<td>${order.or_etime}</td>
				<td>${order.or_hour}</td>
				<td>${order.or_price}</td>
				<td>${order.or_pday}</td>
				<td>${order.remark}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
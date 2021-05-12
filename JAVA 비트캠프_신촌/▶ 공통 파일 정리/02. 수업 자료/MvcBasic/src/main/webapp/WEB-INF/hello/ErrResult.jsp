<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>예외 발생</h3>
	<table border="1">
		<tr>
			<td align="center">발생 위치</td>
			<td>${errlocation}</td>
		</tr>
		<tr>
			<td align="center">문자열</td>
			<td>${errstring}</td>
		</tr>
		<tr>
			<td align="center">메시지</td>
			<td>${errmessage}</td>
		</tr>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	여기는 humanEnd 파일입니다.<br>
	<table>
		<tr>
			<td>아이디</td>
			<td>${human.id}</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${human.name}</td>
		</tr>
		<tr>
			<td>취미</td>
			<td>${human.hobby}</td>
		</tr>
		<tr>
			<td>생일</td>
			<td>${human.birth}</td>
		</tr>				
		<tr>
			<td>특기</td>
			<td>
				<c:forEach var="item" items="${human.special}">
					${item}
				</c:forEach>
			</td>
		</tr>
		
		<tr>
			<td>직업</td>
			<td>${human.job}</td>
		</tr>

		<tr>
			<td>가입일자</td>
			<td>${human.regdate}</td>
		</tr>

	</table>

</body>
</html>
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
	<!-- Controller에서 설정된 @ModelAttribute("human") 속성을 출력해준다. -->
	<table border="1" align="center">
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
				<!-- 특기는 여러개 선택이 가능하므로 forEach 태그를 사용하여 반복 순회한다. -->
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
			<td>가입 일자</td>
			
		</tr>
	</table>	
</body>
</html>
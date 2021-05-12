<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>가입 결과</h2>
<table border="1">
	<tr>
		<td>아이디</td>
		<td>${member.id}</td>
	</tr>
	<tr>
		<td>이름</td>
		<td>${member.name}</td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td>${member.password}</td>
	</tr>
	<tr>
		<td>마일리지 포인트</td>
		<td>${member.mpoint}</td>
	</tr>	
	<tr>
		<td>주소</td>
		<td>${member.address1}</td>
	</tr>
	<tr>
		<td>세부주소</td>
		<td>${member.address2}</td>
	</tr>
	<tr>
		<td>이메일</td>
		<td>${member.email}</td>
	</tr>		
	<tr>
		<td>가입일자</td>
		<td>${member.regdate}</td>
	</tr>	
	<tr>
		<td>야구팀</td>
		<td>${member.sportsTeam}</td>
	</tr>
	<tr>
		<td>선호하는 운영체제</td>
		<td>
			<c:forEach var="item" items="${member.favorites}">
				${item}&nbsp;
			</c:forEach>
		</td>
	</tr>	
	<tr>
		<td>직업</td>
		<td>${member.jobCode}</td>
	</tr>	
	<tr>
		<td>개발툴</td>
		<td>${member.tool}</td>
	</tr>			
	<tr>
		<td>기타</td>
		<td>${member.etc}</td>
	</tr>	
	<tr>
		<td>약관 동의</td>
		<td>${member.agreement}</td>
	</tr>						

</table>


</body>
</html>
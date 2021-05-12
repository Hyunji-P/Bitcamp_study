<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>어노테이션 이용하기</title>
</head>
<body>
	<h2 align="center">가입 결과</h2>
	<table border="1" align="center" width="60%">
		<tr>
			<td width="30%">아이디</td>
			<td>${member.id}</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${member.name}</td>
		</tr>
		<tr>
			<td>비밀 번호</td>
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
			<td>세부 주소</td>
			<td>${member.address2}</td>
		</tr>
		<tr>
			<td>이메일</td>
			<td>${member.email}</td>
		</tr>
		<tr>
			<td>가입 일자</td>
			<td>${member.regdate}</td>
		</tr>	
		<tr>
			<td>야구팀</td>
			<td>${member.sportsTeam}</td>
		</tr>
		<tr>
			<td>선호하는 운영 체제</td>
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
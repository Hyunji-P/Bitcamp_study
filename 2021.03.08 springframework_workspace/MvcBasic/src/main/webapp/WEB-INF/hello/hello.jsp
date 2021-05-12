<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	여기는 hello.jsp파일 입니다.<br>
	인사말 : ${greeting}<br>
	메세지 : ${message}<br>
	<br><br><br>
	<% 
	// "/first/hohoho.he"; 요청 커멘드가 됨
		String hohoho = request.getContextPath() + "/first/hohoho.he";
	%>
	
	<a href="<%=hohoho%>"> 여기 클릭 </a>
	
</body>
</html>
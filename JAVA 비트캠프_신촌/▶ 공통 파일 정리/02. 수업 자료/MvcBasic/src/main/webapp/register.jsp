<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<% 
		String myContext = request.getContextPath() ;
		response.sendRedirect(myContext +  "/register.me") ; %>
</body>
</html>
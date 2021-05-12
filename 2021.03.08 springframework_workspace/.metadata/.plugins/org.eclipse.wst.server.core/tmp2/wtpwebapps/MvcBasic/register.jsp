<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>최초 시작 파일입니다.</title>
</head>
<body>
<%
	String contextPath = request.getContextPath();
	String gotopage = contextPath + "/register.me";
	// out.print(gotopage);
	response.sendRedirect(gotopage);

%>
</body>
</html>
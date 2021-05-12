<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>최초 시작 페이지 입니다.</title>
</head>
<body>
	<%
		String contextPath = request.getContextPath();
		String gotopage = contextPath + "/list.or";
		response.sendRedirect(gotopage);
	%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>album.jsp</title>
</head>
<body>
<%
	String contextPath = request.getContextPath();
	String gotopage = contextPath + "/list.al";
	// out.print(gotopage);
	response.sendRedirect(gotopage);
%>
</body>
</html>
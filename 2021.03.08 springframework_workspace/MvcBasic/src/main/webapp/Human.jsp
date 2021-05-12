<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>최초 시작 파일입니다.</title>
</head>
<body>
<!-- 전송 방식의 기본은 get방식 
	따라서 HumanController에서 method를 get으로 설정해줌-->
<%
	String contextPath = request.getContextPath();
	String gotopage = contextPath + "/mycaller1.hm";
	// out.print(gotopage);
	response.sendRedirect(gotopage); //이것을 요청하면 HumanController로...

%>
</body>
</html>
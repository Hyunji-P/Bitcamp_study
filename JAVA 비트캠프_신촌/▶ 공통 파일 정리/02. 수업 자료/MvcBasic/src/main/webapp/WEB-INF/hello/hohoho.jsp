<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="./../common/common.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	hohoho.jsp<br>
	인사말 : ${requestScope.hohoho}
	<br><br>
	<c:forEach var="item" items="${lists}">
		${item}<br>
	</c:forEach>
	<hr>
	<form action="<%=myContext%>/error01.he" method="post">
		숫자 1 : <input name="su1" type="text" value="14"><br>
		숫자 2 : <input name="su2" type="text" value="5"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>
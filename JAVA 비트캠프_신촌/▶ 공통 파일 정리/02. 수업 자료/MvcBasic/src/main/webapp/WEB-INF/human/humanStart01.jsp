<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>humanStart.jsp</title>
	<style type="text/css">
		.err {
			font-size: 9pt;
			color: red;
			font-weight: bold;
		}
	</style>	
</head>
<body>
	<h2 align="center">회원 가입하기</h2>
	
	<c:set var="apppath" value="<%=request.getContextPath()%>" />
	
	<form:form commandName="human" action="${apppath}/caller3.hm" method="post">
		<table border="1" align="center" width="70%">
			<tr>
				<td width="25%" align="center">
					아이디
				</td>
				<td width="75%" align="left">
					<form:input path="id" value="" />
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">
					이름
				</td>
				<td width="75%" align="left">
					<form:input path="name" value="" />
				</td>
			</tr>	
			<tr>
				<td width="25%" align="center">취미</td>
				<td width="75%" align="left">
					<form:radiobuttons items="${hobbies}" path="hobby" 
						itemLabel="korea" itemValue="english" />
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">특기</td>
				<td width="75%" align="left">
					<form:checkboxes items="${speciallist}" path="special" />
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">
					생일
				</td>
				<td width="75%" align="left">
					<form:input path="birth" value="" />
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">직업</td>
				<td width="75%" align="left">
					<select name="jobCode">
						<option value="0">---선택해 주세요
						<c:forEach var="oneitem" items="${joblists}" varStatus="index">
							<option value="${oneitem.code}">${oneitem.name}
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="로그인"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
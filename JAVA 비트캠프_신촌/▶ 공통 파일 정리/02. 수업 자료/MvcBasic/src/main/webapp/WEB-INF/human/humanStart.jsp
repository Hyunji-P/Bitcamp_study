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
	
	<form:form modelAttribute="human" commandName="human" action="${apppath}/caller3.hm" method="post">
		<table border="1" align="center" width="70%">
			<tr>
				<td width="25%" align="center">
					아이디
				</td>
				<td width="75%" align="left">
					<form:input path="id" value="" />
					<form:errors cssClass="err" path="id" /> 
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">
					이름
				</td>
				<td width="75%" align="left">
					<form:input path="name" value="" />
					<form:errors cssClass="err" path="name" /> 
				</td>
			</tr>	
			
			<tr>
				<td width="25%" align="center">취미</td>
				<td width="75%" align="left">
					<form:radiobuttons items="${hobbies}" path="hobby" 
						itemLabel="korea" itemValue="english" />
					<form:errors cssClass="err" path="hobby" />
				</td>
			</tr>
			
			
			<tr>
				<td width="25%" align="center">특기</td>
				<td width="75%" align="left">
					<form:checkboxes items="${speciallist}" path="special" />
					<form:errors cssClass="err" path="special" />
				</td>
			</tr>
			
			<tr>
				<td width="25%" align="center">
					생일
				</td>
				<td width="75%" align="left">
					<form:input path="birth" value="" />
					<form:errors cssClass="err" path="birth" /> 
				</td>
			</tr>
			
			<tr>
				<td width="25%" align="center">직업(jstl 사용)</td>
				<td width="75%" align="left">
					<select name="job">
						<c:forEach var="oneitem" items="${joblists}" varStatus="index">
							<option value="${oneitem.code}">${oneitem.name}
						</c:forEach>
					</select>
					<form:errors cssClass="err" path="job" />
				</td>
			</tr>			
			
			<tr>
				<td width="25%" align="center">직업(방법01)</td>
				<td width="75%" align="left">
					<form:select path="job" items="${joblists}" itemLabel="name" itemValue="code" />
					<form:errors cssClass="err" path="job" />
				</td>
			</tr>	
			
			<tr>
				<td width="25%" align="center">직업(방법02)</td>
				<td width="75%" align="left">
					<form:select path="job">
						<form:options items="${joblists}" itemLabel="name" itemValue="code"/>
					</form:select>
					<form:errors cssClass="err" path="job" />
				</td>
			</tr>	
			
			<tr>
				<td width="25%" align="center">
					가입 일자
				</td>
				<td width="75%" align="left">
					<form:input path="regdate" value="" />
					<form:errors cssClass="err" path="regdate" />
				</td>
			</tr>			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="가입하기"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
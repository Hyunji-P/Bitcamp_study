<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		.err{
			font-size: 9pt;
			color: red;
			font-weight: bold;
		}
	</style>
</head>
<body>
<h2>humanStart.jsp 파일입니다.</h2>
<!-- 확장자 hm, post 방식으로 넘어감 -->

<c:set var="apppath" value="<%=request.getContextPath()%>" />

<form:form commandName="human" action="${apppath}/caller3.hm" method="post">
	<table border="1">
		<tr>
			<td width="25%" align="center">
				아이디
			</td>
			<td width="75%" align="left">		
				<textarea id="content" name="content" rows="" cols=""></textarea>		
				<form:input path="id"/>
				<form:errors path="id" cssClass="err"/>
			</td>
		</tr>
		
		
		<tr>
			<td width="25%" align="center">
				이름
			</td>
			<td width="75%" align="left">
				<form:input path="name"/>
				<form:errors path="name" cssClass="err"/>
			</td>			
		</tr>	
		
		<!-- 취미 type="radio", input태그의 id는 중복되기 때문에 삭제 -->
		<tr>
			<td width="25%" align="center">
				취미
			</td>
			<td width="75%" align="left">
				<form:radiobuttons path="hobby"
					items="${hobbies}"
					itemLabel="korea"
					itemValue="english"/>
				<form:errors path="hobby" cssClass="err" />
			</td>			
		</tr>				

		<!-- 특기 type="checkbox", input태그의 id는 중복되기 때문에 삭제 -->
		<tr>
			<td width="25%" align="center">
				특기
			</td>
			<td width="75%" align="left">
				<form:checkboxes path="special" items="${speciallist}"/><!-- path에 name적어주기 -->
				<form:errors path="special" cssClass="err"/>
			</td>			
		</tr>	

		<tr>
			<td width="25%" align="center">
				생일
			</td>
			<td width="75%" align="left">
				<form:input path="birth"/><!-- path에 name적어주기 -->
				<form:errors path="birth" cssClass="err"/>
			</td>			
		</tr>			

		<%-- <tr>
			<td width="25%" align="center">
				직업(jstl 사용)
			</td>
			<td width="75%" align="left">
				<select name="job">
					<c:forEach items="${joblists}" var="oneitem">
						<option value="${oneitem.code}">${oneitem.name}
					</c:forEach>
				</select>			
				<form:errors path="job" cssClass="err"/>
			</td>
		</tr> --%>
		<tr>
			<td width="25%" align="center">
				직업(방법01)
			</td>
			<td width="75%" align="left">
				<form:select path="job" 
					items="${joblists}" 
					itemLabel="name" 
					itemValue="code"/>
					
				<form:errors path="job" cssClass="err"/>
			</td>
		</tr>		
		<%-- <tr>
			<td width="25%" align="center">
				직업(방법02)
			</td>
			<td width="75%" align="left">
				<form:select path="job">
					<form:options items="${joblists}" 
						itemLabel="name" itemValue="code"/>
				</form:select>
				<form:errors path="job" cssClass="err"/>
			</td>
		</tr> --%>
		
		<tr>
			<td width="25%" align="center">
				가입일자
			</td>
			<td width="75%" align="left">
				<form:input path="regdate"/><!-- path에 name적어주기 -->
				<form:errors path="regdate" cssClass="err"/>
			</td>			
		</tr>

		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="가입하기" />
			</td>
		</tr>		
	</table>
</form:form>
</body>
</html>
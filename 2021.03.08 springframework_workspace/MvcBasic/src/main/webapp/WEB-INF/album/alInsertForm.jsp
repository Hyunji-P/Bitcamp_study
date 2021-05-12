<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		.err{
			color:red;
			font-size: 9pt;
			font-weight: bold;
		}
	</style>
</head>
<body>
	<h1><spring:message code="album.register"/></h1>
	<c:set var="xxx" value="<%=myContext%>"/>
	<form:form modelAttribute="album" action="${xxx}/insert.al" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td align="center">
					<spring:message code="album.name"/>
				</td>
				<td align="left">
					<form:input path="albumname"/>
					<form:errors path="albumname" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td align="center">
					<spring:message code="album.image"/>
				</td>
				<td align="left">
					<input type="file" name="abcd">
					<form:errors path="abcd" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td align="center">
					<spring:message code="album.song"/>
				</td>
				<td align="left">
					<form:input path="song"/>
					<form:errors path="song" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td align="center">
					<spring:message code="album.lyricist"/>
				</td>
				<td align="left">
					<form:input path="lyricist"/>
					<form:errors path="lyricist" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td align="center">
					<spring:message code="album.songwriter"/>
				</td>
				<td align="left">
					<form:input path="songwriter"/>
					<form:errors path="songwriter" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td align="center">
					<spring:message code="album.transcription"/>
				</td>
				<td align="left">
					<form:input path="transcription"/>
					<form:errors path="transcription" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td align="center">
					<spring:message code="album.writerdate"/>
				</td>
				<td align="left">
					<form:input path="writerdate"/>
					<form:errors path="writerdate" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td align="center">
					<spring:message code="album.genre"/>
				</td>
				<td align="left">
					<form:select path="genre">
						<form:options items="${genrelist}" itemLabel="mykey" itemValue="mykey"/>
					</form:select>
					<form:errors path="genre" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td align="center">
					<spring:message code="album.mediatype"/>
				</td>
				<td align="left">
					<form:checkboxes items="${mediatypelist}" path="mediatype" itemLabel="mykey" itemValue="mykey"/>
					<form:errors path="mediatype" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td align="center">
					<spring:message code="album.emailagree"/>
				</td>
				<td align="left">
					<form:radiobuttons path="emailagree" items="${emailagreelist}" itemLabel="mykey" itemValue="mykey"/>
					<form:errors path="emailagree" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td align="center" colspan="2">
					<input type="submit" value="등록하기">
				</td>
			</tr>
		</table>	
	</form:form>
</body>
</html>
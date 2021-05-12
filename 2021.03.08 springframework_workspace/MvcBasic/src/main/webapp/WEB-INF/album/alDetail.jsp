<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="./../common/common.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
	<tr>
		<td colspan="2" align="center">
			<h1>앨범 상세 보기</h1>
		</td>
	</tr>
	<tr>
		<td align="center" width="40%">
			<c:if test="${empty album.image}">
				<img alt="이미지" width="150" height="150" src="<%=myContext%>/images/noimage.jpg">
			</c:if>
			<c:if test="${not empty album.image}">
				<img alt="이미지" width="150" height="150" src="<%=realPath1%>${album.image}">
			</c:if>
		</td>
		<td align="left" width="60%">
			<table border="1">
				<tr>
					<td><spring:message code="album.id"/></td>
					<td>${album.id}</td>
				</tr>
				<tr>
					<td><spring:message code="album.name"/></td>
					<td>${album.albumname}</td>
				</tr>
				<tr>
					<td><spring:message code="album.song"/></td>
					<td>${album.song}</td>
				</tr>
				<tr>
					<td><spring:message code="album.lyricist"/></td>
					<td>${album.lyricist}</td>
				</tr>
				<tr>
					<td><spring:message code="album.songwriter"/></td>
					<td>${album.songwriter}</td>
				</tr>
				<tr>
					<td><spring:message code="album.transcription"/></td>
					<td>${album.transcription}</td>
				</tr>
				<tr>
					<td><spring:message code="album.writerdate"/></td>
					<td>${album.writerdate}</td>
				</tr>
				<tr>
					<td><spring:message code="album.genre"/></td>
					<td>${album.genre}</td>
				</tr>
				<tr>
					<td><spring:message code="album.name"/></td>
					<td>${album.albumname}</td>
				</tr>
				<tr>
					<td><spring:message code="album.mediatype"/></td>
					<td>${album.mediatype}</td>
				</tr>
				
				<tr>
					<td><spring:message code="album.emailagree"/></td>
					<td>${album.emailagree}</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="button" value="돌아 가기" onclick="javascript:history.back();">
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
</body>
</html>
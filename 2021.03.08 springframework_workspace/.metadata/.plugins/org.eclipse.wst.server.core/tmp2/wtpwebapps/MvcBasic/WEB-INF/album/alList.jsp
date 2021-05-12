<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script type="text/javascript">
		function alldata() {
			// 전체
			
		}
		
		function partial() {
			// 부분
		}
	</script>
</head>
<body>
	<h3>앨범 목록 보기</h3>
	<table border="1">
		<tr>
			<td align="center">번호</td>
			<td align="center">앨범명</td>
			<td align="center">노래</td>
			<td align="center">작사</td>
			<td align="center">작곡</td>
			<td align="center">편곡</td>
			<td align="center">날짜</td>
			<td align="center">장르</td>
			<td align="center">미디어유형</td>
			<td align="center">이메일 수신 여부</td>
			<td align="center">삭제</td>
			<td align="center">수정</td>
		</tr>
		<tr>
			<td colspan="12" align="right">
				<input type="button" value="전체" onclick="alldata();">
				&nbsp;
				<input type="button" value="부분" onclick="partial();">
				&nbsp;
				<a href="<%=myContext%>/insert.al">등록</a>
			</td>
		</tr>
		<tr>
			<td colspan="9" align="center">
				<form action="<%=myContext%>/list.al" method="post">
					<select name="what">
						<option value="all">전체 검색
						<option value="albumname">앨범 제목
						<option value="song">노래
					</select>
					<input type="text" name="keyword" value="REAL">
					<input type="submit" value="검색">
				</form>
			</td>
			<td colspan="3" align="center">
				${pageInfo.pagingStatus}
			</td>
		</tr>
		<c:forEach items="${albumLists}" var="album">
			<tr>
				<td align="center">${album.id}</td>
				<td align="center">${album.albumname}</td>
				<td align="center">
					<a href="<%=myContext%>/detail.al?id=${album.id}">
						${album.song}
					</a>
				</td>
				<td align="center">${album.lyricist}</td>
				<td align="center">${album.songwriter}</td>
				<td align="center">${album.transcription}</td>
				<td align="center">${album.writerdate}</td>
				<td align="center">${album.genre}</td>
				<td align="center">${album.mediatype}</td>
				<td align="center">${album.emailagree}</td>
				<td align="center">
					<a href="<%=myContext%>/delete.al?id=${album.id}">삭제</a>
				</td>
				<td align="center">
					<a href="<%=myContext%>/update.al?id=${album.id}">수정</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<hr>
	${pageInfo.pagingHtml}
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<%@include file="./../common/common.jsp" %>
<html>
<head>
	<meta charset="UTF-8">
	<title>상세 보기</title>
</head>
<body>
	<table>
		<tr>
			<td colspan="2" align="center">
				<h1>상세 보기</h1>
			</td>
		</tr>
		<tr>
			<td align="center" width="40%">
				<img alt="" width="150" height="150" src="<%=realPath1%>${album.image}">
				&nbsp;&nbsp;		
			</td>
			<td align="left" width="60%">
				&nbsp;&nbsp;
				<table border="1">
					<tr>
						<td align="center">앨범 번호</td>
						<td align="left">${album.id}</td>
					</tr>
					<tr>
						<td align="center">앨범명</td>
						<td align="left">${album.albumname}</td>
					</tr>
					<tr>
						<td align="center">노래</td>
						<td align="left">${album.song}</td>
					</tr>
					<tr>
						<td align="center">작사</td>
						<td align="left">${album.lyricist}</td>
					</tr>
					<tr>
						<td align="center">작곡</td>
						<td align="left">${album.songwriter}</td>
					</tr>
					<tr>
						<td align="center">편곡</td>
						<td align="left">${album.transcription}</td>
					</tr>
					<tr>
						<td align="center">날짜</td>
						<td align="left">${album.writerdate}</td>
					</tr>
					<tr>
						<td align="center">장르</td>
						<td align="left">${album.genre}</td>
					</tr>
					<tr>
						<td align="center">미디어 유형</td>
						<td align="left">${album.mediatype}</td>
					</tr>
					<tr>
						<td align="center">이메일 수신 여부</td>
						<td align="left">${album.emailagree}</td>
					</tr>					
					<tr>
						<td colspan="2" align="center">
							<input type="button" value="돌아가기" 
								onclick="javascript:history.back();"/>	
						</td>
					</tr>		
				</table>
			</td>
		</tr>
	</table>
</body>
</html>
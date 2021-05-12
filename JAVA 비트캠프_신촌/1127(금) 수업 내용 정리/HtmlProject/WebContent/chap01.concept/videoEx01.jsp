<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
	<head>
		<title>audio 요소/video 요소 사용하기</title>
		<meta charset="UTF-8" />
	</head>
	<body>
		<h1>audio 요소를 이용한 사운드 삽입하기 </h1>
		<audio controls autoplay>
			<source src="./../media/music.ogg" />
			<source src="./../media/music.mp3" />
		</audio>
		<hr>
		<h1>video 요소를 이용한 동영상 무비 삽입하기</h1>
		<video width="320" height="240" controls autoplay>
			<source src="./../media/myMovie.ogv" type="video/ogg" />
			<source src="./../media/myMovie.mp4" type="video/mp4" />
		</video>		
	</body>
</html>
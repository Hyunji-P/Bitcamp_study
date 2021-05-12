<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>비디오</title>
</head>
<body>
	<h1>video 요소를 이용한 동영상 무비 삽입하기</h1>
	<video width="320" height="240" preload="false" controls autoplay>
		<source src="./../media/myMovie.ogv" type="video/ogg"/>
		<source src="./../media/myMovie.mp4" type="video/mp4"/>
	</video>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
	
	</style>
	<script type="text/javascript">
		function goNaver() {
			location.href = 'http://www.naver.com';
		}
		document.write("전체 경로 : " + location.href + "<br>");
		document.write("호스트 경로 : " + location.host + "<br>");
		document.write("호스트 이름 : " + location.hostname + "<br>");
		document.write("프로토콜 : " + location.protocol + "<br>");
	</script>
</head>
<body>
	<input type="button" value="네이버 가기" onclick="goNaver();">
	<script type="text/javascript">
		var now = new Date();//날짜 객체 생성 
		var display = now.toLocaleString();
		document.write("<p>" + display + "</p>");	
	</script>

    <input type="button" value="지금 몇 시죠?" onclick="location.reload();">
</body>
</html>
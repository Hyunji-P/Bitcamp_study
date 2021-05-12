<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<p>
			<label for="id">아이디</label>
			<input id="id" name="id" type="text">
		</p>
		<p>
			<label for="name">이름</label>
			<input id="name" name="name" type="text">
		</p> 
		<p>
			<label for="gender">성별</label>
			<input id="male" name="gender" type="radio" value="남자">
			<label for="male">남자</label>
			&nbsp;&nbsp;
			<input id="female" name="gender" type="radio" value="여자">
			<label for="female">여자</label>
		</p>
		<p>
			<label for="hobby">취미</label>
			<input id="hobby1" name="hobby" type="checkbox" value="당구">당구
			<input id="hobby2" name="hobby" type="checkbox" value="요리">요리
		</p>
		<p>
			<label for="age">나이</label>
			<input id="age" name="age" type="number">
		</p>
		<p>
			<label for="range">범위</label>
			<input id="range" name="range" type="range" min="0" max="20" step="2">
		</p>
		<p>
			<label for="mail">메일주소</label>
			<input id="mail" name="mail" type="email">
		</p>
		<p>
			<label for="click">클릭</label>
			<input id="click" name="click" type="button" value="눌러">
		</p>
	
	
	
	</form>
</body>
</html>
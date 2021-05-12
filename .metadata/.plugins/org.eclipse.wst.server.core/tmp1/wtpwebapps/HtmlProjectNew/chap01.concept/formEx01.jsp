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
			<input id="id" name="id" type="text"/>
		</p>
		<p>
			<label for="name">이름</label>
			<input id="name" name="name" type="text"/>
		</p>
		<p>
			<label for="gender">성별</label>
			<input id="male" name="gender" type="radio" value="남자"/>
			<label for="male">남자</label>
			&nbsp;&nbsp;&nbsp;
			<input id="female" name="gender" type="radio" value="여자"/>
			<label for="female">여자</label>
		</p>
		<p>
			<label for="hobby">취미</label>
			<input id="hobby1" name="hobby" type="checkbox" value="당구"/>당구
			<input id="hobby2" name="hobby" type="checkbox" value="축구"/>축구
			<input id="hobby3" name="hobby" type="checkbox" value="야구"/>야구
		</p>
		<p>
			<label for="address">주소</label>
			<input id="address" name="address" type="text"/>
		</p>
		<p>
			<label for="salary">급여</label>
			<input id="salary" name="salary" type="number"/>
		</p>
		<p>
			<label for="point">범위</label>
			<input id="point" name="point" type="range" min="10" max="50" step="1"/>
		</p>
		<p>
			<label for="mail">메일 주소</label>
			<input id="mail" name="mail" type="email"/>
		</p>
		<p>
			<label for="meclick">버튼</label>
			<input id="meclick" type="button" value="나를 클릭"/>
		</p>
		<p>
			<label for="sender"></label>
			<input id="sender" type="submit" value="전송"/>
		</p>
	</form>
</body>
</html>
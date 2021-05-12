<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1>폼 양식 만들기</h1>
	<form action="imageEx01.jsp">
		<p>
			<label for="id">아이디</label>
			<input id="id" name="id" type="text" /> 
		</p>
		<p>
			<label for="name">이름</label>
			<input id="name" name="name" type="text" /> 
		</p>
		<p>
			<label for="address">주소</label>
			<input id="address" name="address" type="text" /> 
		</p>
		<p>
			<label for="salary">급여</label>
			<input id="salary" name="salary" type="number" /> 
		</p>
		<p>
			<label for="point">범위</label>
			<input id="point" name="point" type="range" 
				min="1" max="10" step="1" value="5"/>  
		</p>
		<p>
			<label for="gender">성별</label>
			<label>
				<input name="gender" type="radio" value="1"/>남자
			</label>
			<label>
				<input name="gender" type="radio" value="2"/>여자
			</label>
		</p>
		<p>
			<label for="hobby">취미</label>
			<label>
				<input name="hobby" type="checkbox" value="축구"/>축구
			</label>
			<label>
				<input name="hobby" type="checkbox" value="농구"/>농구
			</label>
			<label>
				<input name="hobby" type="checkbox" value="야구"/>야구
			</label>			
		</p>		
		
		<p>
			<input type="submit" value="전송"/>
			<input type="reset" value="초기화"/>
		</p>
		
	</form>
</body>
</html>
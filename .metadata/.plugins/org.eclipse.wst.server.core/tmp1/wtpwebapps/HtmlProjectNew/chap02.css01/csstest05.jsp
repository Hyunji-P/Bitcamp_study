<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		a:link{
			text-decoration: none;
			color: #000000;
		}
		a:visited{
			text-decoration: underline;
			color: #000000;
		}
		a:hover {
			background-color: #CCFF33;
		}
		a:active {
			background-color: #FF0000;
			color: #FFFFFF;
		}
		input[type="text"]:hover {
			background-color: #CCFF00;
		}
		input:focus {
			background-color: #CCFF00;
			border: 5px solid #000000;
			color: #FFFFFF;
		}

	</style>
</head>
<body>
	<h1>링크 관련 가상 클래스 선택자</h1>
	<hr />
	<h2>나라별 요리법 분류 메뉴</h2> 
	<ul>
		<li><a href="#" title="한식 요리법">한식</a></li>
		<li><a href="#" title="중식 요리법">중식</a></li>
		<li><a href="#" title="양식 요리법">양식</a></li>
		<li><a href="#" title="일식 요리법">일식</a></li>
		<li><a href="#" title="베트남식 요리법">베트남식</a></li>
		<li><a href="#" title="이탈리아식 요리법">이탈리아식</a></li>
	</ul>
	<hr>		
	<h1>동적 관련 가상 클래스 선택자</h1>
	<hr />
	<h2>로그인</h2> 
    <form action="#" method="post">
		<p><label>아이디</label>
			<input name="userID" type="text" />
		</p>
		<p><label>비밀번호</label>
			<input name="userPWD" type="password" />
		</p>
		<p>
			<input type="submit" value="login" />
		</p>
    </form>
</body>
</html>
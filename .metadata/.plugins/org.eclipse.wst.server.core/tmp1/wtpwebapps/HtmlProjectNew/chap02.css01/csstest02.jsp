<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		/*h3 : selector */
		h3{
			background-color: #A52A2A;
			color : #FFF8DC;
			width: 50%;
			margin-left: 20px;
		}		
		li{
			line-height: 200%;
			color :#808000;
			font-size: 12px;
			width: 400px;
			margin-left: 20px;
		}
		span {
			color :#FFF8DC;
			background-color:#B8860B; 
		}
		.hoho{
			color :#E0FFFF;
			background-color: #4682B4;
			font-size: 15px;
		}
		span#one{
			color :#E6E6FA;
			background-color: #4B0082;
			font-size: 20px;
		}
		.haha{
			font-size: 30px;
		}
		#two{
			font-family: 궁서체;
			font-size: 30px;
			background-color: #FFD700;
			color: #000000;
		}
	</style>
</head>
<body>
	<h1>선택자 사용하기</h1>
	<hr>
	<h2>두부감자조림</h2>
	 
	<h3>재료</h3>
	<ul>
		<li><span id="two">감자</span> 1개</li>
		<li><span class="hoho haha">두부</span> 1/2모</li>
		<li>꽈리고추 10개</li>
		<li>홍고추 1개</li>
		<li>조리법</li>
	</ul>
	
	<h3>조리법</h3>
	<ol>
		<li>감자는 껍질을 벗기고 돌려가면서 어슷하게 썰어 찬물에 담가놓고 <span id="one">두부</span>는 도톰하게 한입크기로 썰며 꽈리고추, 홍고추는 어슷썬다.</li>	
		<li>첫번째 썰은 재료에 <span>두부</span>를 팬에 기름을 두르고 노릇노릇하게 앞뒤로 지져 기름은 뺀다.</li>
		<li>냄비에 감자와 홍고추를 담고 조림장을 반분량만 넣는다.</li>
		<li>3번째를 끓이다가 감자가 반정도 익으면, <span>두부</span>와 남은 양념장을 넣는다.</li> 
		<li>윤기나게 졸여지면 꽈리고추를 마지막에 넣어 다시한번 살짝 졸여 조린다.</li>
	</ol>
</body>
</html>
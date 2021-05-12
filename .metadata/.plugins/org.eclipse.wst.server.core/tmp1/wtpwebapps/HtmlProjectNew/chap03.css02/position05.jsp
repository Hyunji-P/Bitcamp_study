<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		body {
			font:12px "맑은 고딕","돋움",arial;
			margin-top: 20px;
			margin-left: 50px;
		}
		#titlePage{
			background: #666666;
			font-size: 2em;
			color: #FFFFFF;
			text-align: center;
			margin: 0px;
			padding: 10px 15px;
			width: 100%;
			
			position: absolute;
			top:0px;
			left: 0px; 
		}
		.mytitle{
			font-size: 1.5em;
			padding-left:120px;
			padding-top:30px;
			left-spacing: -1px;
			text-shadow: -1px -1px 15px #000000;
		}
		h3{
			font-size: 1.1em;
			padding-left:135px;
			padding-top:-1px;
			font-weight: normal;
			color: #8C8C8C;
		}
		P{
			text-align: right;
			padding-right: 70px;
		}
		#book1,#book2,#book3,#book4{
			border: 0px solid #FFCCFF;
			width: 360px;
			height: 150px;
		}
		a{
			color: #FF0000;
			text-decoration: none;
			font-weight: bolder;
			font-family: "맑은 고딕" , 돋움; 
		}
		#book1{
			position: absolute;
			top: 70px;
			left: 0px;
			background: url('./../images/bg_sm01.png') no-repeat;
		}
		#book2{
			position: absolute;
			top: 70px;
			left: 50%;
			background: url('./../images/bg_sm02.png') no-repeat;
		}
		#book3{
			position: absolute;
			top: 30%;
			left: 0px;
			background: url('./../images/bg_sm03.png') no-repeat;
		}
		#book4{
			position: absolute;
			top: 30%;
			left: 50%;
			background: url('./../images/bg_sm04.png') no-repeat;
		}
	</style>
</head>
<body>
	<header>
		<h1 id="titlePage">시리즈 안내</h1>
	</header>
	<section>
		<div id="book1">
			<h2 class="mytitle">실력이 탐나는 시리즈</h2>
			<h3>전략적 실전 대비 입문서</h3>
			<p>
				<a href="http://infopub.co.kr" target="_blank"
					title="정보문화사 사이트로 이동합니다.">&gt;&gt; GO</a>
			</p>
		</div>
		<div id="book2">
			<h2 class="mytitle">길라잡이 시리즈</h2>
			<h3>단계별로 배울 수 있는 지침서</h3>
			<p>
				<a href="http://infopub.co.kr" target="_blank"
					title="정보문화사 사이트로 이동합니다.">&gt;&gt; GO</a>
			</p>
		</div>
		<div id="book3">
			<h2 class="mytitle">회사 실무에 힘을 주는 시리즈</h2>
			<h3>자연스럽게 익히는 OA 핵심 기능 수록</h3>
			<p>
				<a href="http://infopub.co.kr" target="_blank"
					title="정보문화사 사이트로 이동합니다.">&gt;&gt; GO</a>
			</p>
		</div>
		<div id="book4">
			<h2 class="mytitle">눈길 시리즈</h2>
			<h3>IT 실무 교재 시리즈</h3>
			<p>
				<a href="http://infopub.co.kr" target="_blank"
					title="정보문화사 사이트로 이동합니다.">&gt;&gt; GO</a>
			</p>
		</div>
	</section>
</body>
</html>
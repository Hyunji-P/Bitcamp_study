<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE HTML>
<html>
	<head>
		<title> 상대 좌표 방식으로 배치하기 </title>
		<meta charset="UTF-8" />
		<style type="text/css">
			body { 
				font:12px "맑은 고딕",돋움,arial; 
				margin:20px 0px; 
				}
			h1 { 
				font-size:2em; 
				color:#ffffff; 
				margin:0px; 
				padding:5px 50px; 
				background-color:#666; 
				}
			h2 {
				font-size:1.5em;
				padding-left:120px;
				padding-top:30px;
				letter-spacing:-2px;
				text-shadow:-1px -1px 15px #000;
				}
			h3 {
				font-size:1.1em;
				padding-left:120px;
				letter-spacing:-1px;
				font-weight:normal;
				color:#8c8c8c;
				}
			p {
				text-align:right;
				padding-right:40px;
				}
			a {
				color:#333;
				text-decoration:none;
				font-weight:bold;
				font-family:"Arial Black",arial;
				}
			a:hover {
				color:#093;
				}
			/* Layout */
			section {
				margin:0 auto;
				width:750px;
				}
			div {
				width:342px;
				height:150px;
				margin-left:20px;
				margin-top:20px;
				float:left;
				}
			.book1 {
				background:url(./../images/bg_sm01.png) no-repeat;
				}
			.book2 {
				background:url(./../images/bg_sm02.png) no-repeat;
				}
			.book3 {
				background:url(./../images/bg_sm03.png) no-repeat;
				clear:left;
				}
			.book4 {
				background:url(./../images/bg_sm04.png) no-repeat;
				}
		</style>
	</head>

	<body>
		<header>
			<h1>시리즈 안내</h1>
		</header>
		<section>
			<div class="book1">
				<h2>실력이 탐나는 시리즈</h2>
				<h3>전략적 실전 대비 입문서 </h3>
				<p><a href="http://infopub.co.kr" target="_blank" title="정보문화사 사이트로 이동합니다.">&gt;&gt; GO</a></p>
			</div>
			<div class="book2">
				<h2>길라잡이 시리즈</h2>
				<h3>단계별로 배울 수 있는 지침서</h3>
				<p><a href="http://infopub.co.kr" target="_blank" title="정보문화사 사이트로 이동합니다.">&gt;&gt; GO</a></p>
			</div>
			<div class="book3">
				<h2>회사 실무에 힘을 주는 시리즈</h2>
				<h3>자연스럽게 익히는 OA 핵심 기능 수록 </h3>
				<p><a href="http://infopub.co.kr" target="_blank" title="정보문화사 사이트로 이동합니다.">&gt;&gt; GO</a></p>
			</div>
			<div class="book4">
				<h2>눈길 시리즈</h2>
				<h3>IT 실무 교재 시리즈</h3>
				<p><a href="http://infopub.co.kr" target="_blank" title="정보문화사 사이트로 이동합니다.">&gt;&gt; GO</a></p>
			</div>
		</section>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE HTML>
<html>
	<head>
		<title> 시맨틱 요소를 이용한 마크업 </title>
		<meta charset="UTF-8" />
	</head>

	<body>
		<!-- header 부분입니다. -->
		<header>
			<!-- hgroup : header 내에서 개별적인 여러 개를 묶어서 그룹핑 시킨다. -->
			<hgroup>
				<h1>프랑스 와인</h1>
				<h2>프랑스 지역별 와인의 특징 이야기</h2>
			</hgroup>
		</header>
		<!-- nav 부분입니다. -->
		<nav>
			<ul>
				<li>home</li>
				<li>Previous Page </li>
				<li>Next Page </li>
			</ul>
		</nav>
		<!-- section 부분입니다. -->
		<section>
			<!-- article 부분입니다. -->
			<article>
				<h3>보르도(Bordeaux) 지역의 와인 이야기</h3>
				<p>	프랑스의 대표적인 와인 생산 지역으로 프랑스 남서부 전지역에 위치한다. 년간 6억 병의 포도주를 생산하는 보르도는 세계에서 가장 큰 규모로 좋은 포도주를 생산하는 곳이다. </p>
			</article>
			<!-- article 부분입니다. -->
			<article>
				<h3>보졸레(BEAUJOLAIS) 지역의 와인 이야기</h3>
				<p>	마콩남쪽에 위치한 보졸레 지역의 포도원들은 쏜(Saone)강 왼편의 넓은 계곡을 향한 동남서 지역의 경사진 언덕에 있다. 이 지역은 22,000 헥타르 정도의 생산면적을 가지고 있으며 매년 평균 1,300,000 헥토리터의 와인들을 생산하고 있다. </p>
			</article>
		</section>
		<!-- aside 부분입니다. -->
		<aside>
			<h3>Link site</h3>
			<ul>
				<li>정보 문화사</li>
				<li>Yahoo</li>
				<li>Google</li>
			</ul>
		</aside>
		<!-- footer 부분입니다. -->
		<footer>
			<p>&copy;1999-2011 by WineStroy. All Rights Reserved. </p>
		</footer>
	</body>
</html>
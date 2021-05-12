<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
<head>
	<title>가로 형태의 메뉴</title>
	<style type="text/css">
		body {
			background-color: #FFFFFF;
			background-image: url(./../images/main_bg.gif);
			background-repeat: repeat-x;
			background-position: left bottom; /**/
		}
		#pipe {
			margin-left: 0;
		　	width: 550px;
		　	padding: 5px;
		　　/* 속성 표기법 : 여러 개의 속성을 1줄에 연속적으로 적는 기법 */
			border:1px solid #000000;
		}
		#pipe li { /* ul 태그 내의 li 태그 */
			margin-left: 0;
			padding: 3px 15px;
			list-style: none;
			display:inline; /* 각 요소들을 인라인(옆으로 쭈~욱)으로 배치 */
			border-left: 1px solid #000000;
		}
		#pipe li.first {
			margin-left: 0;
			border-left: none;
			list-style: none;
			display: inline; 
		}
		#pipe a { /* ul 태그 내의 a 태그 */
			margin-right: 5px;
			text-decoration: none;
			font-size: 12px;
			color: #304e06;
			font-weight: bold;
		}
		#pipe a:hover {/* hover : 마우스가 특정 영역에 들어갔다. */
			color: red
		}

		h3 { /* 항목별 제목 */
			margin-top: 15px;
			color: darkgreen;
		}

		p.box { /* 항목별 내용 */
			font-size: 12px;
			width: 550px;
			margin: 5px;
			border: 1px dotted darkgreen;
			padding: 5px;
		}
		p strong {/* 강조할 글자에 대한 스타일 지정 */
			font-size: 13px;
			color: red;
		}
		.more a {
			margin-left: 500px;
			color: blue;
			font-size: 11px;
			text-decoration: none;
		}
	</style>
</head>
<body>
	<a href="index_hor6.htm"><img src="./../images/herblogo.jpg" border="0"></a>
	<ul id="pipe">
		<li class="first"><a href="#">허브가 뭐지?</a></li>
		<li><a href="#">허브의 종류</a></li>
		<li><a href="#">허브의 효능</a></li>
		<li><a href="#">내가 만드는 허브차</a></li>
	</ul>
	<br>

	<h3>허브란</h3>
	<p class="box">
		약초, 향초, 향신료나 약으로 사용하는 식물의 총칭. 허브는 푸른 풀을 의미하는 라틴어 허바(herba)에서 
		유래한 말로 지구상에는 2500여 종이 자생하는 것으로 알려져 있다.<br>
		<span class="more"><a href="#">more</a></span>
	</p>

	<h3>허브의 종류</h3>
	<p class="box">
		<strong>바질</strong>은 두통, 신경과민, 구내염, 강장효과, 건위, 진정, 살균, 불면증에 좋고 
		젖을 잘 나오게 하는 효능이 있으며, 졸림을 방지하여 늦게까지 공부하는 수험생에게 좋다. 
		또한 신장의 활동을 촉진시키며 벌레 물린데에 살균효과가 있다.<br>
		<span class="more"><a href="#">more</a></span>
	</p>

	<h3>허브의 효능</h3>
	<p class="box">
		<strong>레몬그라스(Lemongrass)</strong>는 억새를 닮은 포아과의 다년초로 잎을 찢어서 
		손가락으로 비벼보면 레몬같은 향기가 난다하여 붙어진 이름이다. 
		약품, 비누,린스, 캔디 등의 부향제로 쓰인다. 인도나 동남아에서는 일상 음료로 상용하는데 
		이 차는 소화기능을 강화 할 뿐 아니라 빈혈에도 효과가 있으며 냉차로 마시면 더욱 향기롭다.<br>
		<span class="more"><a href="#">more</a></span>
	</p>
</body>
</html>
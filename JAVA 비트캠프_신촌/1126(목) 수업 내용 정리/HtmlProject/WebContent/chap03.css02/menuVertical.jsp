<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
	<head>
	<title>세로 형태의 메뉴</title>
	<style type="text/css">
		body {
			background:url(./../images/main_bg.gif) left bottom repeat-x #FFFFFF ;
		}
		#sidemenu { /* float 속성을 사용하여 메뉴를 화면의 왼쪽에 위치시킨다. */
			float:left;
			width:25%;
			margin-top:20px;
		}
		a { 
			font-size:13px;
			color:darkgreen;
			text-decoration:none;
			font-weight:bold;
		}
		a:hover {color:red}		
		ul {list-style-image:url(./../images/bu104.gif)}
	
		/* 각 항목이 너무 빽빽하지 않도록 항목마다 위에 여백을 준다 */
		li {margin-top:20px} 
				
		#content { /* 실제 내용이 들어갈 영역 */
			margin-left:27%;
			width:600px;
		}		
		h3 {
			margin-top:15px;
			color:darkgreen;
		}
		p.box {
			font-size:12px;
			width:550px;
			margin:5px;
			border:1px dotted darkgreen;
			padding:5px;
		}
		p strong{
			font-size:13px ;
			color : red ;
		}
		.more a {
			font-size:11px; 
			font-weight:bold;
			margin-left:500px;
		}		
	</style>
</head>
<body>
	<a href="index_vert1.htm">
		<img src="./../images/herblogo.jpg" border="0">
	</a>
	<div id="sidemenu">
		<ul>
			<li><a href="herbis.htm">허브가 뭐지?</a></li>
			<li><a href="kindis.htm">허브의 종류</a></li>
			<li><a href="advis.htm">허브의 효능</a></li>
			<li><a href="mytea.htm">내가 만드는 허브차</a></li>
		</ul>
	</div>
	<div id="content">
		<h3>허브란</h3>
		
		<p class="box">약초, 향초, 향신료나 약으로 사용하는 식물의 총칭. 
		허브는 푸른 풀을 의미하는 라틴어 허바(herba)에서 유래한 말로 
		지구상에는 2500여 종이 자생하는 것으로 알려져 있다.<br>
		<span class="more"><a href="#">more</a></span></p>
		
		<h3>허브의 종류</h3>
		<p class="box"><strong>바질</strong>은 두통, 신경과민, 구내염, 강장효과, 
		건위, 진정, 살균, 불면증에 좋고 젖을 잘 나오게 하는 효능이 있으며, 
		졸림을 방지하여 늦게까지 공부하는 수험생에게 좋다. 
		또한 신장의 활동을 촉진시키며 벌레 물린데에 살균효과가 있다.
		<br>
		<span class="more"><a href="#">more</a></span></p>
		
		<h3>허브의 효능</h3>
		<p class="box"><strong>레몬그라스(Lemongrass)</strong>는 억새를 닮은 
		포아과의 다년초로 잎을 찢어서 손가락으로 비벼보면 레몬같은 향기가 난다하여 붙어진 이름이다. 
		약품, 비누,린스, 캔디 등의 부향제로 쓰인다. 인도나 동남아에서는 일상 음료로 상용하는데 
		이 차는 소화기능을 강화 할 뿐 아니라 빈혈에도 효과가 있으며 냉차로 마시면 더욱 향기롭다.
		<br> <span class="more"><a href="#">more</a></span></p>
	</div>
</body>
</html>
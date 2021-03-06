<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<!DOCTYPE html>
<html>
	<head>
	<title>세로 형태의 메뉴</title>
	<style type="text/css">
		body{
			background: url('./../images/main_bg.gif') left bottom repeat-x;
		}
		#sidemenu{
			float: left;
			width: 25%;
			margin-top: 20px;
		}
		#sidemenu a{
			font-size: 13px;
			color: darkgreen;
			text-decoration: none;
			font-weight: bold;
		}
		#sidemenu a:hover{
			color: red;
		}
		ul {
			list-style:none;
		}
		#sidemenu ul li{
			margin-top: 30px;
		}
		#content{
			margin-left: 27%;
			width: 600px;
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
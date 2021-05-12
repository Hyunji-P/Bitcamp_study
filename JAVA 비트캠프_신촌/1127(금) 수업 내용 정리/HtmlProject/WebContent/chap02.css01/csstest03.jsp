<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE HTML>
<html>
<head>
	<title>클래스 선택자 사용하기</title>
	<meta charset="UTF-8">
	<style type="text/css" >		
		#cookTitle1 {
			background-color: #FF0033;
			color: #FFFFFF ;
			padding:5px;
			border: 1px solid #000000 ;
			margin-left:20px;
		}
		#cookTitle2 {
			background-color: #FFCC33;
			color: #000000 ;
			padding: 5px ;
			margin-left: 20px ;	
			border: 1px solid #FF0000 ;
		}
		.mystyle01 { 
			color: #FF0000 ;
			font-weight: bold;
			border-bottom: 1px dashed #FF0000 ;
		}
		.mystyle02 { 
			color:#FF00FF;
			font-weight:normal;
			border-bottom:2px dotted #FFFF00;
		}			
	</style>
</head>

<body>
	<h1>클래스 선택자 사용하기</h1>
	<hr />
	<h2>닭칼국수</h2> 
	<h3 id="cookTitle1">재료-4인분 기준</h3>
	<ul>
		<li>밀가루 3컵</li>
		<li>닭 1/2마리 </li>
		<li>호박 1/2개 </li>
		<li>부추 50g</li>
		<li>생강,소금, 후추, 참기름</li>
	</ul>
	<h3 id="cookTitle2">조리법</h3>
	<ol>
		<li><span class="mystyle01">밀가루</span>에 <span class="mystyle01">소금과 달걀</span>을 넣고 반죽하여 밀대로 밀어 0.5cm 두께로 썬다.쟁반에 펼쳐 굳지 않게 가제로 덮어놓는다. </li>
		<li>첫번째 썰은 재료에 <span class="mystyle01">두부</span>를 팬에 기름을 두르고 노릇노릇하게 앞뒤로 지져 기름은 뺀다. </li>
		<li><span class="mystyle01">닭</span>은 내장과 필요없는 지방을 제거하고 깨끗이 씻는다.<span class="mystyle01">생강</span>을 저며 넣고 찬물을 부어 푹 삶아 <span class="mystyle01">닭고기</span>는 살을 곱게 찢어 소금, 후추, 참기름에 양념하여 무쳐 놓고 <span class="mystyle01">국물</span>은 가제로 걸러 육수로 사용한다. </li>
		<li><span class="mystyle01 mystyle02">호박</span>은 채 썰고 <span class="mystyle01">부추</span>도 다듬어 씻어 4cm 길이로 썰고, <span class="mystyle01">홍고추, 파, 마늘</span>은 곱게 다진다.<span class="mystyle01">간장, 깨소금, 참기름</span>을 섞어 양념장을 만든다. </li>
		<li>닭국물이 끓으면 썰어 놓은 <span class="mystyle01">칼국수</span>를 넣어 서로 붙지 않게 한소끔 끓인 다음 <span class="mystyle01">호박과 부추, 양념한 닭고기</span>를 넣고 다시 한소끔 끓여서 <span class="mystyle01">양념장과 김치</span>를 곁들여 먹는다.</li>
	</ol>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE HTML>
<html>
<head>
	<title> 다단에 구분선 표시하기 </title>
	<meta charset="UTF-8" />
	<style type="text/css">
		body { 
			font:12px "맑은 고딕",돋움,arial; 
			margin:0px;
		}
		ul, li, dl, dt, dd {
			margin:0px;
			padding:0px;
		}
		h2 { /* 상단 제목 */
			font-size:2.0em; 
			color:#FFFFFF;
			background-color:#FF3399; 
			text-align:center; 
			padding:10px 15px; 			
			width:880px;
			margin:20px 0px;
		}
		h3 { /* 파트별 제목 */
			font-size:1.2em; 
			color: #006600 ;
		}
		p { /* 파트별 내용물 */ 
			line-height:150%;
			margin-bottom:30px;
		}
		#bookPart {
			width:850px;
			margin-left:50px;
			text-align:justify;
			margin-bottom:50px;
			column-count:3;
			column-rule:1px dashed #666666;
			column-gap:40px;
			
			/* Safari and Chrome */
			-webkit-column-count:3;
			-webkit-column-rule:1px dashed #666666;
			-webkit-column-gap:40px;
			
			/* Firefox */
			-moz-column-count:3;
			-moz-column-rule:1px dashed #666666;
			-moz-column-gap:40px;
		}
		
	</style>
</head>

<body>
	<h2>장별 요약</h2>
	<div id="bookPart">	
		<h3>PART 1. 포토샵 CS5 시작을 위하여</h3>
		<p>포토샵은 현대인들이 가장 많이 접하고 있는 그래픽 프로그램이며, 컴퓨터를 배우려는 이들이 꼭 배우고 싶은 프로그램으로 꼽는 인기 프로그램입니다. 그러나 쉽게 시작하지 못하는 프로그램 또한 포토샵입니다. 아직 포토샵을 사용해본 적이 없거나 이전 버전을 사용해 본 경험이 있는 사용자들은 버전 업그레이드가 빠른 포토샵을 부담스럽게 생각하기 쉽습니다. 그러나 포토샵은 버전이 높아져도 기본적으로 사용하는 기능은 동일하며, 신기능은 오히려 사용하기에 편리한 방법으로 구성된 것이 대부분입니다. 지금부터 그 기본 기능과 새로운 기능을 살펴보며 쉽게 익힐 수 있는 포토샵의 세계로 빠져 보겠습니다.</p>	
		<h3>PART 2. 효과적인 이미지 선택 방법 익히고 활용하기</h3>
		<p>포토샵으로 작업하기 위해서는 기본적으로 선택 툴을 이용하여 이미지를 선택하는 방법을 익혀야 합니다. 전체 이미지를 선택할 수도 있지만, 이미지의 일부분만 빠르게 선택하는 방법 등 다양한 이미지 선택 방법이 있으며, 이를 알아두면 작업이 수월해집니다.</p>
		<h3>PART 3. 레이어의 기본 개념과 사용 방법 익히기</h3>
		<p>이번 장에서는 이미지를 각각 관리할 수 있는 층, 레이어에 대해 알아봅니다. 포토샵 기능 중에서 가장 중요한 핵심 개념이라 할 수 있는 레이어는 이미지의 이동, 복제, 수정, 관리 등 편집 시 사용되는 소재이며 [LAYERS] 패널에서 다양한 기능을 활용할 수 있습니다. 이번 장에서는 레이어의 기본 개념을 비롯한 구조와 종류, 사용법과 관리 방법에 대해 구체적으로 살펴본 후, 그 외에 합성 모드 및 스타일 효과, 이미지 합성 등의 활용 단계는 11장에서 자세히 살펴보도록 합니다.</p>
		<h3>PART 4. 색상 선택하고 이미지에 채색하기</h3>
		<p>채색하는 작업을 하기 전에 꼭 해야 하는 것은 색상 선택입니다. 포토샵에서는 색상은 전경색과 배경색으로 구분하여 선택합니다. 채색하는 도구들은 모두 전경색을 선택한 후 적용되고 채색한 색상과 이미지를 지울 때는 배경색으로 적용되기 때문에 색을 선택하는 방법은 중요한 작업입니다. 지금부터 색상 선택 방법과 이미지를 채색하고 수정하는 작업에 대해 알아보겠습니다.</p>
		<h3>PART 5. 다양한 변형 기능 익히기</h3>
		<p>원본 이미지를 그대로 사용할 수 있다면 가장 좋겠지만, 실제 상황에서는 이미지의 일부만 사용하거나 변형하여 작업해야 하는 경우도 있으며, 이 과정에서 이미지를 자르거나 크기 및 각도를 변형하기도 합니다. 이번 장에서는 작업 시 필요할 수 있는 다양한 변형 기능을 살펴보겠습니다. </p>
		<h3>PART 6~14 더보기</h3>
	</div>
</body>
</html>
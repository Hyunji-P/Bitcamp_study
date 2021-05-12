<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE HTML>
<html>
<head>
	<title>이미지 요소 옆에 문단 흐르게 만들기</title>
	<meta charset="UTF-8" />
	<style type="text/css">
		body {
			font: 12px "맑은 고딕", 돋움, arial;
			margin-top: 20px;
		}
		header { /* 상단 큰 제목 */
			width: 660px;
			margin: 0 auto;
		}
		h1 { /* 상단 큰 제목내의 글자 */
			font-size: 2em;
			background-color: #666666;
			color:#FFFFFF;
			text-align: center;
			width: 300px;
			margin: 0px;
			padding: 5px;
			border-radius: 25px;
		}		
		section { /* 내용물 */
			width: 660px;
			margin: 30px auto 0px auto;
		}	
		h2 {
			font-size: 1.5em;
		}		
		dl {
			margin-top: 30px;
		}		
		dt {
			font-weight: bold;
			color : #0099CC ;
		}
		dd {
			line-height: 150%;
			margin: 5px 0px;
			color: #A2A2A2 ;
		}
		p { /* 하단의 단락 */
			line-height: 150%;
			margin: 20px 0px;
			padding-top: 20px;
			text-align: justify;
		}
		img { /* 이미지에 대하여 테두리와 그림자 효과 주기 */
			border: 1px solid #EFEFEF;
			box-shadow: 1px 1px 10px #666666;
		}
		.floatRight { /* 상단 이미지를 오른쪽으로 이동시키기 */
			float: right;
			margin: 10px 20px 10px 20px;
		}
		.floatLeft {
			float: left;
			margin: 10px 30px 10px -20px ;
		}		
	</style>
</head>

<body>
	<header>
		<h1>실력이 탐나는 윈도우 7</h1>
	</header>
	<section>
		<figure>
			<img src="./../images/book_window7.gif" width="135" height="168"
				alt="window7 책 표지" class="floatLeft" />
		</figure>
		<h2>책을 펴는 순간, 물 흐르듯 잡히는 윈도우 7의 핵심 기능</h2>
		<dl>
			<dt>개념 이해부터 기능 실습까지, 완벽한 내용 정리!</dt>
			<dd>기초적인 기능 하나도 제대로 파악하고 써먹을 수 있게, 개념을 충분히 이해시키고 실습에 임할 수 있는 구성을
				채용하였습니다. 체계적인 내용 정리로 기본기를 꽉 다잡아 보세요.</dd>
			<dt>한 번 배운 내용을 확실히 내 것으로, 충분한 활용 실습!</dt>
			<dd>각 장에서 배운 기능을 확실히 복습할 수 있도록 실전 문제를 풀어보는 코너를 제공합니다. 윈도우 7의 막강
				기능을 자연스럽게 내 것으로 만들어 활용해 보세요.</dd>
			<dt>곁에 두고 바로 꺼내보는, 든든한 길잡이!</dt>
			<dd>윈도우 7을 사용하면서 궁금해 할 수 있는 다양한 팁을 Q&amp;A 형태의 책 속 부록으로 제공합니다.
				본문에서 다루는 핵심 기능과 실습 문제, 게다가 다양한 팁까지 곁에 두는 것만으로도 든든한 길잡이가 되어줄 것입니다.</dd>
		</dl>
		<figure>
			<img src="./../images/book_window7_content1.png" width="331" height="225"
				alt="window7 책 내용 샘플" class="floatRight" />
		</figure>
		<p>&quot;사용자의 아이디어로 만들었다.&quot;라는 슬로건처럼 윈도우 7은 사용자의 편의성과 호환성, 안정성을
			자랑하며, 출시되자마자 선풍적인 인기를 끌며 꾸준한 판매고를 올리면서 그 입지를 굳히고 있습니다. 부팅 및 응용프로그램의
			실행속도가 굉장히 빨라졌고, 이전 버전의 윈도우에서 여러 단계를 거쳐야 했던 작업들이 획기적으로 단축되었습니다. 메모리 및
			전력효율도 탁월하게 좋아졌으며, 멀티미디어 기능은 더욱 더 막강해졌고, 네트워킹 역시 아주 간편해졌습니다.</p>
	</section>
</body>
</html>
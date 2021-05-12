<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>	
		<h1>img 요소로 이미지 삽입하기</h1>
		<!-- 수평선을 삽입한다. -->
		<hr />
		<h2>자동차 박람회 갤러리</h2>
		<div>
			<!-- 같은 폴더, images 폴더, images/car 폴더의 이미지를 삽입한다.-->
			<!-- figure와 figcaption 요소로 캡션 표시 -->
			<figure>
				<figcaption>머찐 차를 타고 달려 봐요^^</figcaption>
				<img src="./../images/car0.jpg" width="448" height="366" 
					alt="자동차 박람회의 흰색 클래식 차" title="흰색 클래식 차" />
			</figure>
			<figure>
				<figcaption>씽씽 달료.</figcaption>				
				<img src="./../images/car1.jpg" width="448" height="366" 
					alt="자동차 박람회의 빨강색 클래식 차" title="빨강색 클래식 차" />
			</figure>
		</div>
		
	</body>
</html>
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
		<h1>하이퍼링크 연결하기</h1>
		<hr />
		<h2>a 요소를 이용한 하이퍼링크 텍스트 </h2>
		<ul>
			<li>
				<a href="http://infopub.co.kr" target="_blank" title="http://infopub.co.kr">
					정보문화사
				</a>
			</li>
			<li><a href="gallery_car.html" title="gallery_car.html">자동차 박람회 갤러리</a></li>
			<li><a href="mailto:webmaster@infopub.co.kr" title="webmaster@infopub.co.kr">운영자에게 메일 보내기</a></li>
		</ul>
		<hr />
		<h2>a 요소를 이용한 하이퍼링크 이미지 </h2>
		<ul>
			<li>
				<a href="http://infopub.co.kr" target="_blank" title="http://infopub.co.kr">
					<img src="./../images/banner_jungbo.gif" width="99" height="27" alt="정보문화사" />
				</a>
			</li>
			<li>
				<a href="gallery_car.html" title="gallery_car.html">
					<img src="./../images/banner_gallery.gif" width="203" height="27" alt="갤러리" />
				</a>
			</li>
			<li>
				<a href="mailto:webmaster@infopub.co.kr" title="webmaster@infopub.co.kr">
					<img src="./../images/email.gif" width="187" height="27" alt="운영자에게 메일 보내기" />
				</a>
			</li>
		</ul>
		
	</body>
</html>
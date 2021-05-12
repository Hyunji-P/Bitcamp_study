<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE HTML>
<html>
	<head>
		<title>이미지 요소를 세로로 배치하기</title>
		<meta charset="UTF-8" />
		<style type="text/css">
			body { 
				margin-top:30px;
			}
			#newBookBox { /* 외부 테두리 박스 */
				margin:30px auto;
				width:400px;
				background-color:#CCCC99;
				border-radius:10px;
				padding:20px;
			}			
			h1 { /* 상단 */
				font:20px "맑은 고딕",돋움,arial; 
				color:#FFFFFF;
				background-color:#669900;
				border-radius:20px;
				padding:5px 30px;
				margin-bottom:20px;
			}	
			img {
				border:3px groove #999999;
				background-color:#efefef;
				padding:5px;
				margin:0px auto 15px auto;
				display:block ; /* display:inline ;  display:block ;  */
			}			
		</style>
	</head>

	<body>
		<div id="newBookBox">
			<h1>New Book</h1>
			
			<div>
				<img src="../images/new_book1.gif" width="80" height="100" alt="파워포인트" />
				<img src="../images/new_book2.jpg" width="80" height="100" alt="아이폰 프로그래밍" />
				<img src="../images/new_book3.gif" width="80" height="100" alt="프레젠테이션" />
				<img src="../images/new_book4.gif" width="80" height="100" alt="포토샵" />
			</div>
			
		</div>
	</body>
</html>
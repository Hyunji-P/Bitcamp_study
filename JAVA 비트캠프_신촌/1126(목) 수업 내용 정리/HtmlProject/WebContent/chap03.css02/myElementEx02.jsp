<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
	<style type="text/css">
		#mydiv{
			position:absolute;
			top:0px;
			left:0px;
			width:300px;
			height:200px;
			background: red;
		}		
		.test1{  
			position:absolute;
			top:30px; 
			left:0px;
			width:10px; /* 좁게 설정 */
			height:10px; /* 좁게 설정 */
			background:aqua;
			overflow:visible; /* 글자 다 보임*/
		}
		.test2{  
			position:absolute;
			top:30px; 
			left:100px;
			width:10px; /* 좁게 설정 */
			height:10px; /* 좁게 설정 */
			overflow:hidden;  /* 초과된 부분은 안 보임*/
			background:fuchsia;
		}
		.test3{
			background:yellow;
			position:absolute;
			top:30px; 
			left:200px;
			width:60px;
			height:60px;
			visibility: visible;
		}
		.test4{
			background:yellow;
			position:absolute;
			top:120px; 
			left:200px;
			width:60px;
			height:60px;
			visibility: hidden ; /* hidden으로 테스트 요망 */
		}		
	</style>	
</head>
<body>
	<div id="mydiv">
		<div class="test1">소녀 시대</div>
		<div class="test2">원더 걸스</div>
		<div class="test3">티아라</div>
		<div class="test4">exid</div>
	</div>
</body>
</html>
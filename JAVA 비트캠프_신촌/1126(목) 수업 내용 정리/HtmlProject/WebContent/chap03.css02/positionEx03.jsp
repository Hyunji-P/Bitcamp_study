<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<style type="text/css">
		div{ /* 모든 div 요소에 대하여 공통 적용 사항 */
			width:100px;
			height:100px;
			/* position:relative은 해당 요소의 바로 앞의 요소에 대한 상대적인 개념이다. */
			position:relative;
		}
		#mydiv{
			top:50px;
			left:50px;
			width:400px;
			height:400px;
			background: red;
		}
		.test1{ /* 소녀 시대 */			
			top:10px; /* 부모(#mydiv)에 대한 상대적인 위치 */
			left:40px;
			background:aqua;
		}
		.test2{ /* 원더 걸스 */
			/* 부모(#mydiv)에 대하여 20px인데 test1이 10px를 띄고 있으므로 */
			/* test2는 test1에 대하여 20-10=10px를 띄운다.  */
			top:20px;
			left:20px;
			background:fuchsia;
		}
		.test3{
			/* 부모(#mydiv)에 대하여 40px인데 test1=10px, test2=10px를 띄고 있으므로 */
			/* test3는 20-10-10=20px를 띄운다.  */
			top:40px;
			left:40px;
			background:yellow;			
		}		
	</style>
</head>
<body>
	<div id="mydiv">
		<div class="test1">소녀 시대</div>
		<div class="test2">원더 걸스</div>
		<div class="test3">티아라</div>
	</div>
</body>
</html>
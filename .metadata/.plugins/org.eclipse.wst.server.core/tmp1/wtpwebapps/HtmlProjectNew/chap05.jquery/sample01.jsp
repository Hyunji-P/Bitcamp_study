<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<script src="./../js/jquery.min.js"></script>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
        .bg { background-color:Yellow; }
        .silver { background-color:Silver; }
        .magenta{ background-color:magenta ; }/* 클래스 속성이 없기 떄문에 추가(add)하려고 함 */
		div{ font-size: 20px;}	
		p{
			font-size: 20px ; 
			font-weight: bold;
		}
		span{
			color: red;
		}
	</style>	
	<script type="text/javascript">	
		/* 이 문서가 완전히 로딩되고 나서 ... */
		$(document).ready(function(){ //$ jquery를 지칭하는 별칭 
			//alert('시작 시 자동으로 호출됩니다.');
			$('div#meclick').click(function(){
				$(this).hide();//자기 자신 지칭 : this 사용 
			});
			$('#hw').click(function(){
				/* addClass() <-> removeClass()  */
				$(this).addClass('magenta');//마젠타 클래스 추가, 대소문자 구분하니 주의할 것 ! 
				$('div.bg').addClass('silver');//문제 ) 맨 밑줄 클릭하면 윗줄 색깔을 실버로 바꿔라.
			});
		});
	</script>
</head>
<body>	
    <div onclick="alert('onclick 이벤트 호출됨');" class="silver">
    	저를 클릭해보세요.
    </div>
	<div id="meclick">
		<span>클릭</span>하시면 글자가 사라집니다.	
	</div>    
    <div class="bg">
    	안녕하세요. jQuery!!!
    </div>
    <div id="hw" class="bg">
    	클릭하시면 배경 색이 바뀝니다.
    </div>	
</body>
</html>
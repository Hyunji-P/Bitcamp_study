<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
        .yellow { background-color:yellow; }
        .blue { background-color:blue; }
        .silver { background-color:silver; }
        .magenta{ background-color:magenta ; }
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
		$(document).ready(function(){ 
			alert('시작시 자동으로 호출됩니다.') ;
		
			$("div#meclick").click(function(){ 
				$(this).hide();	 /* 클릭된 그 항목을 숨겨 버리세요. */
			});
			
			$('#hw').click(function () { 
            	alert('id 선택자를 이용한 호출'); 
            	$(this).addClass("magenta"); 
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
    <div class="blue">
    	안녕하세요. jQuery!!!
    </div>
    <div id="hw" class="yellow">
    	클릭하시면 배경 색이 바뀝니다.
    </div>	
</body>
</html>
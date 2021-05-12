<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<HTML>
<HEAD>
	<TITLE>Selector 실습하기</TITLE>
    <style type="text/css">
        .red { color:red; }
        .green { color:green; }
        .silver { color:silver; }
    </style>	
	<script type="text/javascript">
		$(document).ready(function(){
			$('h1').css('color', 'red');
			$('#myId').css('background-color', 'orange');
			$('.myClass').css('font-family', '궁서체');
			$('.myClass').css('color', 'blue');
			$('.yourclass').css('color', 'yellow');
			
			/* 
				<a> 태그의 href 속성에 'net'가 포함되어 있는 요소에 대하여
				red 스타일을 적용해 보세요.
			*/
			$('a[href*="net"]').addClass('red') ;
				
			/* aspx로 끝나는 요소에  green 스타일을 적용해 보세요. */
			$('a[href$="aspx"]').addClass('green') ;
			
			/* mailto: 로 시작하는 요소에  silver 스타일을 적용해 보세요. */
			$('a[href^="mailto:"]').addClass('silver') ;			
		});
	</script>
</HEAD>
<BODY>
	<h1>Selector 실습하기</h1>
	<h1 id="myId">Selector 실습하기</h1>
	<h1 class="myClass">Selector 실습1</h1>
	<!-- 한개의 태그가 2개 이상의 클래스 속성을 가질수 있다. -->
	<h1 class="myClass yourclass">Selector 실습2</h1>
	<hr>
    <a href="http://www.dotnetkorea.com/">닷넷코리아</a>
    <a href="http://www.VisualAcademy.com/Default.aspx">비주얼아카데미</a>
    <a href="mailto:redplus@hawaso.com">이메일</a>
</BODY>
</HTML>
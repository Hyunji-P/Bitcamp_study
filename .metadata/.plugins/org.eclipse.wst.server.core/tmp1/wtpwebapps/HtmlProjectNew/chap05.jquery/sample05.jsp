<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<script src="./../js/jquery.min.js"></script>
	<meta charset="UTF-8">
	<TITLE>Selector 실습하기</TITLE>
    <style type="text/css">
        .red { color:Red; }
        .green { color:Green; }
        .silver { color:Silver; }
        .someClass{
        	font-size: 60px;
        	color:pink;
        }
    </style>	
	<script type="text/javascript">
		$(document).ready(function(){
			$('h1').css('color','red');
			$('#myId').css('background-color','yellow');
			$('.myClass').css('font-family','궁서체');
			$('.myClass').css('color','blue');
			$('.yourclass').css('color','aqua');
			
			$('a[href*="net"]').addClass('red');
			$('a[href$="aspx"]').addClass('green');
			$('a[href^="mailto"]').addClass('silver');
			
			$('.someClass').removeClass('someClass');//원래 스타일을 지운다 
		});
	</script>
</head>
<body>
	<h1>Selector 실습하기</h1>
	<h1 id="myId">Selector 실습하기</h1>
	<h1 class="myClass">Selector 실습1</h1>
	<!-- 한개의 태그가 2개 이상의 클래스 속성을 가질수 있다. -->
	<h1 class="myClass yourclass">Selector 실습2</h1>
	<h3 class="someClass">Selector 실습3</h3>
	<hr>
    <a href="http://www.dotnetkorea.com/">닷넷코리아</a>
    <a href="http://www.VisualAcademy.com/Default.aspx">비주얼아카데미</a>
    <a href="mailto:redplus@hawaso.com">이메일</a>
</body>
</html>
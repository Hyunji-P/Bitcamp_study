<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<script src="./../js/jquery.min.js"></script>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		.mypen{
			background-color: navy;
			color : #FFFFFF;
		}
	</style>
	<script type="text/javascript">
		$(document).ready(function(){
			var first = $('h1');//h1 이 두개 이상 존재하면 배열이 됨 
			var second = $('h2');
			
			first.css('background-color','orange');
			first.css('color','blue');
			
			//second는 노란색 배경 , 빨간색 글자
			//메소드 체이닝
			second.css('background-color','yellow').css('color','red');
			
			//스타일 제거
			first.css('background-color','');
			
			//h4 태그의 배경 색상을 second 색상과 동일하게 지정하세요.
			//매개변수가 1개면 getter , 2개면 setter
			$('h4').css('background-color',second.css('background-color'));
			
			var msg = '안녕 <b>메롱</b>';
			$('#myarea').html(msg);
			
			//'메롱'에 형광펜 칠하기 
			$('b').addClass('mypen');
			
			var searchItems = $('p, span , div.simpletext1');
			
			var result = '';
			result += '검색 요소 갯수 : <b>' + searchItems.length + '</b>';
			$('#myarea02').html(result); //setter , getter : 매개변수 x 
			//$('#myarea02').text(result); setter , getter : 매개변수 x 
			
			result = '';
			
			searchItems.each(function(index, element){
				//index : 0부터 시작하는 순서 번호 
				//element : 해당 객체(태그 정보)
				var imsi = $(this).html() + '(' + index +')';//$(this).html() : getter
				result += imsi + '&nbsp;&nbsp;';
			});
			
			
			$('#myarea03').html(result);
			
			
		});
	</script>
</head>
<body>
	<h1>jQuery 실습하기</h1>
	<h2>jQuery 실습하기</h2>
	
	<h4>한 번에 다양한 엘리먼트에 접근하여 개수와 텍스트 얻기 : selector1, selector2, selectorN</h4>
	<span>simple</span>
	<div class='simpletext1'>jQuery</div>
	<div>basic</div>
	<p>example</p>	
	<hr>
	<div id="myarea"></div>
	<div id="myarea02"></div>
	<div id="myarea03"></div>
</body>
</html>
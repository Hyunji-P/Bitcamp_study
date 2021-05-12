<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<script src="./../js/jquery.min.js"></script>
	<meta charset="UTF-8">
	<title>엘리먼트의 어트리뷰트 값 제거하기</title>
	<style>
		p {   margin: 4px;  font-size: 20px;  font-weight: bolder; cursor: pointer;}
		.red {   color: red;}
		.under {   text-decoration: underline;}
		.highlight {   background: yellow;}
		.blue {
			color: blue;
		}		
	</style>	
	<script type="text/javascript">
		$(document).ready(function() {
			$('button#add').click(function(){
				$('#img0').attr('src','./../images/car0.jpg');
				$('#img0').attr('width','100');
				$('#img0').attr('height','100');
				
				$('#gogo').attr('href', 'http://www.naver.com');
			});
			
			$('button#remove').click(function(){
				$('#img0').attr('src','');//src 속성을 없앰 
			});
			
			$('p').addClass('red under');//두가지 속성 지정
			
			$('#removeClass').click(function(){
				$('p:even').removeClass('red under');
			});
			
			$('#changeClass').click(function(){
				$('p:odd').removeClass('red under').addClass('highlight');
			});
		});
	</script>
</head>
<body>   
	<h2>버튼을 클릭해 보세요.</h2>
	<button id="add">add Attribute</button> 
	<button id="remove">remove Attribute</button>
	
	<a id="gogo">
		<img id="img0"  title="똘이군" alt="puppy picture"><!-- 그림이 없으면 대체 이미지 : alt -->
	</a>
	<hr>
	<button id="removeClass">removeClass</button>
	<button id="changeClass">changeClass</button>
	
	<p>엘리먼트로부터</p>
	<p>클래스를</p>
	<p>추가하고</p>
	<p>제거하는</p>
	<p>연습하기</p>
</body>
</html>
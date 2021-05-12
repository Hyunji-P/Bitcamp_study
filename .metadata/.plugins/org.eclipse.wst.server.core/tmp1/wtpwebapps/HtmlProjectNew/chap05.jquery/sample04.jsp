<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<script src="./../js/jquery.min.js"></script>
	<meta charset="UTF-8">
	<title>조건에 반대되는 엘리먼트 검색하기-:not()</title>
	<script type="text/javascript">
		var output = function(where, selector){//output : 함수(동작)를 담고 있는 변수 
			/* alert(where);
			alert(selector); */
			var len = $(selector).length;
			
			var result= '요소 갯수 : ' + len + '<br>';
			
			$(selector).each(function () {
				result += $(this).text() + '<br>';
			});
			
			$(where).html(result);
		};
	
		$(document).ready(function() {
			output('#myarea01', 'span[id]');//span[id] : span 태그에 id속성을 가지고 있는 속성들
			
			// id="simpletext1" 인 요소의 갯수를 '#myarea02'에 표시하기
			output('#myarea02', 'span[id="simpletext1"]');
			
			// id가 "simpletext1"이 아닌 요소의 갯수
			output('#myarea03', 'span[id !="simpletext1"]');
			
			output('#myarea04', 'span[id^="complex"]');
			output('#myarea05', 'span[id$="text1"]');
			output('#myarea06', 'span[id*="text"]');
			
			$('input:checked + span').css('background-color','red');
			$('input:not(:checked) + span').css('background-color','yellow');
			
			$('input:checked + .gender').css('background-color','blue');
			$('input:not(:checked) + .gender').css('background-color','green');
		});
	</script>
</head>
<body>
	<div>
		<input type="radio" name="gender" /><span class="gender">남자</span>
	</div>
	<div>
		<input type="radio" name="gender" checked="checked"/><span class="gender">여자</span>
	</div>
	<div>
		<input type="checkbox" name="fruit" /><span>사과</span>
	</div>
	<div>
		<input type="checkbox" name="fruit" /><span>바나나</span>
	</div>
	<div>
		<input type="checkbox" name="fruit" checked="checked" /><span>오렌지</span>
	</div>
	<hr>
	<span id="simpletext1">simple</span>
	<span class="simpletext2">jQuery</span>
	<span id="complextext1">basic</span>
	<span id="complextext2">example</span>
	<span id="complex">book</span>
	
	<hr>
	<p id="myarea01"></p>
	<p id="myarea02"></p>
	<p id="myarea03"></p>
	<p id="myarea04"></p>
	<p id="myarea05"></p>
	<p id="myarea06"></p>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>조건에 반대되는 엘리먼트 검색하기-:not()</title>
	<script type="text/javascript">
		var output = function(where, selector){
			/* alert(where + '/' + selector) ; */
			var len = $(selector).length; /* 조건에 맞는 요소 개수 */
			var result = '요소 개수 : ' + len + '<br>'; 
			
			$(selector).each(function(){
				result += $(this).text() + "&nbsp;" ;
			});
			result += '<br>--------------------------------';
			
			$(where).html(result) ;
		};
	
		$(document).ready(function() {
			/* 체크 박스 중에서 체크되지 않는 항목들에 대하여 배경 색상을 노랗게 설정하시오 */
			$('input:not(:checked) + span').css('background-color', 'yellow');			

			output('#myarea01', 'span[id]') ;
			output('#myarea02', 'span[id="simpletext1"]') ;
			output('#myarea03', 'span[id!="simpletext1"]') ;
			output('#myarea04', 'span[id^="complex"]') ;
			output('#myarea05', 'span[id$="text1"]') ;
			output('#myarea06', 'span[id*="text"]') ;
		});
	</script>
</head>
<body>
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
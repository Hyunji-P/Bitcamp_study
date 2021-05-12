<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<HTML>
<HEAD>
	<TITLE> JQuery 실습하기 </TITLE>
	<script type="text/javascript">
		$(document).ready(function(){
			/* 여기서 first는 하나의 작업 대상 */
			/* 자바 스크립트에서 변수 선언시 var를  사용합니다. */
			var first = $("h1") ;
			var second = $("h2") ;
			
			first.css("background-color","orange") ;
			first.css("color","blue") ;
			
			/* 메소드 체이닝 : 2개 이상의 메소드를 연속적으로 적는 것 */
			second.css("background-color","yellow").css("color","red") ;

			/* 이전 스타일을 제거하기 */
			first.css('background-color', '');

			/* 특정 위치에 html 소스 코드를 작성합니다.  */
			$('#myarea').html("안녕 <b>메롱</b>");
			
			var result = '' ;
			/* 모든 p 태그, span 태그, div 태그 중 클래스 속성이 simpletext1인 항목들을 */
			var searchItems = $('p, span, div.simpletext1');
			/* alert(searchItems.length) ; */

			result += '검색 요수 개수 : ' + searchItems.length  ;

			$('#myarea01').html(result);
			
			result = '' ;
			searchItems.each(function(index, element){
				/* alert(index + '/' + element); */

				/* 각 항목들을 순회하면서 들어 있는 텍스트를 읽어 들인 다음 */
				result += $(this).html() + '&nbsp;&nbsp;&nbsp;' ;
			});
			$('#myarea02').html(result);			
		});
	</script>
</HEAD>
<BODY>
	<h1>jQuery 실습 01</h1>
	<h2>jQuery 실습 02</h2>
	<hr>
	<h4>여러 개의 엘리먼트에 접근</h4>
	<span>simple</span>
	<div class='simpletext1'>jQuery</div>
	<div>basic</div>
	<p>example</p>	
	<hr>
	<div id="myarea01"></div>
	<div id="myarea02"></div>
</BODY>
</HTML>
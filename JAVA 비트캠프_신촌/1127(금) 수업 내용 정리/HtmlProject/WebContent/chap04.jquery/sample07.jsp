<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>엘리먼트의 어트리뷰트 값 제거하기</title>
	<style>
		p {   
			margin: 4px;  
			font-size: 20px;  
			font-weight: bolder; 
			cursor: pointer;
		}
		.red {   
			color: red;
		}
		.under {   
			text-decoration: underline;
		}
		.highlight {  
			background: yellow;
		}
		.blue {
			color: blue;
		}		
	</style>	
	<script type="text/javascript">
		$(document).ready(function() {
			/* button 태그를 클릭하게 되면 현재 요소의 다음 요소에 대하여 src 속성을 제거한다 */
			/* 즉, 이문제에서는 img 태그의 src 속성이 사라진다 */
			$('button#add').click(function(){
				$('img0').attr('src', './../images/im0.jpg');
			});
			$('button#remove').click(function(){
				$('img0').attr('src', '');
			});
			
			/* 모든 p 태그에 대하여 red와 under 클래스 속성을 적용하라 */
			$("p").addClass("red under"); 
			
			/* id 속성이 removeClass을 클릭하면  */
			$("#removeClass").click(function() {
				/* p 태그 중 짝수 요소에 대하여 red와 under 클래스 속성을 제거하라 */
				$("p:even").removeClass("red under");
			});

			/* id 속성이 changeClass을 클릭하면  */
			$("#changeClass").click(function() {
				/* p 태그 중 홀수 요소에 대하여 red와 under 클래스 속성을 제거하라 */
				/* 그리고, highlight 속성을 추가하라 */
				$("p:odd").removeClass("red under").addClass('highlight');
			});
			
			$("p").click(function () { 
				/* 클릭된 요소에 대하여 blue 클래스 속성을 추가, 제거 시킨다. */
				$(this).toggleClass("blue"); 
			}); 			
		});
	</script>
</head>
<body>   
	<h2>버튼을 클릭해 보세요.</h2>
	<button id="add">add Attribute</button> 
	<button id="remove">remove Attribute</button>
	<img id="img0" src="./../images/im0.jpg" title="똘이군" alt="puppy picture">

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
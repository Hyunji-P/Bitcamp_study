<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title></title>
	<style type="text/css">
		em {
			font-size:20pt; 
			line-height: 20pt; 
			margin:20px;   
			color:blue;  
		}
		table { 
			table-layout:auto;   
			width: 75%;
		}
		td { 
			color: black;   
			font-weight: bold; 
		}
		.firststyle {
			color: red;  
			font-size: 20pt; 
			background-color: #33FF33 ;
		}
		.laststyle {
			color: blue;  
			font-size: 30pt; 
			background-color: #99CCFF;
			text-decoration: underline;
		}		
	</style>
	<script type="text/javascript">	
		$(document).ready(function() {
			/* 'p em' 선택자는  p 태그 아래의 모든 em 태그 */
			$('p em').css('background-color', 'yellow');
			
			/* 'p > em' 선택자는  p 태그 직계의 모든 em 태그 */
			$('p > em').css('color', 'red');

			$('p em').each(function(){
				$('.result1').append($(this).text() + '&nbsp;');
			});

			$('div em').css('background-color', 'pink');
			
			$('div > em').css('color', '#FFFF00');
			
			$('div em').each(function(){
				$('.result2').append($(this).text() + '&nbsp;');
			});

			/* 첫번째 tr 태그에 대하여 firststyle 클래스 속성을 추가하세요 */
			$('tr:first').addClass('firststyle');

			/* 마지막 tr 태그에 대하여 laststyle 클래스 속성을 추가하세요 */
			$('tr:last').addClass('laststyle');

			var message = ''; 
			message = '첫번째 요소 : ' + $('tr:first').html() + '\n' ;
			message += '마지막 요소 : ' + $('tr:last').html() + '\n' ;
			
			/* alert(message); */
			
			$('#myarea').text(message);
			
			/* first와 last는 오직 1개마 추출해줍니다. */
			$('.mytest span:first').css('color', 'red');
			$('.mytest span:last').css('color', 'blue');
			
			$('.mytest span:first-child').css('background-color', 'yellow');
			$('.mytest span:last-child').css('background-color', 'aqua');	
		});
		
	</script>
</head>
<body>
	<h3>인접한 자손 엘리먼트를 노드로 추가하기</h3>
	<p>
		<em>하나</em>
		<em>둘</em>
		<span><em>셋</em></span>
	</p>
	<div>
		<em>넷</em>
		<span><em>다섯</em></span>
		<em>여섯</em> 
	</div>
	<hr>
	<div>
		<span> ancestor descendant로 검색된 엘리먼트 : </span>
		<span class="result1"></span>
	</div>
	<div>
		<span> parent &gt; child로 검색된 엘리먼트 : </span>
		<span class="result2"></span>
	</div>
	<hr>
	<table>
		<tr><td>제시카</td></tr>
		<tr><td>티파니</td></tr>
		<tr><td>수영</td></tr>
		<tr><td>효연</td></tr>
	</table>
	<hr>
	<div id="myarea"></div>
	<hr>
	<h3>첫 번째와 마지막 자식 엘리먼트에 스타일 적용하기</h3>
	<h3>first-child, :last-child</h3>
	<div class="mytest"> 
		<span>one,</span> 
		<span>two,</span> 
		<span>three,</span>
		<span>four</span>
	</div> 
	<div class="mytest">      
		<span>five,</span> 
		<span>six,</span> 
		<span>seven,</span>
		<span>eight</span>
	</div>  
</body>
</html>
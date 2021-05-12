<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<script src="./../js/jquery.min.js"></script>
    <title>HTML 요소 가져오기</title>
	<style type="text/css">
		.noListStyle{
			/*list-style-type : 리스트 모양의 종류를 결정하는 속성(disc/square/none 등등)*/
			list-style-type: none ;
		}
		.horizontal{
			float:left;
			width:100px;
			height:50px;
			border:1px solid red;
			margin:10px ;
		}
		#blue{ color:blue ; font-weight: bold ; }
		.setToggle{ color:Red;background-color:Pink; }
		.forToggleClass{ color:Blue;background-color:Yellow; }		
	</style>    
    <script type="text/javascript">
        $(document).ready(function () {
			var headers = $('h3');
			
			var result = '';
			for(var i = 0; i < headers.length; i++){
				result += $(headers[i]).html() + ' ';
			}
			$('#myarea').text(result);
			
			function whenClick() {
				$(this).toggleClass('forToggleClass');	
			};
			
			$('#yourToggle li').click(whenClick); //click 함수 안에 함수 이름을 적을 수도 있음, 간접적으로 참조한다. 
			
			
	 		function first() {
				$(this).addClass('forToggleClass');
			};
			
			function second() {
				$(this).removeClass('forToggleClass');
			};
			
			$('#yourToggle li').toggle(fisrt, second); 
				
        });
    </script>
</head>
<body>
	<h3>강감찬</h3>
	<h3>을지문덕</h3>
	<h3>이수일</h3>
	<h3>심순애</h3>
	<hr />
	<div id="myarea"></div>
	
	<hr />
	<div id="myarea2"></div>
	
	<hr />
	
	<h1>toggle 함수 사용하기 실습</h1>
	소스의 <span id="blue">$("li").firstClass("horizontal");</span> 
	항목에 대한 주석을 해제하고 테스트 요망
	<ul id="myToggle">
		<li class="first"><h2>애프터 스쿨</h2></li>
		<li class="first"><h2>달샤벳</h2></li>
		<li class="first"><h2>티아라</h2></li>
	</ul>	
	
	<hr>
	<h1>toggleClass 사용하기 실습</h1>
	
	<ul id="yourToggle">
		<li><h2>애프터 스쿨</h2></li>
		<li><h2>달샤벳</h2></li>
		<li><h2>티아라</h2></li>
	</ul>	
</body>
</html>

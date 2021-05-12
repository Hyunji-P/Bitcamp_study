<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
<head>
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
            // h3 요소 모두 가져오기
            var headers = $('h3');
            
            var result = "" ;
            // 반복문을 써서 반복 : for문보다는 jQuery의 each문이 사용하기 편리            
            for (var i = 0; i < headers.length; i++) {
                result += $(headers[i]).html() + " " ;
            }
            $("#myarea").text( result ) ;
            
            result = "" ;
            $('h3').each(function (index) {
            	result += $(this).html() + " " ;  
            });  
            $("#myarea2").text( result ) ;
            
			$("li.first").addClass("noListStyle");
			$("li.first").addClass("horizontal");
			
			//아래의 코드를 주석 막고 테스트 해보세요.
			/* $("li.first").firstClass("horizontal") ; */   
			
			
			$("#yourToggle li").click(whenClick) ;
			
			function whenClick(){
				/* $(this) : 선택된 어떤 작업 대상 */
				$(this).toggleClass("forToggleClass");
			}
			function first(){
				$(this).addClass("setToggle") ;			
			}
			
			/* id 속성이 myToggle인 항목의 하위 li 태그들 */
			$("#myToggle li").toggle(first, second) ;
			
			/* function second(){
				$(this).removeClass("setToggle") ;
			} */			
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

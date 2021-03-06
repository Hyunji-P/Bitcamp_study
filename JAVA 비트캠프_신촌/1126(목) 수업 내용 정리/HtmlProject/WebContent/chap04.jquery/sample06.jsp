<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp" %>    
<!DOCTYPE html>
<html>
<head>
    <title>테이블의 짝수번째 배경색 변경</title>
    <style type="text/css">
        .redColor { background-color:red; }
        .blueColor { background-color:blue; }
    </style>   
    <script type="text/javascript">
        $(document).ready(function () {
        	$('tr:odd').addClass('redColor');
        	$('table tr:even').addClass('blueColor');
        	
        	$('tr:odd').css('background', 'lightblue');
        	$('tr:gt(4)').css('background', 'silver');
        	
        	$('tr:lt(2)').css('background', 'yellow');
        	
        	$('tr:last').css('background', 'green');           
        }); 
    </script>    
</head>
<body>
	<h1>수학 시험 점수</h1>
	
	<table class="nameTable" border="1">
		<tr><td width="100">이름</td><td width="100">점수</td></tr>
		<tr><td>홍석천</td><td>30</td></tr>
		<tr><td>아이유</td><td>40</td></tr>
		<tr><td>태연</td><td>50</td></tr>
		<tr><td>유리</td><td>60</td></tr>
		<tr><td>윤아</td><td>70</td></tr>
		<tr><td>강호동</td><td>80</td></tr>
		<tr><td>이효리</td><td>90</td></tr>		
	</table>    
</body>
</html>
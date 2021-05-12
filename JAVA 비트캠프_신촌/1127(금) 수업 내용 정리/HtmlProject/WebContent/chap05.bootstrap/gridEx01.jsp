<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp"%>
<%
	int leftside = 3 ;
	int rightside = twelve - leftside ;
	int myoffset = 3 ;
	int mywidth = twelve - 2 * myoffset ; 
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>BootStrap Sample</title>
	
	<style type="text/css">
		.style1{
			background-color: red; 
		}
		.style2{
			background-color: blue; 
		}
		.style3{
			background-color: green; 
		}
	</style>
	
</head>
<body>
	<div class="container-fluid">
		<h1>3등분(container-fluid)</h1>
		<div class="row">
			<div class="col-sm-4 style1">첫번째</div>
			<div class="col-sm-4 style2">두번째</div>
			<div class="col-sm-4 style3">세번째</div>
		</div>
	</div>
	<hr>
	<div class="container">
		<h1>3등분(container)</h1>
		<div class="row">
			<div class="col-sm-4 style1">첫번째</div>
			<div class="col-sm-4 style2">두번째</div>
			<div class="col-sm-4 style3">세번째</div>
		</div>
	</div>
	<hr>	
	<div class="container">
		<h1>1:2의 배율</h1>
		<div class="row">
			<div class="col-sm-4 style1">첫번째</div>
			<div class="col-sm-8 style2">두번째</div>
		</div>
	</div>
	<hr>
	<div class="container">
		<h1>1:3의 배율</h1>
		<div class="row">
			<div class="col-sm-<%=leftside%> style1">첫번째</div>
			<div class="col-sm-<%=rightside%> style2">두번째</div>
		</div>
	</div>
	<hr>
	<div class="container">
		<h1>옵셋을 이용한 정중앙</h1>
		<div class="row">
			<div class="col-sm-offset-<%=myoffset%> col-sm-<%=mywidth%> style1">첫번째</div>			
		</div>
	</div>
</body>
</html>
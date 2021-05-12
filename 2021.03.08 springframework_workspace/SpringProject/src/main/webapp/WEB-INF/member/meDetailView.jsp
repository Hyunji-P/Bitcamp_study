<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<%@include file="./../common/common.jsp"%>
<%
	int offset = 2 ; //오프 셋 
	int content = twelve - 2 * offset ; //12 - 2 * 오프셋	
%>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">	
	<title>BootStrap</title>
	<style type="text/css">
		/*.panel-body{ margin-bottom: -30px;}*/
	</style>
</head>
<body>
	<div class="container col-md-offset-<%=offset%> col-md-<%=content%>" align="right">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h1 class="panel-title" align="left">회원 정보 상세 보기</h1>
			</div>
			<div class="panel-body" align="left">
				<div class="col-md-12">
					<table class="table table-condendes table-striped" >
						<tr>
							<td width="25%" align="center"><spring:message code="member.id"/></td>
							<td width="75%">${bean.id}</td>
						</tr>
						<tr>
							<td width="25%" align="center"><spring:message code="member.name"/></td>
							<td width="75%">${bean.name}</td>
						</tr>		
						<tr>
							<td width="25%" align="center"><spring:message code="member.password"/></td>
							<td width="75%">${bean.password}</td>
						</tr>
						<tr>
							<td width="25%" align="center"><spring:message code="member.salary"/></td>
							<td width="75%">${bean.salary}</td>
						</tr>
						<tr>
							<td width="25%" align="center"><spring:message code="member.hiredate"/></td>
							<td width="75%">${bean.hiredate}</td>
						</tr>
						<tr>
							<td width="25%" align="center"><spring:message code="member.gender"/></td>
							<td width="75%">${bean.gender}</td>
						</tr>
						<tr>
							<td width="25%" align="center"><spring:message code="member.hobby"/></td>
							<td width="75%">${bean.hobby}</td>
						</tr>
						<tr>
							<td width="25%" align="center"><spring:message code="member.job"/></td>
							<td width="75%">${bean.job}</td>
						</tr>	
						<tr>
							<td width="25%" align="center"><spring:message code="member.zipcode"/></td>
							<td width="75%">${bean.zipcode}</td>
						</tr>
						<tr>
							<td width="25%" align="center"><spring:message code="member.address1"/></td>
							<td width="75%">${bean.address1}</td>
						</tr>
						<tr>
							<td width="25%" align="center"><spring:message code="member.address2"/></td>
							<td width="75%">${bean.address2}</td>
						</tr>
						<tr>
							<td width="25%" align="center"><spring:message code="member.point"/></td>
							<td width="75%">${bean.mpoint}</td>
						</tr>	
					</table>				
				</div>
				<hr>
				<div class="col-md-offset-5 col-md-4">
					<button class="btn btn-primary" onclick="history.back();">돌아 가기</button>
				</div>
			</div><!-- end panel-body -->
		</div>		
	</div>		
</body>
</html>
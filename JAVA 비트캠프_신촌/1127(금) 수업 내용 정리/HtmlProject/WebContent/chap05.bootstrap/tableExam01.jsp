<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="./../common/common.jsp"%>
<html>
<head>
</head>
<body>
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h2 class="panel-title" align="left">게시물 목록</h2>
			</div>		
			<div class="panel-body">
				패널 내부에 panel-body 있는 경우
			</div>
			<table class="table table-condensed">
				<thead>
					<tr>
						<th>번 호</th>
						<th>제 목</th>
						<th>글쓴이</th>
					</tr>
				</thead>
				<tr class="success">
					<td>1</td>
					<td>하하하</td>
					<td>홍길동</td>
				</tr>
				<tr class="warning">
					<td>2</td>
					<td>호호호</td>
					<td>임꺽정</td>
				</tr>
				<tr class="info">
					<td>3</td>
					<td>크크크</td>
					<td>강감찬</td>
				</tr>
				<tr class="danger">
					<td>4</td>
					<td>사랑해</td>
					<td>박영희</td>
				</tr>				
			</table>			
		</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>������̼� �̿��ϱ�</title>
</head>
<body>
	<h2 align="center">���� ���</h2>
	<table border="1" align="center" width="60%">
		<tr>
			<td width="30%">���̵�</td>
			<td>${member.id}</td>
		</tr>
		<tr>
			<td>�̸�</td>
			<td>${member.name}</td>
		</tr>
		<tr>
			<td>��� ��ȣ</td>
			<td>${member.password}</td>
		</tr>		
		<tr>
			<td>���ϸ��� ����Ʈ</td>
			<td>${member.mpoint}</td>
		</tr>
		<tr>
			<td>�ּ�</td>
			<td>${member.address1}</td>
		</tr>
		<tr>
			<td>���� �ּ�</td>
			<td>${member.address2}</td>
		</tr>
		<tr>
			<td>�̸���</td>
			<td>${member.email}</td>
		</tr>
		<tr>
			<td>���� ����</td>
			<td>${member.regdate}</td>
		</tr>	
		<tr>
			<td>�߱���</td>
			<td>${member.sportsTeam}</td>
		</tr>
		<tr>
			<td>��ȣ�ϴ� � ü��</td>
			<td>
				<c:forEach var="item" items="${member.favorites}">
					${item}&nbsp;
				</c:forEach>	
			</td>
		</tr>
		<tr>
			<td>����</td>
			<td>${member.jobCode}</td>
		</tr>		
		<tr>
			<td>������</td>
			<td>${member.tool}</td>
		</tr>
		<tr>
			<td>��Ÿ</td>
			<td>${member.etc}</td>
		</tr>
		<tr>
			<td>��� ����</td>
			<td>${member.agreement}</td>
		</tr>
	</table>	
</body>
</html>
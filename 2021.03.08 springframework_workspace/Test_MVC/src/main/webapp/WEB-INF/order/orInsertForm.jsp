<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>예약하기 폼</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript">
		function goBack() {
			window.history.back();
		}
		
		function calculate() {
			var or_stime = document.myform.or_stime.value;
			var or_etime = document.myform.or_etime.value;
			var or_hour = or_etime - or_stime;
			
			if (or_hour >  0) {
				$('input#fake_or_hour').val(or_hour);	
				$('input#or_hour').val(or_hour);
				
				var or_price = or_hour * 2000;
				$('input#fake_or_price').val(or_price);	
				$('input#or_price').val(or_price);
				return true;
			} else {
				alert('마지막 시간은 첫시간보다 커야합니다.');
				return false;
			}
		}
			
	</script>
	<style type="text/css">
		#formstyle{
			display: flex;
			flex-direction: column;
			align-items: center;
		}
		
		.err{
			color: red;
		}
	</style>
</head>
<body>
	<h2 align="center">예약하기</h2>
	<hr>
	<c:set var="contextPath" value="<%=request.getContextPath()%>"/>
	<form:form modelAttribute="order" id="formstyle" name="myform" action="${contextPath}/insert.or" method="post">
		<table border="1">
			<tr>
				<td>회원 ID</td>
				<td>
					<form:input path="or_id" />
					<form:errors path="or_id" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td>좌석 번호</td>
				<td>
					<form:input path="or_seat" />
					<form:errors path="or_seat" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td>예약 일자</td>
				<td>
					<form:input path="or_date" />
					<form:errors path="or_date" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td>예약 시간(첫 시간)</td>
				<td>
					<form:select path="or_stime" name="or_stime">
						<form:option value="0">--시간을 선택하세요.</form:option>
						<c:forEach var="i" begin="9" end="21" step="1" >
							<form:option value="${i}">${i}</form:option>
						</c:forEach>
					</form:select>	
					<form:errors path="or_stime" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td>예약 시간(마지막 시간)</td>
				<td>
					<form:select path="or_etime" name="or_etime">
						<form:option value="0">--시간을 선택하세요.</form:option>
						<c:forEach var="i" begin="9" end="21" step="1" >
							<form:option value="${i}">${i}</form:option>
						</c:forEach>
					</form:select>	
					<form:errors path="or_etime" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td>총 예약 시간</td>
				<td>
					<input type="text" id="fake_or_hour" name="fake_or_hour" disabled="disabled" placeholder="마지막 시간 - 첫 시간">
					<input type="hidden" id="or_hour" name="or_hour" value="0">
				</td>
			</tr>
			<tr>
				<td>총 가격</td>
				<td>
					<input type="text" id="or_price" name="or_price" disabled="disabled" placeholder="이용시간 x 2000원">
					<input type="hidden" id="or_price" name="or_price">
				</td>
			</tr>
			<tr>
				<td colspan="10" align="center">
					<button type="button" onclick="goBack();">뒤로가기</button> 
					&nbsp;&nbsp;
					<button type="button" onclick="return calculate();">이용 시간 및 이용 가격 구하기</button> 
					&nbsp;&nbsp;
					<input type="submit" value="예약하기">
					&nbsp;&nbsp;
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>
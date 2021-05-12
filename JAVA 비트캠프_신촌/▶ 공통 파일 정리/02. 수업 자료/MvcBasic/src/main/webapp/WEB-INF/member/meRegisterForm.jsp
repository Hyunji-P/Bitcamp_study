<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>로그인 폼</title>
<style type="text/css">
.err {
	font-size: 9pt;
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<h2 align="center">회원 가입하기</h2>
	
	<c:set var="apppath" value="<%=request.getContextPath()%>" />
	
	<form:form modelAttribute="member" commandName="member" action="${apppath}/register.me" method="post">
		<table border="1" align="center" width="70%">
			<tr>
				<td width="25%" align="center">
					아이디
				</td>
				<td width="75%" align="left">
					<form:input path="id" value="" />
					<form:errors cssClass="err" path="id" /> 
				</td>				
			</tr>
			<tr>
				<td width="25%" align="center">
					이름
				</td>
				<td width="75%" align="left">
					<form:input path="name" value="" />
					<form:errors cssClass="err" path="name" />  
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">
					비밀 번호
				</td>
				<td width="75%" align="left">
					<form:password path="password" value="" />
					<form:errors cssClass="err" path="name" />  
				</td>
			</tr>				
			<form:hidden path="mpoint" value="10" />
			<tr>
				<td width="25%" align="center">주소</td>
				<td width="75%" align="left">
					<form:input type="text"
						class="setdiaabledme" path="address1" value=""
						size="40" readonly="readonly" />
					<form:errors cssClass="err" path="address1" />						
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">세부 주소</td>
				<td width="75%" align="left">
					<form:input type="text" path="address2" size="40" value="" />
					<form:errors cssClass="err" path="address2" />
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">이메일</td>
				<td width="75%" align="left"><form:input type="text"
						path="email" size="40" value="" /> 
					<form:errors cssClass="err" path="email" />
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">가입 일자</td>
				<td width="75%" align="left"><form:input type="text"
						path="regdate" value="2015/01/12" /><form:errors cssClass="err"
						path="regdate" /></td>
			</tr>
			<tr>
				<td width="25%" align="center">좋아하는 야구팀</td>
				<td width="75%" align="left">						
					<form:select path="sportsTeam" >
						<option value="">--- 선택하세요 ---</option>
						<form:options items="${sportsTeams}" itemLabel="name" itemValue="mascot" />
					</form:select>
					<form:errors cssClass="err" path="sportsTeam" />
				</td>
			</tr>				
			<tr>
				<td width="25%" align="center">선호하는 운영 체제</td>
				<td width="75%" align="left">
					<form:checkboxes items="${favoritesOsNames}" path="favorites" />
					<form:errors cssClass="err" path="favorites" />
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">직업</td>
				<td width="75%" align="left"><select name="jobCode">
						<option value="0">
							---선택해 주세요
							<c:forEach var="onejob" items="${joblists}" varStatus="index">
								<c:if test="${index.count == 3}">
									<option value="${index.count}" selected="selected">${onejob}
								</c:if>
								<c:if test="${index.count != 3}">
									<option value="${index.count}">${onejob}
								</c:if>
							</c:forEach>
				</select> <form:errors cssClass="err" path="jobCode" /></td>
			</tr>
			<tr>
				<td width="25%" align="center">개발툴</td>
				<td width="75%" align="left"><form:radiobuttons
						items="${tools}" path="tool" itemLabel="korea"
						itemValue="english" /><form:errors cssClass="err" path="tool" /></td>
			</tr>
			<tr>
				<td align="center">기타</td>
				<td width="75%" align="left"><form:textarea path="etc"
						cols="20" rows="3" /></td>
			</tr>
			<tr>
				<td width="25%" align="center">약관 동의</td>
				<td width="75%" align="left">
					<form:checkbox path="agreement" label="약관에 동의합니다." />
					<form:errors cssClass="err" path="agreement" />
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="회원 가입" > <input
					type="reset" value="취소"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    

 
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
	<style type="text/css">
		.err { font-size:9pt;color:red;font-weight: bold; }
	</style>
</head>
<body>
<h2>회원가입하기</h2>
<c:set var="apppath" value="<%=request.getContextPath()%>"/>
<form:form commandName="member" modelAttribute="member" action="${apppath}/register.me" method="post">
	<form:hidden path="mpoint" value="10" />
	
	<table border="1">
         <tr>
            <td width="25%" align="center">아이디</td>
            <td width="75%" align="left">
               <form:input path="id"/>
               <form:errors path="id" cssClass="err"/>
            </td>
         </tr>
         <tr>
            <td width="25%" align="center">이름</td>
            <td width="75%" align="left">
            <form:input path="name"/>
            <form:errors path="name" cssClass="err"/></td>
         </tr>
         <tr>
            <td width="25%" align="center">비밀번호</td>
            <td width="75%" align="left">
            <form:input path="password"/>
            <form:errors path="password" cssClass="err"/>
            </td>
         </tr>
         <tr>
            <td width="25%" align="center">주소</td>
            <td width="75%" align="left">
            <form:input path="address1"/>
            <form:errors path="address1" cssClass="err"/>
            </td>
         </tr>
         <tr>
            <td width="25%" align="center">세부 주소</td>
            <td width="75%" align="left">
            <form:input path="address2"/>
            <form:errors path="address2" cssClass="err"/>
            </td>
         </tr>
         <tr>
            <td width="25%" align="center">이메일</td>
            <td width="75%" align="left">
            <form:input path="email"/>
            <form:errors path="email" cssClass="err"/>
            </td>
         </tr>
         <tr>
            <td width="25%" align="center">가입일자</td>
            <td width="75%" align="left">
            <form:input path="regdate"/>
            <form:errors path="regdate" cssClass="err"/>
            </td>
         </tr>
         <tr>
            <td width="25%" align="center">좋아하는 야구팀</td>
            <td width="75%" align="left">
            <form:select path="sportsTeam">
            <form:options items="${sportsTeams}" itemLabel="name" itemValue="mascot"/>
            </form:select>
            <form:errors path="sportsTeam" cssClass="err"/>
            </td>
         </tr>
         <tr>
            <td width="25%" align="center">선호하는 운영체제</td>
            <td width="75%" align="left">
            <form:checkboxes items="${favorites}" path="favorites"/>
            <form:errors path="favorites" cssClass="err"/>
            </td>
         </tr>
         <tr>
            <td width="25%" align="center">직업</td>
            <td width="75%" align="left">
            <select name="jobCode">
               <c:forEach var="onejob" items="${joblists}" varStatus="status">
                  <c:if test="${status.count == 3}">
                     <option value="${status.count }" selected="selected">${onejob }
                  </c:if>
                  <c:if test="${status.count != 3}">
                     <option value="${status.count }">${onejob }
                  </c:if>
               </c:forEach>            
            </select>
            <form:errors path="jobCode" cssClass="err"/>
            </td>
         </tr>
         <tr>
            <td width="25%" align="center">개발툴</td>
            <td width="75%" align="left">
               <form:radiobuttons path="tool" items="${tools }" itemLabel="korea" itemValue="english"/>
               <form:errors path="tool" cssClass="err"/>
            </td>
         </tr>
         <tr>
            <td width="25%" align="center">기타</td>
            <td width="75%" align="left">
            <form:textarea path="etc" cols="20" rows="3"/>
            <form:errors path="etc" cssClass="err"/></td>
         </tr>
         <tr>
            <td width="25%" align="center">약관 동의</td>
            <td width="75%" align="left">
            <form:checkbox path="agreement" label="약관에 동의합니다."/>
            <form:errors path="agreement" cssClass="err"/>
            </td>
         </tr>
         <tr>
            <td colspan="2" align="center"><input type="submit" value="회원가입">
            <input type="reset" value="취소"></td>
         </tr>
      </table>

</form:form>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- common.jsp 에 부트 스트랩 관련 코딩들이 들어 있으므로 -->
<!-- 따로 설정하지 않아도 됩니다. -->
<%@ include file="./../common/common.jsp"%>

<!-- jsp 파일에서 계속 반복적으로 코딩하는 부분이기 때문에 common.jsp 파일에 넣어놓는 것도 고려 할 것 -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title><spring:message code="member.register01" /></title>
	<script type="text/javascript">
		function checkDuplicateId() {/* 아이디 중복 체크 */
			var id = $("#id").val();
			//alert(id);
			if(id.length < 4){
				alert('id는 최소 4자리 이상이어야 합니다.');
				document.myform.id.focus(); // focus 를 주면 해당 input 태그에 강조 
				return false;
			}
			var url = '<%=contextPath%>/idcheck.me?id=' + id;
			window.open(url, 'mywin' , 'height=150,width=300');
			return true;
			
		}
		
		function findZipcode() { /* 우편번호 찾기 */
			var url = '<%=contextPath%>/zipcheck.me?'
			window.open(url, 'mywin' , 'height=600,width=720,statusbar=yes,scrollbars=yes,resizable=no');
		}
		
		/* function checkForm() {  회원 가입 버튼 클릭 
			var isCheck = document.myform.isCheck.value;
			//alert(isCheck);
			
			if (isCheck == 'false') {
				alert('중복체크를 먼저 해주세요.');
				return false;
			}
		} */
		
		/* function isCheckFalse() {
			키보드에서 손을 떼면 호출이 되는데 , 
			document.myform.isCheck.value = false;
		} */
		
	</script>
</head>
<body>
	<div align="center" class="container col-sm-offset-2 col-sm-8">
		<h2>
			<spring:message code="member.update01" />
		</h2>
		<div class="panel panel-primary">
			<div class="panel panel-heading" align="left">
				<font color="white">
					<b><spring:message code="member.update01" /></b> 
					페이지 입니다.
				</font>
			</div>
			<div class="panel panel-body">
				<c:set var="apppath" value="${contextPath}"/>
				<form:form name="myform" modelAttribute="member" action="${apppath}/update.me" method="post" class="form-horizontal" role="form">
				
					<%-- jsp 주석 : isCheck 가 false 이면 회원 가입이 불가능합니다.(소스보기에서 안보임) --%> 				
					<%-- <input type="hidden" name="isCheck" value="false" id="isCheck"> --%>
					
					<!-- html 주석 : 마일리지 포인트는 숨겨서 넘깁니다. (소스보기에서 보임)-->
					<%--<input type="hidden" name="mpoint" value="5">--%>
					
				
					<!-- -------------------------------------------------------------------------- -->
					<!-- 중복 체크 기능이 필요 없습니다. -->
					<!-- 아이디 읽기 전용으로 설정하고 , 숨겨서 넘기도록 합니다. -->
					<div class="form-group">
						<label for="id" class="col-sm-3">
							<spring:message code="member.id"/>
						</label>
						<div class="col-sm-9">
							<input value="${member.id}" type="text" id="fakeid" name="fakeid" class="form-control" disabled="disabled"/>
							<input type="hidden" name="id" id="id" value="${member.id}">
						</div>
					</div>
					<!-- -------------------------------------------------------------------------- -->
					<div class="form-group">
						<label for="name" class="col-sm-3">
							<spring:message code="member.name"/>
						</label>
						<div class="col-sm-9">
							<form:input path="name" value="${name}" type="text" id="name" name="name" class="form-control"/>
							<form:errors path="name" cssClass="err"/><!-- err 스타일 태그는 common.jsp 파일에 넣어둠 -->
						</div>
					</div>
					<!-- -------------------------------------------------------------------------- -->
					<div class="form-group">
						<label for="password" class="col-sm-3">
							<spring:message code="member.password"/>
						</label>
						<div class="col-sm-9">
							<form:input path="password" value="${password}" type="text" id="password" name="password" class="form-control"/>
							<form:errors path="password" cssClass="err"/><!-- err 스타일 태그는 common.jsp 파일에 넣어둠 -->
						</div>
					</div>
					<!-- -------------------------------------------------------------------------- -->
					<div class="form-group">
						<label for="salary" class="col-sm-3">
							<spring:message code="member.salary"/>
						</label>
						<div class="col-sm-9">
							<form:input path="salary" value="${salary}" type="text" id="salary" name="salary" class="form-control"/>
							<form:errors path="salary" cssClass="err"/><!-- err 스타일 태그는 common.jsp 파일에 넣어둠 -->
						</div>
					</div>
					<!-- -------------------------------------------------------------------------- -->
					<div class="form-group">
						<label for="hiredate" class="col-sm-3">
							<spring:message code="member.hiredate"/>
						</label>
						<div class="col-sm-9">
							<form:input path="hiredate" value="${hiredate}" type="text" id="hiredate" name="hiredate" class="form-control"/>
							<form:errors path="hiredate" cssClass="err"/><!-- err 스타일 태그는 common.jsp 파일에 넣어둠 -->
						</div>
					</div>
					<!-- -------------------------------------------------------------------------- -->
					<div class="form-group">
						<label for="gender" class="col-sm-3">
							<spring:message code="member.gender"/>
						</label>
						<div class="col-sm-9" align="left">
							<label class="radio-inline">
								<form:radiobuttons path="gender" items="${radiolist}" itemLabel="mykey" itemValue="mykey" />
							</label>
							<form:errors path="gender" cssClass="err"/><!-- err 스타일 태그는 common.jsp 파일에 넣어둠 -->
						</div>
					</div>
					<!-- -------------------------------------------------------------------------- -->
					<div class="form-group">
						<label for=hobby class="col-sm-3">
							<spring:message code="member.hobby"/>
						</label>
						<div class="col-sm-9" align="left">
							<label class="radio-inline">
								<form:checkboxes path="hobby" items="${checklist}" itemLabel="mykey" itemValue="mykey"/>
							</label>
							<form:errors path="hobby" cssClass="err"/><!-- err 스타일 태그는 common.jsp 파일에 넣어둠 -->
						</div>
					</div>
					<!-- -------------------------------------------------------------------------- -->
					<div class="form-group">
						<label for=job class="col-sm-3">
							<spring:message code="member.job"/>
						</label>
						<div class="col-sm-9" align="left">
							<form:select path="job">
								<form:options items="${selectlist}" itemLabel="mykey" itemValue="mykey"/>
							</form:select>
							<form:errors path="job" cssClass="err"/><!-- err 스타일 태그는 common.jsp 파일에 넣어둠 -->
						</div>
					</div>
					<!-- -------------------------------------------------------------------------- -->
					<div class="form-group">
						<label for="zipcode" class="col-sm-3">
							<spring:message code="member.zipcode"/>
						</label>
						<div class="col-sm-7">
							<%-- 우편 번호의 주소는 읽기 전용 이므로 form: 네임 스페이스를 사용하지 않고 처리함 --%>
							<%-- 진짜 우편 번호와 주소란에 입력이 안되는 문제 때문입니다. --%>
							<input value="${member.zipcode}" type="text" id="fakezipcode" name="fakezipcode" class="form-control" disabled="disabled"/>
							<input type="hidden" name="zipcode" value="${member.zipcode}" id="zipcode">
							<form:errors path="zipcode" cssClass="err"/><!-- err 스타일 태그는 common.jsp 파일에 넣어둠 -->
						</div>
						<div class="col-sm-2" align="left">
							<input type="button" class="btn btn-info" value="<spring:message code="member.findZipcode" />"
							onclick="javascript:findZipcode();" >
						</div>
					</div>
					<!-- -------------------------------------------------------------------------- -->
					<div class="form-group">
						<label for="address1" class="col-sm-3">
							<spring:message code="member.address1"/>
						</label>
						<div class="col-sm-9">
							<input value="${member.address1}" type="text" id="fakeaddress1" name="fakeaddress1" class="form-control" disabled="disabled"/>
							
							<input type="hidden" name="address1" value="${member.address1}" id="address1">
							
							<form:errors path="address1" cssClass="err"/><!-- err 스타일 태그는 common.jsp 파일에 넣어둠 -->
						</div>
					</div>
					<!-- -------------------------------------------------------------------------- -->
					<div class="form-group">
						<label for="address2" class="col-sm-3">
							<spring:message code="member.address2"/>
						</label>
						<div class="col-sm-9">
							<form:input path="address2" value="${address2}" type="text" id="address2" name="address2" class="form-control"/>
							<form:errors path="address2" cssClass="err"/><!-- err 스타일 태그는 common.jsp 파일에 넣어둠 -->
						</div>
					</div>
					
					<!-- -------------------------------------------------------------------------- -->
					<div class="form-group">
						<div class="col-sm-12">
							<button type="submit" class="btn btn-default">
								<spring:message code="member.update02"/>
							</button>
							&nbsp;&nbsp;&nbsp;
							<button type="reset" class="btn btn-default">
								초기화
							</button>	
						</div>
					</div>
					<!-- --------------------------------------------------------- -->
				
				</form:form>
			</div>
		</div>
	</div>
		<!-- meUpdateForm.jsp -->
		<!-- 이전에 체크했던 내용을 체크 박스에 on 상태로 만들어 주기 -->
		<script type="text/javascript">
			$(document).ready(function () {
				/* 취미 체크 박스에 대하여 */
				var checkboxes = $("input[name='hobby']");
				//alert(checkboxes.length); // 체크 박스 갯수 
				
				checkboxes.each(function () {
					var typename = $(this).val();
					if ('${member.hobby}'.indexOf(typename) >= 0) {
						// on 상태로 설정하기 
						$(this).attr('checked', true); 
					}
				});
			})
		</script>
</body>
</html>
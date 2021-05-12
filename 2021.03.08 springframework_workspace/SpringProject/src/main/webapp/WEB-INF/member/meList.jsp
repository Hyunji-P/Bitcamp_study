<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="./../common/common.jsp"%>
<%
	int myoffset = 2;
	int mywidth = twelve - 2 * myoffset;
	int formleft = 3 ;
	int formright = twelve - formleft ; 
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>BootStrap Sample</title>
	<script type="text/javascript">
	    // 검색 모드와 해당 키워드를 이용한 필드 검색 
		function search() {
			// alert($('#mode').val());
			var mode = $('#mode').val();
			var keyword = $('#keyword').val();
			
			if (mode == 'all') {
				alert('검색 모드를 선택해주세요.');
				$('#mode').focus(); // 해당 영역에 포커스 넣기 
			}else{
				//alert(keyword); // 글자 출력
				//alert(keyword.length); // 글자 길이 출력 
				var param = '?mode=' + mode + '&keyword=' + keyword ;
				var url = '<%=contextPath%>/list.me' + param ; 
				//alert(url);
				location.href = url;
				
			}
		}	
		
		function searchAll() {
			// location 객체의 href 속성은 특정 페이지로 이동하기 위한 자바스크립트 내장 객체
			location.href='<%=contextPath%>/list.me';
		}	
	</script>
</head>
<body>
	<div class="container col-sm-offset-<%=myoffset%> col-sm-<%=mywidth%>">
		<div class="panel panel-default panel-warning">
			<div class="panel-heading"><h4><spring:message code="member.register03" /></h4></div>
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th><spring:message code="member.id" /></th>
						<th><spring:message code="member.name" /></th>
						<th><spring:message code="member.salary" /></th>
						<th><spring:message code="member.hiredate" /></th>
						<th><spring:message code="member.gender" /></th>
						<th><spring:message code="member.hobby" /></th>
						<th><spring:message code="member.job" /></th>
						<th><spring:message code="member.address1" /></th>
						<th><spring:message code="member.address2" /></th>
						<th><spring:message code="member.point" /></th>					
						<th>삭제</th>
						<th>수정</th>
					</tr>
				</thead>
				<!-- ------------------------------------------------------------------------------------ -->
				<tr>
					<td colspan="12" align="center">
						<form class="form-inline" action="<%=contextPath%>/list.me" method="get">
							<div class="form-group">
								<select class="form-control" name="mode" id="mode">
									<option value="all">--- 선택하세요. ---</option>
									<option value="name">이름</option>
									<option value="gender">성별</option>
								</select>
							</div>
							<div class="form-group">
								<input class="form-control" type="text" name="keyword" id="keyword" placeholder="검색 키워드를 넣어 주세요.">
							</div>	
							<button type="button" class="btn btn-default" onclick="search();">찾기</button>
							<button type="button" class="btn btn-default" onclick="searchAll();">전체 검색</button>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<p class="form-control-static">
								${requestScope.pageInfo.pagingStatus}
							</p>
						</form>
					</td>
				</tr>
				<!-- ------------------------------------------------------------------------------------ -->
				<c:forEach var="bean" items="${requestScope.lists}">
					<tr>
						<td>${bean.id}</td>
						<td>
							<a href="<%=contextPath%>/detailview.me?id=${bean.id}">                     
								${bean.name}
							</a>
						</td>
						<td>${bean.salary}</td>
						<td>${bean.hiredate}</td>
						<td>${bean.gender}</td>
						<td>${bean.hobby}</td>
						<td>${bean.job}</td>
						<td>${bean.address1}</td>
						<td>${bean.address2}</td>
						<td>${bean.mpoint}</td>
						<td>
							<c:if test="${bean.id == 'admin'}">
								삭제
							</c:if>
							<c:if test="${bean.id != 'admin'}">
								<a href="<%=NoForm%>delete.me&id=${bean.id}">
									삭제
								</a>
							</c:if>
						</td>
						<td>
							<a href="<%=NoForm%>update.meForm&id=${bean.id}">
								수정
							</a>
						</td> 
					</tr>
				</c:forEach>				
			</table>
		</div>
		<div align="center">
			<footer>${requestScope.pageInfo.pagingHtml}</footer>	
		</div>		
	</div>
	<script type="text/javascript">
		/* 방금전 선택했던 콤보 박스의 상태를 그대로 보여주기  */
		$('#mode option').each(function () {
			//alert($(this).val());
			if ($(this).val() == '${requestScope.mode}') {
				$(this).attr('selected','selected');
			}
		});
		
		/* 방금 넣었던 검색 키워드를 그대로 보여주기 */
		$('#keyword').val('${requestScope.keyword}');
	</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="./../css/bootstrap.min.css">
	<script src="./../js/jquery-1.11.3.js"></script>
	<script src="./../js/bootstrap.min.js"></script>
	<script type="text/javascript">
	</script>
	<style type="text/css">
	</style>
</head>
<%
	int twelve = 12;
	int offset = 2;
	int content = twelve - 2 * offset;
	int leftside = 4;
	int rightside = twelve - leftside;
%>
<body>
	<div class="container col-md-offset-<%=offset%> col-md-<%=content%>" align="right">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h1 class="panel-title" align="left">
					상품 상세 보기 
				</h1>
			</div>
			<div class="panel-body" align="left">
				<div class="col-md-12">
					<div class="col-md-<%=leftside%>" align="left">
						<table class="table table-bordered">
							<tr>
								<td>
									<img alt="그림" src="./../images/Lighthouse.jpg" width="180" height="180"
									class="img-thumbnail">
								</td>
							</tr>
						</table>
					</div>
					<div class="col-md-<%=rightside%>" align="center">
						<table class="table table-hover">
							<tr>
								<td width="25%">글 번호</td>
								<td width="75%">100</td>
							</tr>
							<tr>
								<td width="25%">제목(조회수)</td>
								<td width="75%">
									오 마이 걸
									<span class="badge">42</span>
								</td>
							</tr>
							<tr>
								<td width="25%">작성자</td>
								<td width="75%">홍길동</td>
							</tr>
							<tr>
								<td width="25%">글 내용</td>
								<td width="75%">재밌어요</td>
							</tr>
							<tr>
								<td width="25%">주문 수량</td>
								<td width="75%">
									<form action="" role="form" class="form-horizontal">
										<div class="form-group col-sm-4">
											<input class="form-control mypopover" data-toggle="popover" title="수량 입력란" data-content="구매하고자 하는 수량을 정수로 입력하세요." 
											data-trigger="hover" data-placement="auto top" >
										</div>
										<div class="form-group col-sm-3">
											<input class="form-control" type="button" value="주문">
										</div>
									</form>
								</td>
							</tr>
							<tr>
								<td width="25%">작성 일자</td>
								<td width="75%">2020/12/25</td>
							</tr>
						</table>
					</div>
				</div>
				<hr>
				<div class="col-md-offset-5 col-md-4">
					<button class="btn btn-primary">
						돌아 가기 
					</button>
				</div>
			</div><!-- end panel body -->
		</div>
	</div>
	<script type="text/javascript">
		$(document).ready(function(){
		  $('.mypopover').popover();
		});
	</script>
</body>
</html>
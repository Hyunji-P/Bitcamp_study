<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="./../common/common.jsp"%>
<%
	int offset = 2 ; //오프 셋 
	int content = twelve - 2 * offset ; //12 - 2 * 오프셋
	int leftside = 4 ;
	int rightside = twelve - leftside ;
%>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">	
	<title>BootStrap</title>
	<style type="text/css">
		/*.panel-body{ margin-bottom: -30px;}*/
		.form-group{ margin-bottom : 3px; }
		.form-control, .myheight{ height:25px; }
	</style>
	<script type="text/javascript">
		function func1(){
			alert('주문하기') ;
			return false ;
		}
	</script>
</head>
<body>
	<div class="container col-md-offset-<%=offset%> col-md-<%=content%>" align="right">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h1 class="panel-title" align="left">해당 상품 상세 보기(주문 수량에 <font color='red'><b>팝오버</b></font> 적용됨)</h1>
			</div>
			<div class="panel-body" align="left">
				<div class="col-md-12">
					<div class="col-md-<%=leftside%>" align="center">
						<table class="table table-bordered" border="0">
							<tr>
								<td align="center">
									<img align="middle" alt="" width="180" height="180" class="img-rounded" 
										src="./../images/Lighthouse.jpg" class="col-md-12"  >							
								</td>
							</tr>
						</table>		
					</div><!-- end left side image -->
					<div class="col-md-<%=rightside%>" align="center">
						<table class="table table-hover table-striped" border="0">
							<tr>
								<td width="25%">글 번호</td>
								<td width="75%">100</td>
							</tr>
							<tr>
								<td width="25%">제목(조회수)</td>
								<td width="75%">젝키의 폼생폼사 <span class="badge">42</span></td>
							</tr>		
							<tr>
								<td width="25%">작성자</td>
								<td width="75%">홍길동</td>
							</tr>
							<tr>
								<td width="25%">글 내용</td>
								<td width="75%">넘 잼있어요</td>
							</tr>
							<tr>
								<td width="120">주문 수량</td>
								<td width="300">
									<form class="form-horizontal" role="form" action="add.mall" method="post">
										<input type="hidden" name="pmkey" value="${product.num}">
										<div class="form-group">											
						        			<div class="col-xs-4 col-lg-4 myheight" >
						            			<input type="text" name="qty" id="qty" data-toggle="popover" title="수량 입력란"
						            				data-content="구매하시고자 하는 수량을 정수로 입력해 주세요." 
						            				data-trigger="hover" data-placement="auto top"
						            				class="form-control mypopover" placeholder="수량 입력"> 
						        			</div>
						        			<div class="myheight col-xs-<%=3%> col-lg-<%=3%>" align="left">
						            			<input type="button" class="btn btn-info form-control" value="주문" onclick="return func1();"> 
						        			</div>
						        		</div>
						        	</form> 								
								</td>
							</tr>	
							<tr>
								<td width="25%">작성 일자</td>
								<td width="75%">2016/12/25</td>
							</tr>
						</table>				
					</div><!-- end right side table contents -->
				</div>
				<hr>
				<div class="col-md-offset-5 col-md-4">
					<button class="btn btn-primary" onclick="history.back();">
						돌아 가기
					</button>
				</div>
			</div><!-- end panel-body -->
		</div>		
	</div>
	<script type="text/javascript">
		$(".mypopover").popover();
	</script>		
</body>
</html>
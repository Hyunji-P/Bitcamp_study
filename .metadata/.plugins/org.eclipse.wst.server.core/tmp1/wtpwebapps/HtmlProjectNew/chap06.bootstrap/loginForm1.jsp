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
<body>
	<div class="col-sm-offset-3 col-sm-6">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h2 class="panel-title">
					로그인하기 
				</h2>
			</div> 
			<div class="panel-body col-sm-6" >
				<form action="" method="post" role="form" class="form-horizontal">
					<div class="form-group">
						<label for="id" class="col-sm-3 col-lg-3 control-label" >아이디</label>
						<div class="col-sm-9 col-lg-9">
							<input type="text" id="id" name="id" class="form-control" placeholder="입력하지 않았을 때 보여주는 문구"
							data-toggle="tooltip" title="3글자 이상 10글자 이하로 넣어 주세요." data-placement="auto left">
						</div>
					</div>
					<div class="form-group">
						<label for="password" class="col-sm-3 col-lg-3 control-label">패스워드</label>
						<div class="col-sm-9 col-lg-9">
							<input type="password" id="password" name="password" class="form-control">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-3 col-sm-2 col-lg-2">
							<button type="submit" class="btn btn-default">
								로그인
							</button>
						</div>
						<div class="col-sm-offset-1 col-sm-2 col-lg-2">
							<button type="reset" class="btn btn-lg btn-primary">
								취&nbsp;&nbsp;&nbsp;소
							</button>
						</div>
					</div>
				</form>
			</div> 
			<div class="panel-footer">
				<h2 class="panel-title">
					로그인 페이지 입니다. 
				</h2>
			</div>
		</div>
	</div>
	
	<script>
		$(document).ready(function(){
		  $('[data-toggle="tooltip"]').tooltip();
		});
	</script>
</body>
</html>
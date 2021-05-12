<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="./../css/bootstrap.min.css">
	<script src="./../js/jquery.min.js"></script>
	<script src="./../js/popper.min.js"></script>
	<script src="./../js/bootstrap.min.js"></script>
	<script type="text/javascript">
	
	</script>
	<style type="text/css">
	</style>
</head>
<body>
	<div class="container">
		<h2>Stacked form</h2>
		<form action="/action_page.php">
			<div class="form-group">
				<label for="name">Name:</label> 
				<input type="text" class="form-control" id="name" placeholder="이름을 입력해주세요." name="name">
			</div>
			<div class="form-group">
				<label for="email">Email:</label> 
				<input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> 
				<input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
			</div>
			<div class="form-group form-check">
				<label class="form-check-label"> 
					<input class="form-check-input" type="checkbox" name="remember">Remember me
				</label>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>
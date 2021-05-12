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
	<form action="/action_page.php">
		<div class="custom-control custom-checkbox mb-3">
			<input type="checkbox" class="custom-control-input" id="customCheck" name="hobby"> 
			<label class="custom-control-label" for="customCheck">
				가가가
			</label>
		</div>
		<div class="custom-control custom-checkbox mb-3">
			<input type="checkbox" class="custom-control-input" id="customCheck" name="hobby"> 
			<label class="custom-control-label" for="customCheck">
				나나나
			</label>
		</div>
		<input type="checkbox" id="defaultCheck" name="example2"> 
		<label for="defaultCheck">
			Default checkbox
		</label> 
		<br>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>

</body>
</html>
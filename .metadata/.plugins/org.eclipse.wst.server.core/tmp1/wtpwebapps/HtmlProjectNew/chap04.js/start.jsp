<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
	
	</style>
	<script type="text/javascript">
		function openWindow(url) {
			var width = 300;
			var height = 300;
			
			var newwidth = (screen.width - width) / 2;
			var newheight = (screen.height - height) / 2;
			
			var options = 'width=' + width  ;
			options += ',height=' + height;  
			options += ',left=' + newwidth;  
			options += ',top=' + newheight;  
			
			window.open(url , 'mytitle' , options) ;	
		}
	</script>
</head>
<body>
	<h3>열기 버튼을 클릭하세요.</h3>
		<form action="" name="superform">
			결과 : 
			<input type="text" name="result"><br>
			<input type="button" value="열기" onclick="openWindow('end.jsp');">
		</form>

</body>
</html>
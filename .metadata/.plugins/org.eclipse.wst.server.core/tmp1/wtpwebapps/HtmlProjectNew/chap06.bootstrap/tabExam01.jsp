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
	<div class="container">
		<h3>먹거리 상품</h3>
		<ul class="nav nav-tabs">
			<li class="active"><a data-toggle="tab" href="#bread">빵</a></li>
			<!-- herf 속성이 div 속성과 연계가 된다. -->
			<li><a data-toggle="tab" href="#beverage">음료수</a></li>
			<li><a data-toggle="tab" href="#chicken">치킨</a></li>
		</ul>
		<div class="tab-content">
		 <!-- div 태그가 bread. #은 href의 속성이라 위 href="#bread"를 참조함 -->   
			<div id="bread" class="tab-pane fade in active">
				<h3>맛있는 빵이야</h3>
				<table class="table">
					<tr>
						<td><img alt="" src="./../images/soboru01.jpg" width="270"
							height="270"></td>
						<td><img alt="" src="./../images/soboru01.jpg" width="270"
							height="270"></td>
						<td><img alt="" src="./../images/soboru01.jpg" width="270"
							height="270"></td>
					</tr>
					<tr>
						<td><img alt="" src="./../images/soboru01.jpg" width="270"
							height="270"></td>
						<td><img alt="" src="./../images/soboru01.jpg" width="270"
							height="270"></td>
						<td><img alt="" src="./../images/soboru01.jpg" width="270"
							height="270"></td>
					</tr>
				</table>
			</div>
	


			<div id="beverage" class="tab-pane fade">
				<h3>맛있는 음료수</h3>
				<table class="table">
					<tr>
						<td><img alt="" src="./../images/sevenup01.png" width="270"
							height="270"></td>
						<td><img alt="" src="./../images/sevenup01.png" width="270"
							height="270"></td>
						<td><img alt="" src="./../images/sevenup01.png" width="270"
							height="270"></td>
					</tr>
					<tr>
						<td><img alt="" src="./../images/sevenup01.png" width="270"
							height="270"></td>
						<td><img alt="" src="./../images/sevenup01.png" width="270"
							height="270"></td>
						<td><img alt="" src="./../images/sevenup01.png" width="270"
							height="270"></td>
					</tr>
				</table>
			</div>


		<div id="chicken" class="tab-pane fade">
			<h3>치킨</h3>
			<table class="table">
				<tr>
					<td><img alt="" src="./../images/chicken01.png" width="270"
						height="270"></td>
					<td><img alt="" src="./../images/chicken01.png" width="270"
						height="270"></td>
					<td><img alt="" src="./../images/chicken01.png" width="270"
						height="270"></td>
				</tr>
				<tr>
					<td><img alt="" src="./../images/chicken01.png" width="270"
						height="270"></td>
					<td><img alt="" src="./../images/chicken01.png" width="270"
						height="270"></td>
					<td><img alt="" src="./../images/chicken01.png" width="270"
						height="270"></td>
				</tr>
			</table>
		</div>
	</div>
	</div>
</body>
</html>
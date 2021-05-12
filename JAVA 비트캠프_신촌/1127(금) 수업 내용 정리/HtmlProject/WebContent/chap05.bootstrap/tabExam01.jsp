<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="./../common/common.jsp"%>
<html>
<head>
</head>
<body>
	<div class="container">
		<h2>먹거리 상품</h2>
		<ul class="nav nav-tabs">
			<li class="active"><a data-toggle="tab" href="#bread">빵</a></li>
			<li><a data-toggle="tab" href="#beverage">음료수</a></li>
			<li><a data-toggle="tab" href="#chicken">치킨</a></li>
		</ul>

		<div class="tab-content">
			<div id="bread" class="tab-pane fade in active">
				<h3>맛있는 빵이야</h3>
				<table class="table" >
					<tr>
						<td align="center"><img width="270"  height="270" alt="" src="./../images/soboru01.jpg"></td>
						<td align="center"><img width="270"  height="270" alt="" src="./../images/soboru01.jpg"></td>
						<td align="center"><img width="270"  height="270" alt="" src="./../images/soboru01.jpg"></td>
					</tr>						
					<tr>
						<td align="center"><img width="270"  height="270" alt="" src="./../images/soboru01.jpg"></td>
						<td align="center"><img width="270"  height="270" alt="" src="./../images/soboru01.jpg"></td>
						<td align="center"><img width="270"  height="270" alt="" src="./../images/soboru01.jpg"></td>
					</tr>						
				</table>
			</div>
			<div id="beverage" class="tab-pane fade">
				<h3>시원한 음료수</h3>
				<table class="table" >
					<tr>
						<td align="center"><img width="270"  height="270" alt="" src="./../images/sevenup01.png"></td>
						<td align="center"><img width="270"  height="270" alt="" src="./../images/sevenup02.png"></td>
						<td align="center"><img width="270"  height="270" alt="" src="./../images/sevenup01.png"></td>
					</tr>						
					<tr>
						<td align="center"><img width="270"  height="270" alt="" src="./../images/cola01.png"></td>
						<td align="center"><img width="270"  height="270" alt="" src="./../images/cola02.png"></td>
						<td align="center"><img width="270"  height="270" alt="" src="./../images/cola02.png"></td>
					</tr>						
				</table>
			</div>
			<div id="chicken" class="tab-pane fade">
				<h3>마쒼는 치킨</h3>
				<table class="table" >
					<tr>
						<td align="center"><img width="270"  height="270" alt="" src="./../images/chicken01.png"></td>
						<td align="center"><img width="270"  height="270" alt="" src="./../images/chicken02.png"></td>
						<td align="center"><img width="270"  height="270" alt="" src="./../images/chicken03.png"></td>
					</tr>		
					<tr>
						<td align="center"><img width="270"  height="270" alt="" src="./../images/chicken01.png"></td>
						<td align="center"><img width="270"  height="270" alt="" src="./../images/chicken02.png"></td>
						<td align="center"><img width="270"  height="270" alt="" src="./../images/chicken03.png"></td>
					</tr>						
				</table>
			</div>
		</div>
	</div>
</body>
</html>
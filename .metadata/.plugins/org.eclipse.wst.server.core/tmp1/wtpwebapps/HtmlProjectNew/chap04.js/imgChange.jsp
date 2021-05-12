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
		var arrImage = ['book1_01.gif','book1_02.gif','book1_03.gif','book1_04.gif'];
		var cnt = 0;
		
		window.onload = function(){/* 문서를 모두 읽었을 때 , 동작(function)해라. */
			var image = setInterval(function() {//하나의 동작을 var image 에 담음 
				var area = document.getElementById('myimg');//css 가 아니여서 #은 붙이면 안됨.
				//area.innerHTML = '호호' + cnt++;
				
				if(cnt == 4){cnt = 0;}
				
				area.innerHTML = "<img src='./../images/" + arrImage[cnt++] + "'></img>";
			}, 1000);
			
			setTimeout(function() {
				clearInterval(image); // 1초마다 사진 띄우는거 멈추기 
				var area = document.getElementById('myimg'); //HTML 형식으로 중지한다는 문구를 기록 해야함
				area.innerHTML = '중지합니다';
			} , 6000);
		};
	</script>
</head>
<body>
	<div id="myimg">
	
	</div>
</body>
</html>
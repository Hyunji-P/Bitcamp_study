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
		var myoptions = 'statusbar=yes,width=500 , height=500';
		//window.open('popup01.jsp' , 'sometitle' , myoptions);
		
		function showPopup(url){//매개변수 이름만 적어주면 됨 , 이벤트 핸들러 
			//alert('하하하 : ' + url);
			window.open(url, 'abcd');
		}
		
		function openWindow() {
			mywin = window.open('popup04.jsp','imsi');//팝업창을 mywin에 대입 
		}
		
		function makeData() {
			mywin.document.open();/* 문서 편집 시작 */
			mywin.document.write('<h3>여기에 기록 할게요.</h3>');
			mywin.document.write('<img src="./../images/bag.png">');
			mywin.document.close();/* 문서 편집 종료 */
		}
		
		function Clear() {
			mywin.document.open();
			mywin.document.clear();
			mywin.document.close();
		} 
		
		function closeWindow() {
			mywin.close(); /* 창 닫기 */
		}
		
		function showCenter(url) {
			var width = 450;
			var height = 450;
			
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
	<!-- 인라인 이벤트 모델(코드 지정 방식) -->
	<input type="button" value="메롱" onclick="alert('메롱');">
	<br><br>
	<!-- 페이지 이름을 sometitle 로 지정했으므로 기존에 있던 창이 바뀐다. -->
	<input type="button" value="이벤트01" onclick="javascript:window.open('popup02.jsp' , 'sometitle');">
	<br><br>
	
	<!-- 인라인 이벤트 모델(별도의 함수 호출) -->
	<input type="button" value="이벤트02" onclick="showPopup('popup03.jsp');"><!-- 자바 스크립트 : 함수 , 자바 : 메소드 -->
	<br><br>
	
	<input type="button" value="open popup04" onclick="openWindow();">
	<br><br>
	
	<input type="button" value="내용 기록" onclick="makeData();">
	<br><br>
	
	<input type="button" value="내용 비우기" onclick="Clear();">
	<br><br>
	
	<input type="button" value="창 닫기 " onclick="closeWindow();">
	<br><br>
	
	<input type="button" value="화면 중앙에 띄우기" onclick="showCenter('popup03.jsp');">
	<br><br>
</body>
</html>
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
		function meclose() {
			var su1 = Number(document.forms[0].su1.value);
			var su2 = Number(document.subform.su2.value);
			var operator = Number(document.subform.operator.value);
			
			var result = 0;
			switch (operator) {
			case 1:
				result = su1 + su2;
				break;
			case 2:
				result = su1 - su2;
				break;
			case 3:
				result = su1 * su2;
				break;
			case 4:
				result = su1 / su2;
				break;
			}
			/* alert(result); */
			//opener : 나를 오픈 시킨 창에 대한 참조 정보를 담고 있는 속성
			opener.superform.result.value = result ;
			self.close();// 자바 스크립트에서 자기자신 지칭 키워드 : self
		}
	</script>
</head>
<body>
	<form action="" name="subform">
		<input type="text" name="su1" size="5" value="14">
		<select name="operator">
			<option value="1">더하기</option>
			<option value="2">빼기</option>
			<option value="3">곱하기</option>
			<option value="4">나누기</option>
		</select>
		<input type="text" name="su2" size="5" value="5">
		<input type="button" value="닫기" onclick="meclose();">
	</form>
</body>
</html>
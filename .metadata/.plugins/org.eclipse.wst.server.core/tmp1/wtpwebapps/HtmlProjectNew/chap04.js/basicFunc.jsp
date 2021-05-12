<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var a = 10;
	var b = 20;
	var c = a + b;
	/* alert(a + "/" + b + "/" + c); */

	var msg = '';
	var result = confirm('로그아웃 할거니?');/* 문자열을 적을 때 따옴표 ' ' , " " */
	if (result == true) {
		msg = '응';
	} else {
		msg = '아니';
	}
	/* alert(msg);  */
	var result = prompt("오늘 점심 뭐 먹지?", "설렁탕");
	/* alert("오늘은 " + result + "을(를) 먹자"); */

	var table = '';
	table += "<table border='1'>";/* 바깥에 쌍따옴표 , 안쪽에 외따옴표 */

	table += "<tr>";
	table += "<td>" + '결과' + "</td>";
	table += "<td>" + c + "</td>";
	table += "</tr>";

	table += "<tr>";
	table += "<td>" + '로그 아웃 여부' + "</td>";
	table += "<td>" + msg + "</td>";
	table += "</tr>";

	table += "<tr>";
	table += "<td>" + '점심 메뉴' + "</td>";
	table += "<td>" + result + "</td>";
	table += "</tr>";

	table += "</table>";

	document.write(table);
</script>
</head>
<body>

</body>
</html>
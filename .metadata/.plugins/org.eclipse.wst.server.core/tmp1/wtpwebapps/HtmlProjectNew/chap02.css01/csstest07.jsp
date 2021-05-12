<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		#box1 h2{
			font-family: 굴림,"Times New Roman" ,sans-serif;
			font-size: 2em;
			font-weight: normal;
			color: blue;
		}
		#box2 p{
			font-family:sans-serif;
			font-size: 20px;
			font-weight: bolder;
			color: red;
		}
		#box3 h2{/* 속성 표기법 */
			font:3em Arial;
		}
		#box3 p{/* 속성 표기법 */
			font:small-caps italic 30px '궁서체';
		}
	
	</style>
</head>
<body>
	<div id="box1">
		<h2>font-family, font-size, font-weight</h2>
		<p>Well done is better than well said.</p>
		<h2>메롱</h2>
	</div>
	<div id="box2">
		<p>하하하</p>
		<h2>font-style, font-variant, color</h2>
		<p>Seeing much, suffering much, and studying much, are the three pillars of learning. </p>
	</div>
	<div id="box3">
		<p>크크크</p>
		<h2>font</h2>
		<p>Education is a progressive discovery of our own ignorance. </p>
	</div>
</body>
</html>
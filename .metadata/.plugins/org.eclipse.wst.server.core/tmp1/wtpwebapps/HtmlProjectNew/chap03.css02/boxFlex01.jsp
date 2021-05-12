<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>box-flex 속성으로 비율로 크기 조정하기</title>
		<meta charset="UTF-8">
		<style type="text/css">
			body, h1, h2, h3, h4, h5, h6, ul, li, dl, dt, dd {
				margin:0px;
				padding:0px;
			}
			h1 { /* 상단의 제목 */
				/* 상단의 좌우측만 둥글게 라운딩 */
				border-top-left-radius:20px;
				border-top-right-radius:20px;
				background-color:silver;
				width:300px;
				font:1.5em arial;
				padding:15px;
				margin:20px auto 0px auto;
				text-align:center;
			}
			ul {
				list-style:none;
				width:900px;
				margin:0px auto;			
				display:-moz-box;	 /* Firefox */	
				display:-webkit-box; /* Safari and Chrome */
				display:box;
			}	
			li {
				font:0.85em arial;
				padding:10px;
				color:#000000;
				text-align:center;
			}
			li.red {
				-moz-box-flex:1.0; /* Firefox */
				-webkit-box-flex:1.0; /* Safari and Chrome */
				box-flex:1.0;
				background-color:red;
				border-top-left-radius: 30px;
				border-bottom-left-radius: 30px;
				text-align:right;
			}
			li.indigo {
				-moz-box-flex:2.0; /* Firefox */
				-webkit-box-flex:2.0; /* Safari and Chrome */
				box-flex:2.0;
				background-color:indigo;
			}
			li.goldenrod {
				-moz-box-flex:3.0; /* Firefox */
				-webkit-box-flex:3.0; /* Safari and Chrome */
				box-flex:3.0;
				background-color:goldenrod;
			}
			li.olive {
				-moz-box-flex:4.0; /* Firefox */
				-webkit-box-flex:4.0; /* Safari and Chrome */
				box-flex:4.0;
				background-color:olive;
				border-top-right-radius:30px;
				border-bottom-right-radius:30px;
				text-align:left;
			}			
		</style>
	</head>

	<body>
		<h1>Graphic</h1>
		<ul>
			<li class="red">Photoshop</li> 
			<li class="indigo">3D Max</li>   
			<li class="goldenrod ">Rhino</li> 
			<li class="olive ">Web Editor</li> 
		</ul>
	</body>
</html>
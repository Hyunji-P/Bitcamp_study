<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		#hearder{
			font-size: 18pt;
			font-weight: bold;
			padding: 10px 0px 0px 0px;
		}
		.error{
			font-weight: bold;
			color: red;
		}
	</style>
	<script type="text/javascript">
		function checkForm() {
			var id = document.someform.id.value;
			var regex = /^[a-zA-Z]\w{2-7}$/;
			
			if (id.search(regex) == -1) {
				var idchk = document.getElementById('idchk');
				idchk.innerHTML = '첫 글자는 반드시 영문자로 입력(아이디는 3글자~8글자 사이입니다.)';
			}
			
			
			return true;
		}
	
	</script>
</head>
<body>
	<form action="registerOk.jsp" name="someform">
		<table border="1">
			<tr>
				<td colspan="2" align="center" id="header">
					회원 가입
				</td>
			</tr>
			<tr>
				<td width="20%">* 아이디</td>
				<td>
					<input id="id" type="text" name="id" ><!--id : 식별자 용도 , name : 파라미터 용도  -->
					<span id="idchk" class="error"></span>	
				</td>
			</tr>
			<tr>
				<td width="20%">* 이름</td>
				<td>
					<input type="text" name="name" id="name">
					<span id="namechk" class="error"></span>	
				</td>
			</tr>
			<tr>
				<td width="20%">* 패스워드</td>
				<td>
					<input type="password" name="password" id="password">
					<span id="passwordchk" class="error"></span>	
				</td>
			</tr>
			<tr>
				<td width="20%">* 패스워드 확인</td>
				<td>
					<input type="password" name="repassword" id="repassword">
					<span id="repasswordchk" class="error"></span>	
				</td>
			</tr>
			<tr>
				<td width="20%">주민 등록 번호</td>
				<td>
					<input type="text" name="jumin1" id="jumin1">
					-
					<input type="text" name="jumin2" id="jumin2">
					<span id="juminchk" class="error"></span>	
				</td>
			</tr>
			<tr>
				<td width="20%">성별</td>
				<td>
					<input type="radio" name="gender" id="gender1" value="남">남
					&nbsp;&nbsp;
					<input type="radio" name="gender" id="gender2" value="여">여
					<span id="genderchk" class="error"></span>	
				</td>
			</tr>
			<tr>
				<td width="20%">직업</td>
				<td>
					<select id="job" name="job">
						<option value="-" selected="selected">
							---직업을 선택해 주세요.---
						</option>
					</select>
					<span id="jobchk" class="error"></span>	
				</td>
			</tr>
			<tr>
				<td width="20%">취미</td>
				<td>
					<input type="checkbox" name="hobby" id="hobby1" value="당구" checked="checked">당구
					<input type="checkbox" name="hobby" id="hobby2" value="축구">축구
					<input type="checkbox" name="hobby" id="hobby3" value="야구">야구
					<span id="hobbychk" class="error"></span>	
				</td>
			</tr>
			<tr>
				<td width="20%">이메일</td>
				<td>
					<input type="text" name="email" id="email">
					@
					<select id="emailselect" name="emailselect">
						<option value="naver" selected="selected">네이버</option>
						<option value="daum">다음</option>
						<option value="google">구글</option>
						<option value="nate">네이트</option>					
					</select>
					<span id="emailchk" class="error"></span>	
				</td>
			</tr>
			<tr>
				<td width="20%">전화 번호</td>
				<td>
					<select id="phoneselect" name="phoneselect">
						<option value="02">02</option>
						<option value="031">031</option>
						<option value="032">022</option>
					</select>
					-
					<input type="text" name="phone1" id="phone1">
					-
					<input type="text" name="phone2" id="phone2">
					<span id="phonechk" class="error"></span>	
				</td>
			</tr>
			<tr>
				<td width="20%">휴대폰 번호</td>
				<td>
					<select id="hphoneselect" name="hphoneselect">
						<option value="010">010</option>
						<option value="011">011</option>
						<option value="016">016</option>
					</select>
					-
					<input type="text" name="hphone1" id="hphone1">
					-
					<input type="text" name="hphone2" id="hphone2">
					<span id="hphonechk" class="error"></span>	
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="전송" onclick="return checkForm();"><!-- 함수에도 return 값을 다 적어줘야함  -->
					&nbsp;&nbsp;&nbsp;
					<input type="reset" value="초기화">
				</td>
			</tr>
		</table>
	</form>	
	
	
</body>
</html>
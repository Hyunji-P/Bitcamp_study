<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#header{
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
		function checkForm(){
			var id = document.someform.id.value;
			var regex = /^[a-zA-Z]\w{2,7}$/; /*a~z중 한글자로 시작하며 영어, 숫자, 언더바 등이 2~7자리 나오는 문자열  */
			if (id.search(regex)==-1){	
				var idchk = document.getElementById('idchk');
				idchk.innerHTML = '첫글자는 반드시 영문자로 입력(3<=아이디<=8)하셔야 합니다.';
				return false; /*이벤트 전파 방지 */
			}	
			
			var name = document.someform.name.value;
			if (name.length<1|| name.length>10) {
				var namechk = document.getElementById('namechk');
				namechk.innerHTML = '이름은 1글자 이상 10글자이하로 입력하세요';
				return false;
			}
			
			var password = document.someform.password.value;
			if(password.length<5||password.length>10){
				var passwordchk = document.getElementById('passwordchk');
				passwordchk.innerHTML = '비밀번호는 5글자 이상 10글자 이하이어야 합니다.';
				return false;
			}
			
			var repassword = document.someform.repassword.value;
			if (repassword!=password) {
				var repasswordchk = document.getElementById('repasswordchk');
				repasswordchk.innerHTML = '비밀번호가 일치하지 않습니다.';
				return false;
			}
			
			var jumin1 = document.someform.jumin1.value;
			var regex = /^\d{6}$/; 
			if (jumin1.search(regex)==-1){	
				var juminchk = document.getElementById('juminchk');
				juminchk.innerHTML = '주민번호 앞자리는 6자리 숫자형식입니다.';
				return false; 
			}
			
			var jumin2 = document.someform.jumin2.value;
			var regex = /^\d{7}$/; 
			if (jumin2.search(regex)==-1){	
				var juminchk = document.getElementById('juminchk');
				juminchk.innerHTML = '주민번호 뒷자리는 7자리 숫자형식입니다.';
				return false; 
			}
			
			var optradio = document.getElementsByName('gender');
			//alert(optradio.length);
			var ischk= false; // 성별 체크 여부
			
			for (var i = 0; i < optradio.length; i++) {
				if(ischk==false){
					if(optradio[i].checked){
						ischk= true;
						break;
					}
				}
			}
			
			if(ischk == false){
				var genderchk = document.getElementById('genderchk');
				genderchk.innerHTML='성별을 체크해 주세요.';
				return false;
			}
			
			var job = document.someform.job.value;
			if(job == '-'){/*직업을 선택하지 않음  */
				var jobchk = document.getElementById('jobchk');
				jobchk.innerHTML = '직업을 선택하세요.';
				return false;
			}
			
			var cnt = 0;
			var optcheck = document.getElementsByName('hobby');
			//alert(optcheck.length);
			for (var i = 0; i < optcheck.length; i++) {
				if(optcheck[i].checked == true){
					cnt++;					
				}
			}
			if(cnt==0){
				var hobbychk = document.getElementById('hobbychk');
				hobbychk.innerHTML = '취미는 1개 이상 선택하세요.';
				return false;
			}
			
			var email = document.someform.email.value;
			if(email.length<4||email.length>8){
				var emailchk = document.getElementById('emailchk');
				emailchk.innerHTML = '이메일은 4 글자 이상, 8 글자 이하입니다.';
				return false;
			}
			
			var phone1 = document.someform.phone1.value;
			var phone2 = document.someform.phone2.value;
			
			var regex_phone1 = /^\d{3,4}$/;
			var regex_phone2 = /^\d{4}$/;
			if (phone1.search(regex_phone1)==-1) {
				var phonechk = document.getElementById('phonechk');
				phonechk.innerHTML = '중간번호는 3~4 자리 숫자입니다.';
				return false;
			}
			if (phone2.search(regex_phone2)==-1) {
				var phonechk = document.getElementById('phonechk');
				phonechk.innerHTML = '뒷번호는 4 자리 숫자입니다.';
				return false;
			}
			
			var hphone1 = document.someform.hphone1.value;
			var hphone2 = document.someform.hphone2.value;
			
			var regex_hphone1 = /^\d{3,4}$/;
			var regex_hphone2 = /^\d{4}$/;
			if (hphone1.search(regex_hphone1)==-1) {
				var hphonechk = document.getElementById('hphonechk');
				hphonechk.innerHTML = '중간번호는 3~4 자리 숫자입니다.';
				return false;
			}
			if (hphone2.search(regex_hphone2)==-1) {
				var hphonechk = document.getElementById('hphonechk');
				hphonechk.innerHTML = '뒷번호는 4 자리 숫자입니다.';
				return false;
			}
			
			return true;
		}
		function fillSelect(){
			var arrjob = [];
			arrjob.push('학생');
			arrjob.push('교수');
			arrjob.push('연예인');
			arrjob.push('공무원');
			arrjob.push('기타');
			
			var job = document.getElementById('job');
			//alert(job.options.length);
			for (var i = 0; i < arrjob.length; i++) {
				job.options[job.options.length] = new Option(arrjob[i], arrjob[i]+i);
			}
			job.options[1].selected = true; //1번째요소를 기본사항으로 선택하기
		}
		
	</script>
</head>
<body onload="javascript:fillSelect();">
	<form action="registerOk.jsp" name="someform">
		<table border="1">
			<tr>
				<td colspan="2" align="center" id="header">회원 가입</td>
			</tr>
			<tr>
				<td width="20%">* 아이디</td>
				<td>
					<input id="id" name="id" type="text" value="kim9">
					<span id="idchk" class="error"></span>
				</td>
			</tr>
			<tr>
				<td width="20%">* 이름</td>
				<td>
					<input id="name" name="name" type="text" value="김구">
					<span id="namechk" class="error"></span>
				</td>
			</tr>
			<tr>
				<td width="20%">* 비밀번호</td>
				<td>
					<input id="password" name="password" type="password" value="qwert">
					<span id="passwordchk" class="error"></span>
				</td>
			</tr>
			<tr>
				<td width="20%">* 비밀번호 확인</td>
				<td>
					<input id="repassword" name="repassword" type="password" value="qwert">
					<span id="repasswordchk" class="error"></span>
				</td>
			</tr>
			<tr>
				<td width="20%">주민 등록 번호</td>
				<td>
					<input id="jumin1" name="jumin1" type="text" value="001122">
					-
					<input id="jumin2" name="jumin2" type="text" value="1234567">
					<span id="juminchk" class="error"></span>
				</td>
			</tr>
			<tr>
				<td width="20%">성별</td>
				<td>
					<input id="gender1" name="gender" type="radio" value="남" checked="checked">남
					<input id="gender2" name="gender" type="radio" value="여">여
					<span id="genderchk" class="error"></span>
				</td>
			</tr>
			<tr>
				<td width="20%">직업</td>
				<td>
					<select id="job" name="job">
						<option value="-" selected="selected">---직업을 선택해 주세요.---</option>
					</select>
					<span id="jobchk" class="error"></span>
				</td>
			</tr>
			<tr>
				<td width="20%">취미</td>
				<td>
					<input id="hobby1" name="hobby" type="checkbox" value="당구" checked="checked">당구
					<input id="hobby2" name="hobby" type="checkbox" value="축구">축구
					<input id="hobby3" name="hobby" type="checkbox" value="야구">야구
					<span id="hobbychk" class="error"></span>
				</td>
			</tr>
			<tr>
				<td width="20%">이메일</td>
				<td>
					<input id="email" name="email" type="text">
					@
					<select name="emailselect" id="emailselect">
						<option value="naver" selected="selected">네이버
						<option value="daum">다음
						<option value="google">구글
						<option value="nate">네이트
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
						<option value="032">032</option>
					</select>
					<input id="phone1" name="phone1" type="text">
					-
					<input id="phone2" name="phone2" type="text">
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
					<input id="hphone1" name="hphone1" type="text">
					-
					<input id="hphone2" name="hphone2" type="text">
					<span id="hphonechk" class="error"></span>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="전송" onclick="return checkForm();">
						&nbsp;&nbsp;&nbsp;
					<input type="reset" value="초기화">
				</td>
			</tr>
		</table>
	
	</form>
</body>
</html>
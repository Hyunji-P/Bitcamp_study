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
			var regex = /^[a-zA-Z]\w{2,7}$/; 
			
			if(id.search(regex) == -1){//부정의 의미
				var idchk = document.getElementById('idchk');
				idchk.innerHTML = '첫 글자는 반드시 영문자로 입력(3<=아이디<=8)하서야 합니다.';
				return false;//false 가 아니면 form 태그의 action 파라미터 값으로 넘어간다. (이벤트 전파 방지) 
			}	
			
			var name = document.someform.name.value ;
			if(name.length < 1 || name.length > 10){//소괄호 안침 
				var namechk = document.getElementById('namechk');
				namechk.innerHTML = '이름은 1글자 이상 10글자 이하이어야 합니다.';
				return false;		
			}
			
			/* 비밀 번호는 5글자 이상 10글자이하이어야 합니다. */
			var password = document.someform.password.value ;
			if(password.length < 5 || password.length > 10){
				var passwordchk = document.getElementById('passwordchk');
				passwordchk.innerHTML = '비밀 번호는 5글자 이상 10글자이하이어야 합니다.';
				return false;
			}
			
			/* 비밀 번호가 일치하지 않습니다. */
			var repassword = document.someform.repassword.value ;
			if(repassword != password){
				var repasswordchk = document.getElementById('repasswordchk');
				repasswordchk.innerHTML = '비밀 번호가 일치하지 않습니다.';
				return false;
			}
			
			var jumin1 = document.someform.jumin1.value;
			var regex = /^\d{6}$/; 
			
			if(jumin1.search(regex) == -1){//부정의 의미
				var juminchk = document.getElementById('juminchk');
				juminchk.innerHTML = '주민번호 앞자리는 6자리 숫자 형식 입니다.';
				return false; 
			}	
			
			var jumin2 = document.someform.jumin2.value;
			var regex = /^\d{7}$/; 
			
			if(jumin2.search(regex) == -1){//부정의 의미
				var juminchk = document.getElementById('juminchk');
				juminchk.innerHTML = '주민번호 뒷자리는 7자리 숫자 형식 입니다.';
				return false; 
			}	
			
			var optradio = document.getElementsByName('gender');
			//gender는 name 파라미터 값은 1개이나 id 파라미터는 두개 , 값을 가져오려면  getElementsByName()를 사용해서  optradio 변수로 넣어야하며 optradio는 배열로 봐야함 
			/* alert(optradio.length); */
			var ischk = false; // 성별 체크 여부
			
			for(var i = 0; i < optradio.length ; i++){
				if(ischk == false){
					if(optradio[i].checked == true){
						ischk = true;
						break; 
					}
				}
				
			}
			
			if(ischk == false){
				var genderchk = document.getElementById('genderchk');
				genderchk.innerHTML = '성별 좀 체크 하시지 말입니다.';
				return false;
			}
			
			var job = document.someform.job.value ;
			
			if(job == '-'){/* 직업을 선택하지 않음 */
				var jobchk = document.getElementById('jobchk');
				jobchk.innerHTML = "직업을 선택하세요.";
				return false;
			}
			
			var cnt = 0;
			var optcheck = document.getElementsByName('hobby');
			//alert(optcheck.length);
			for(var i = 0; i < optcheck.length ; i++){
				if(optcheck[i].checked == true){
					cnt++;
				}
			}
			
			if(cnt == 0) {
				var hobbychk = document.getElementById('hobbychk');
				hobbychk.innerHTML = '취미는 1개 이상 선택되어야 합니다.';
				return false;
			}
			
			var email = document.someform.email.value; 
			if(email.length < 4 || email.length > 8){
				var emailchk = document.getElementById('emailchk');
				emailchk.innerHTML = '이메일은 4글자 이상 8글자 이하이어야 합니다.';
				return false; 
			}
			
			var phone1 = document.someform.phone1.value; 
			var phone2 = document.someform.phone2.value; 
			
			var regex_phone1 = /^\d{3,4}$/;
			var regex_phone2 = /^\d{4}$/;
			
			if(phone1.search(regex_phone1) == -1){
				var phonechk = document.getElementById('phonechk');
				phonechk.innerHTML = '중간 번호는 3~4자리의 숫자 형식';
				return false;
			}
			
			if(phone2.search(regex_phone2) == -1){
				var phonechk = document.getElementById('phonechk');
				phonechk.innerHTML = '뒷 번호는 4자리의 숫자 형식';
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
			
			return true; //return 값을 안적으면 기본값은 true (이벤트 전파)
		}
		
		function fillSelect() {
			//alert('메롱');
			var arrjob = [];
			arrjob.push('학생');
			arrjob.push('교수');
			arrjob.push('연예인');
			arrjob.push('공무원');
			arrjob.push('기타');
			
			var job = document.getElementById('job');
			//alert(job.options.length); -> 직업을 선택해주세요 . 값 1개 , 자바스크립트는 배열로 취급하려는 경향이 있어 options 복수로 처리 
			for(var i = 0; i < arrjob.length ; i++){
				job.options[job.options.length] = new Option(arrjob[i] , arrjob[i] + i);// 사용자에게 보여주는 부분 , value 속성
			}
			
			job.options[1].selected = true; // 1번째 요소 선택하기 
		}
	
	</script>
</head>
<body onload="javascript:fillSelect();">
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
					<input id="id" type="text" name="id" value="kim9"><!--id : 식별자 용도 , name : 파라미터 용도  -->
					<span id="idchk" class="error"></span>	
				</td>
			</tr>
			<tr>
				<td width="20%">* 이름</td>
				<td>
					<input type="text" name="name" id="name" value="김구">
					<span id="namechk" class="error"></span>	
				</td>
			</tr>
			<tr>
				<td width="20%">* 패스워드</td>
				<td>
					<input type="password" name="password" id="password" value="qwert">
					<span id="passwordchk" class="error"></span>	
				</td>
			</tr>
			<tr>
				<td width="20%">* 패스워드 확인</td>
				<td>
					<input type="password" name="repassword" id="repassword" value="qwert">
					<span id="repasswordchk" class="error"></span>	
				</td>
			</tr>
			<tr>
				<td width="20%">주민 등록 번호</td>
				<td>
					<input type="text" name="jumin1" id="jumin1" value="001225">
					-
					<input type="text" name="jumin2" id="jumin2" value="1234567">
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
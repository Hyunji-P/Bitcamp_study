package model;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Member {
	//상수 값들은 반드시 final 키워드를 사용해야 한다.
	private final String MUST_INPUT = "필수 입력 사항입니다." ;
	private final int MININUM_MILEAGE_POINT = 10 ;
	private final int MAXINUM_MILEAGE_POINT = 50 ;
	
	// getter, setter, 생성자, toString(), 
	// valid 체크를 위한 어노테이션도 작성하도록 합니다.
	
	//회원 정보를 담고 있는 빈 객체
	@Length(min=3, max=10, message="아이디는 최소 3자리 최대 10자리 입니다.")
	private String id;
	
	//데이터가 비어 있는 지를 체크하는 경우 @NotEmpty를 사용해야 한다.
	//@NotNull을 사용하는 것이 아니라 .....
	@NotEmpty(message= "아이디는 " + MUST_INPUT )
	private String name;
	
	private String password; //비밀번호
	
	//숫자 형식은 보통 @Min과 @Max을 사용하면 된다. 
	@Min(value=MININUM_MILEAGE_POINT, message="마일리지 포인트는 최소 " + MININUM_MILEAGE_POINT + "이상이어야 합니다")
	@Max(value=MAXINUM_MILEAGE_POINT, message="마일리지 포인트는 최대 " + MAXINUM_MILEAGE_POINT + "이하이어야 합니다")
	private int mpoint ; ; //마일리지 포인트
	
	@Email(message="올바른 이메일 형식이 아닙니다.")
	@NotEmpty(message= "올바른 이메일 형식이 아닙니다." )
	private String email;
		
	//@Pattern(regexp="yyyy/MM/dd", message="yyyy/MM/dd 형식으로 입력해주세요.")
	private String regdate; //가입 일자	
	private String address1;	
	private String address2;
	
	@NotEmpty(message= "좋아하는 스포츠 팀을 선택하세요")
	private String sportsTeam ;	
	
	//체크 박스에서 @NotNull은 하나도 선택을 하지 않았을 경우에 유효성을 검사한다.
	@NotNull(message="운영체제는 최소 1개 이상 선택하셔야 합니다.")
	//체크 박스에서 @Size은 선택된 체크 박스의 갯수를 의미한다.
	@Size(min=2, message="운영체제는 최소 2개 이상 선택하셔야 합니다.")
	private String[] favorites; //선호하는 운영체제
	
	//@Range(min=1) 이라고 함은 콤보 박스를 선택하지 않았을 경우를 의미한다.
	//개발자는 view 페이지에서 첫번째 콤보 박스에 다음과 같은 형식으로 입력해 주어야 한다.
	//  <option value="0">---선택해 주세요 ==> 선택된 값이 0이므로 min=1에 위배 된다.
	@Range(min=1, message="직업을 선택해 주셔야 합니다.")
	private String jobCode; //선호하는 직업 군
	
	//라디오 버튼에서 하나도 선택하지 않았는지 확인하려면 @NotNull을 이용하면 된다. 
	@NotNull(message="개발 툴을 선택해 주세요.")
	private String tool;//주로 사용하는 개발툴
	
	private String etc;//기타 사항
	private boolean agreement;//약관 동의	
	
	//@AssertTrue : true인지 검증하는 어노테이션이다.
	//체크 박스를 선택하지 않는 경우에 오류 메시지를 띄워 준다.
	@AssertTrue(message="약관에 동의하셔야 합니다.")
	public boolean isAgreement() {	return agreement;	}
	
	public String getSportsTeam() {	return sportsTeam;}
	public void setSportsTeam(String sportsTeam) {	this.sportsTeam = sportsTeam;}
	public String getPassword() {	return password;}
	public void setPassword(String password) {	this.password = password;}
	public String getRegdate() {	return regdate;}
	public void setRegdate(String regdate) {	this.regdate = regdate;}
	public String getEmail() {	return email;}
	public void setEmail(String email) {	this.email = email;}
	public int getMpoint() {	return mpoint;}
	public void setMpoint(int mpoint) {	this.mpoint = mpoint;}	
	public void setAgreement(boolean agreement) {	this.agreement = agreement;}
	public String getAddress1() {	return address1;}
	public void setAddress1(String address1) {	this.address1 = address1;}
	public String getAddress2() {	return address2;}
	public void setAddress2(String address2) {	this.address2 = address2;}
	public String getId() {	return id;}
	public void setId(String id) {	this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}	
	public String[] getFavorites() {return favorites;}
	public void setFavorites(String[] favorates) {this.favorites = favorates;}
	public String getJobCode() {return jobCode;}
	public void setJobCode(String jobCode) {this.jobCode = jobCode;}
	public String getTool() {return tool;}
	public void setTool(String tool) {this.tool = tool;}
	public String getEtc() {return etc;}
	public void setEtc(String etc) {this.etc = etc;}
}
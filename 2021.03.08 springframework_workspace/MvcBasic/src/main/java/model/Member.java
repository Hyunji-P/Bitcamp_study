package model;

import java.util.Arrays;

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
	
	private final String MUST_INPUT = "필수 입력 사항입니다.";
	
	@Length(min=3, max=10, message = "아이디는 최소 3자리, 최대 10자리입니다.")
	private String id;
	
	@NotEmpty(message = "이름은(는)" + MUST_INPUT)
	private String name;
	
	
	private String password;
	
	private final int MINIMUM_MILEAGE_POINT = 10;
	private final int MAXIMUM_MILEAGE_POINT = 50;
	
	@Min(value=10, message="마일리지 포인트는 최소" + MINIMUM_MILEAGE_POINT + "이상이어야 합니다.")
	@Max(value=50, message="마일리지 포인트는 최대" + MAXIMUM_MILEAGE_POINT + "이하이어야 합니다.")
	private int mpoint; //적립포인트, 화면에 안 보임
	
	
	private String address1;
	private String address2;
	
	
	@Email(message = "올바른 이메일 형식이 아닙니다.")
	@NotEmpty(message = "이메일은(는)" + MUST_INPUT)
	private String email;
	
	
	private String regdate;

	@NotEmpty(message="좋아하는 야구팀을 선택해 주세요.")
	private String sportsTeam; //좋아하는 야구팀
	
	@NotNull(message = "운영체제는 반드시 1개 이상 선택하셔야 합니다.")
	@Size(min=2, message = "운영체제는 2개 이상 선택하셔야 합니다.")
	private String[] favorites; //선호하는 운영체제

	@Range(min=1, message="직업은 반드시 1개 이상 선택하셔야 합니다.")
	private String jobCode; //직업
	
	@NotNull(message="개발툴을 선택해 주세요.")
	private String tool; //개발 툴
	
	
	private String etc; //기타
	
	@AssertTrue(message="메세지 약관에 동의하셔야 합니다.")
	private boolean agreement;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMpoint() {
		return mpoint;
	}
	public void setMpoint(int mpoint) {
		this.mpoint = mpoint;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getSportsTeam() {
		return sportsTeam;
	}
	public void setSportsTeam(String sportsTeam) {
		this.sportsTeam = sportsTeam;
	}
	public String[] getFavorites() {
		return favorites;
	}
	public void setFavorites(String[] favorites) {
		this.favorites = favorites;
	}
	public String getJobCode() {
		return jobCode;
	}
	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}
	public String getTool() {
		return tool;
	}
	public void setTool(String tool) {
		this.tool = tool;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	
	
	public boolean isAgreement() {
		return agreement;
	}
	public void setAgreement(boolean agreement) {
		this.agreement = agreement;
	}
	@Override
	public String toString() {
		return "member [id=" + id + ", name=" + name + ", password=" + password + ", mpoint=" + mpoint + ", address1="
				+ address1 + ", address2=" + address2 + ", email=" + email + ", regdate=" + regdate + ", sportsTeam="
				+ sportsTeam + ", favorites=" + Arrays.toString(favorites) + ", jobCode=" + jobCode + ", tool=" + tool
				+ ", etc=" + etc + ", agreement=" + agreement + "]";
	}
	public Member(String id, String name, String password, int mpoint, String address1, String address2, String email,
			String regdate, String sportsTeam, String[] favorites, String jobCode, String tool, String etc,
			boolean agreement) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.mpoint = mpoint;
		this.address1 = address1;
		this.address2 = address2;
		this.email = email;
		this.regdate = regdate;
		this.sportsTeam = sportsTeam;
		this.favorites = favorites;
		this.jobCode = jobCode;
		this.tool = tool;
		this.etc = etc;
		this.agreement = agreement;
	}
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	
	
}

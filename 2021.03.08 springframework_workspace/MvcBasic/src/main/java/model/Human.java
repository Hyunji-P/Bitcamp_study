package model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Human {
//	스프링에서는 이 Bean객체(클래스)를 커멘드(command)객체라고 부름
	private final String MUST_INPUT01 = "필수 입력 사항입니다.";
	private final String MUST_INPUT02 = "반드시 선택해 주세요.";

	
	@Length(min=4, max=15, message="아이디는 최소 4자리, 최대 15자리 입니다.")
	@NotEmpty(message="아이디는 " + MUST_INPUT01)
	private String id;
	
	@Length(min=3, max=12, message="이름은 최소 2자리, 최대 12자리 입니다.")
	@NotEmpty(message="이름은 " + MUST_INPUT01)	
	private String name;
	
	@NotNull(message="취미는 " + MUST_INPUT02)
	private String hobby;
	
	@NotNull(message="특기는 " + MUST_INPUT02)
	private String special;
	
	@NotEmpty(message="생일은 " + MUST_INPUT01)	
	@Pattern(regexp="\\d{4}[-/]\\d{2}[-/]\\d{2}", message="생일은 yyyy/MM/dd 또는 yyyy-MM-dd 형식으로 입력해 주세요.")
	private String birth;
	
	//Range의 최소값은 1
	@Range(min=1, message="직업은 " + MUST_INPUT02)
	private String job;
	
	@Pattern(regexp="\\d{4}[-/]\\d{2}[-/]\\d{2}", message="날짜는 yyyy/MM/dd 또는 yyyy-MM-dd 형식으로 입력해 주세요.")
	private String regdate;
	
	
	//getter, setter, 생성자, toString() 메소드 구현
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
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	@Override
	public String toString() {
		return "Human [id=" + id + ", name=" + name + ", hobby=" + hobby + ", special=" + special + ", birth=" + birth
				+ ", job=" + job + ", regdate=" + regdate + "]";
	}
	
	public Human(String id, String name, String hobby, String special, String birth, String job, String regdate) {
		super();
		this.id = id;
		this.name = name;
		this.hobby = hobby;
		this.special = special;
		this.birth = birth;
		this.job = job;
		this.regdate = regdate;
	}

	public Human() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}

package model;

//회원 1사람의 정보를 담고 있는 자바 클래스
public class Human02 {
	private String id ;
	private String name ;
	private String hobby ; //취미(라디오 버튼)
	private String special ; //특기(체크 박스)	
	private String birth ; //생일	
	private String job ; //직업
	private String regdate ;		
	
	// getter, setter을 작성하도록 합니다.
	public String getId() {	return id;}
	public void setId(String id) {	this.id = id;}
	public String getName() {	return name;}
	public void setName(String name) {	this.name = name;}
	public String getHobby() {	return hobby;}
	public void setHobby(String hobby) {	this.hobby = hobby;}	
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getJob() {	return job;}
	public void setJob(String job) {	this.job = job;}
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}	
}
package model;

//취미를 저장하기 위한 클래스
public class Hobby {
	private String english ; //영문 이름
	private String korea ; //영문 이름
	
	
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getkorea() {
		return korea;
	}
	
	public void setkorea(String korea) {
		this.korea = korea;
	}
	@Override
	public String toString() {
		return "Hobby [english=" + english + ", korea=" + korea + "]";
	}
	
	public Hobby(String english, String korea) {
		super();
		this.english = english;
		this.korea = korea;
	}

	
}

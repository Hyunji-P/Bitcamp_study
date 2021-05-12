package model;

// 취미를 저장하기 위한 Bean 클래스
public class Hobby {
	private String english ; //영문 이름
	private String korea ; //한글 이름
	
	// getter, setter, 생성자를 구현합니다.
	
	public Hobby(String english, String korea) {
		this.english = english ;
		this.korea = korea ;
	}


	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getKorea() {
		return korea;
	}
	public void setKorea(String korea) {
		this.korea = korea;
	}
}
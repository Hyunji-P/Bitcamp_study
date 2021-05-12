package model;

// 폼의 콤보 박스에 들어 가기 위한 [코드]와 [이름]을 저장하고 있는 클래스
public class Job {
	private int code; //직군 코드
	private String name; //직업명
	
	public Job(int code, String name) {		
		this.code = code;
		this.name = name;
	}
	
	// getter, setter, 생성자를 구현합니다.

	public int getCode() {	return code;}
	public void setCode(int code) {	this.code = code;}
	public String getName() {	return name;}
	public void setName(String name) {	this.name = name;}
	
	public Job() {	}	
}
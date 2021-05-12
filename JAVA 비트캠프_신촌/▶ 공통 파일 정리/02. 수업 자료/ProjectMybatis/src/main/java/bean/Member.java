package bean;

import java.util.List;
 
public class Member {
	private String id;
	private String name;
	private int age;
	private String gender;	
	
	// boardBeans 객체는 조인 구문을 위하여 사용됩니다.
	// Board 다(∞) 빈 클래스에 대한 멤버 변수입니다.
	private List<Board> boardBeans ;	
	
	// getter, setter 및 생성자, toString() 등을 구현합니다.
	
	public List<Board> getBoardBeans() {
		return boardBeans;
	}
	public void setBoardBeans(List<Board> boardBeans) {
		this.boardBeans = boardBeans;
	}
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}	
	/* 다른 종류의 생성자를 만드는 경우 반드시 매개 변수 없는 생성자도 구비할 것 */
	public Member() { }
	public Member(String id, String name, int age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	} 	
}
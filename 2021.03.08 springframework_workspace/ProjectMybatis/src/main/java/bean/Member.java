package bean;

import java.util.List;

public class Member { // 일(一) bean 클래스
	private String id;
	private String name;
	private int age;
	private String gender;

	// member 테이블과 board 테이블은 조인 관계
	// board 테이블에서 조회된 값을 list 에 담음
	private List<Board> boardBeans;

	// getter , setter , toString , 생성자 구현
	// boardBeans 는 나중에 만들어져 있기 때문에 15번째 줄을 다시 구현한다.

	// 생성자 오버로딩
	public Member() {
	}
	
	public Member(String id, String name, int age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Member(String id, String name, int age, String gender, List<Board> boardBeans) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.boardBeans = boardBeans;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
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

	public List<Board> getBoardBeans() {
		return boardBeans;
	}

	public void setBoardBeans(List<Board> boardBeans) {
		this.boardBeans = boardBeans;
	}

	// toString 메소드는 삭제하고 다시 만든다.
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", boardBeans="
				+ boardBeans + "]";
	}

}

package bean;

import java.util.List;

public class Member { // 일(一) bean 클래스
	private String id;
	private String name;
	private int age;
	private String gender;

	private List<Reservation> rvBean;

	public Member() {
	}

	public Member(String id, String name, int age, String gender, List<Reservation> rvBean) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.rvBean = rvBean;
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

	public List<Reservation> getRvBean() {
		return rvBean;
	}

	public void setRvBean(List<Reservation> rvBean) {
		this.rvBean = rvBean;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", rvBean=" + rvBean
				+ "]";
	}

}

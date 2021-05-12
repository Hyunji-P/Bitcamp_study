package pkg1013;

//서브
public class Sawon extends RefCasting {
	private String name; // 사원 이름
	private String department; // 부서명

	public Sawon(String name, String department) {
		this.name = name;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

}

package pkg1014;

//서브 클래스
public class Staff extends Person {

	private String department;

	public Staff(String name, int age, String address, String number, int type, String department) {
		super(name, age, address, number, type);
		this.department = department;

	}

	@Override
	public String toString() {
		String imsi = "부서명 : " + this.department;
		return super.toString() + imsi;
	}

}

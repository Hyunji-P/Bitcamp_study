//서브 클래스
public class Staff extends Person {
	private String department;

	public Staff() {

	}

	public Staff(String name, int age, String address, String number, int type, String department) {
		super(name, age, address, number, type);
		this.department = department;
	}

	@Override
	public String toString() {
		String imsi = super.toString();
		imsi += "부서 : " + this.department + "\n";
		return imsi;
	}

}

package pkg1014;

//���� Ŭ����
public class Staff extends Person {

	private String department;

	public Staff(String name, int age, String address, String number, int type, String department) {
		super(name, age, address, number, type);
		this.department = department;

	}

	@Override
	public String toString() {
		String imsi = "�μ��� : " + this.department;
		return super.toString() + imsi;
	}

}

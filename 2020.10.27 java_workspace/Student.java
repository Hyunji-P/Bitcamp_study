//����Ŭ����
public class Student extends Person {
	// "��ö��", 30, "���� ������", "01012345678", 3, 2, "A"

	private int schoolyear;
	private String grade;

	public Student() {

	}

	public Student(String name, int age, String address, String number, int type, int schoolyear, String grade) {
		super(name, age, address, number, type);
		this.schoolyear = schoolyear;
		this.grade = grade;

	}

	@Override
	public String toString() {
		String imsi = super.toString();
		imsi += "�г� : " + this.schoolyear+ "\n";
		imsi += "���� : " + this.grade+ "\n";

		return imsi;
	}

}

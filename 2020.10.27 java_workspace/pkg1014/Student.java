package pkg1014;

//���� Ŭ����
public class Student extends Person {
	private int grade; // �г�
	private String hakjum; // ����

	public Student(String name, int age, String address, String number, int type, int grade, String hakjum) {
		super(name, age, address, number, type);
		this.grade = grade;
		this.hakjum = hakjum;

	}

	@Override
	public String toString() {
		String imsi = "�г� : " + this.grade + "\n";
		imsi += "���� : " + this.hakjum + "\n";
		return super.toString() + imsi;
	}

}

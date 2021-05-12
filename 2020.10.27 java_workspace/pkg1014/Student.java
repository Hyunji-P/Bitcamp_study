package pkg1014;

//서브 클래스
public class Student extends Person {
	private int grade; // 학년
	private String hakjum; // 학점

	public Student(String name, int age, String address, String number, int type, int grade, String hakjum) {
		super(name, age, address, number, type);
		this.grade = grade;
		this.hakjum = hakjum;

	}

	@Override
	public String toString() {
		String imsi = "학년 : " + this.grade + "\n";
		imsi += "학점 : " + this.hakjum + "\n";
		return super.toString() + imsi;
	}

}

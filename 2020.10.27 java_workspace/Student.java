//서브클래스
public class Student extends Person {
	// "김철수", 30, "마포 공덕동", "01012345678", 3, 2, "A"

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
		imsi += "학년 : " + this.schoolyear+ "\n";
		imsi += "학점 : " + this.grade+ "\n";

		return imsi;
	}

}

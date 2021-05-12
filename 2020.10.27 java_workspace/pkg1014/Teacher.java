package pkg1014;

//서브 클래스
public class Teacher extends Person {
	private String subject;

	public Teacher(String name, int age, String address, String number, int type, String subject) {
		super(name, age, address, number, type);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	@Override
	public String toString() {
		String imsi = "과목 : " + this.subject;
		return super.toString() + imsi;
	}

}

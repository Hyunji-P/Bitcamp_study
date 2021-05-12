//서브클래스
public class Teacher extends Person {

	private String subject;

	public Teacher() {

	}

	public Teacher(String name, int age, String address, String number, int type, String subject) {
		super(name, age, address, number, type);
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		String imsi = super.toString();
		imsi += "과목 : " + this.subject+ "\n";
		return imsi;
	}

}

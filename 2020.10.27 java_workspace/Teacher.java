//����Ŭ����
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
		imsi += "���� : " + this.subject+ "\n";
		return imsi;
	}

}

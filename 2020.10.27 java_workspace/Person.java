//수퍼클래스
public class Person {
	private String name;
	private int age;
	private String address;
	private String number;
	private int type;

	public Person() {

	}

	public Person(String name, int age, String address, String number, int type) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.number = number;
		this.type = type;

	}

	@Override
	public String toString() {
		String imsi = "";
		imsi += "이름 : " + this.name + "\n";
		imsi += "나이 : " + this.age + "\n";
		imsi += "주소 : " + this.address + "\n";
		imsi += "번호 : " + this.number + "\n";

		String mytype = "";
		if (type == 1) {
			mytype = "직원";
		} else if (type == 2) {
			mytype = "선생님";
		} else {
			mytype = "학생";
		}

		imsi += "타입 : " + mytype + "\n";
		return imsi;
	}

}

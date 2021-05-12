package pkg1014;

//수퍼 클래스
public class Person {
	private String name;// 이름
	private int age;// 나이
	private String address;// 주소
	private String number;// 전화번호
	private int type; // 타입

	public Person(String name, int age, String address, String number, int type) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.number = number;
		this.type = type;

	}

	@Override
	public String toString() {
		String imsi = "이름 : " + this.name + "\n";
		imsi += "나이 : " + this.age + "\n";
		imsi += "주소 : " + this.address + "\n";
		imsi += "전화 번호 : " + this.number + "\n";

		String mytype = "";
		if (this.type == 1) {
			mytype = "직원";
		} else if (this.type == 2) {
			mytype = "선생님";
		} else {
			mytype = "학생";
		}

		imsi += "직업 : " + mytype + "\n";

		return imsi;
	}

}

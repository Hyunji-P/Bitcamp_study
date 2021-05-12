//����Ŭ����
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
		imsi += "�̸� : " + this.name + "\n";
		imsi += "���� : " + this.age + "\n";
		imsi += "�ּ� : " + this.address + "\n";
		imsi += "��ȣ : " + this.number + "\n";

		String mytype = "";
		if (type == 1) {
			mytype = "����";
		} else if (type == 2) {
			mytype = "������";
		} else {
			mytype = "�л�";
		}

		imsi += "Ÿ�� : " + mytype + "\n";
		return imsi;
	}

}

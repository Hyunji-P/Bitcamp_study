package pkg1014;

//���� Ŭ����
public class Person {
	private String name;// �̸�
	private int age;// ����
	private String address;// �ּ�
	private String number;// ��ȭ��ȣ
	private int type; // Ÿ��

	public Person(String name, int age, String address, String number, int type) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.number = number;
		this.type = type;

	}

	@Override
	public String toString() {
		String imsi = "�̸� : " + this.name + "\n";
		imsi += "���� : " + this.age + "\n";
		imsi += "�ּ� : " + this.address + "\n";
		imsi += "��ȭ ��ȣ : " + this.number + "\n";

		String mytype = "";
		if (this.type == 1) {
			mytype = "����";
		} else if (this.type == 2) {
			mytype = "������";
		} else {
			mytype = "�л�";
		}

		imsi += "���� : " + mytype + "\n";

		return imsi;
	}

}

package myunicon;

public class Unicon extends Animal implements Horse, Bird {

	@Override
	public void fly() {
		String imsi = "���̰� " + super.getAge() + "���� ";
		imsi += super.getName() + "�� ";
		imsi += "�ü�" + Bird.speed + "���� ���� �ٴմϴ�.";
		System.out.println(imsi);

	}

	@Override
	public void run() {
		String imsi = "\n�̸� : " + super.getName();
		imsi += "\n���� : " + super.getAge();
		imsi += "\n�ü� : " + Horse.speed;
		imsi += "\n�ʿ��� �پ�ٴմϴ�.\n";
		System.out.println(imsi);
	}

	public Unicon() {
	}

	public Unicon(String name, int age) {
		super(name, age);
	}

}

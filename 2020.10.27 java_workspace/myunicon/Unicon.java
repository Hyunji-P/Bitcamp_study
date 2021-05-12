package myunicon;

public class Unicon extends Animal implements Horse, Bird {

	@Override
	public void fly() {
		String imsi = "나이가 " + super.getAge() + "살인 ";
		imsi += super.getName() + "이 ";
		imsi += "시속" + Bird.speed + "으로 날아 다닙니다.";
		System.out.println(imsi);

	}

	@Override
	public void run() {
		String imsi = "\n이름 : " + super.getName();
		imsi += "\n나이 : " + super.getAge();
		imsi += "\n시속 : " + Horse.speed;
		imsi += "\n초원을 뛰어다닙니다.\n";
		System.out.println(imsi);
	}

	public Unicon() {
	}

	public Unicon(String name, int age) {
		super(name, age);
	}

}

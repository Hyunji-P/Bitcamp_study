package pkg1012;

public class Mother05 {
	private String name; // �̸�
	private int age; // ����

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Mother05(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public Mother05() {

	}

	public void Display() {
		String imsi = "%s�� %d�� �Դϴ�.";
		System.out.printf(imsi + "\n", this.name, this.age);
	}

}

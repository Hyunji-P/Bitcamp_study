package pkg1007;

public class Saram03 {

	private String name;
	private double height;
	private double weight;
	private String hobby;
	private String blood;

	public Saram03() {
		this.blood = "O";
		this.height = 177.8;
		this.weight = 75.2;
		this.hobby = "����";
		this.name = "��ö��";

	}

	public Saram03(String name, double height, double weight, String hobby, String blood) {
		this.blood = blood;
		this.height = height;
		this.weight = weight;
		this.hobby = hobby;
		this.name = name;

	}

	public void Display() {
		System.out.println("\"" + this.name + "\"���� ���� �Դϴ�.");
		System.out.println("�̸� : " + this.name);
		System.out.println("Ű : " + this.height);
		System.out.println("������ : " + this.weight);
		System.out.println("��� : " + this.hobby);
		System.out.println("������ : " + this.blood);
		System.out.println();
	}

}

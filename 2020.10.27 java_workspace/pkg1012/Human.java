package pkg1012;

//����Ŭ����
public class Human {
	private String name;
	private String gender; // ����
	private String GENDER; // �ѱ� ����
	private double tall;// Ű
	private double weight;// ������

	public Human(String name, String gender, double tall, double weight) {
		this.name = name;
		this.gender = gender;
		if (this.gender.equals("M")) {
			this.GENDER = "����";
		} else {
			this.GENDER = "����";
		}
		this.tall = tall;
		this.weight = weight;
		this.output();

	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public double getTall() {
		return tall;
	}

	public double getWeight() {
		return weight;
	}

	private void output() {
		String imsi = "�̸� : %s, ���� : %s, Ű : %.2f, ������ : %.2f";
		System.out.printf(imsi + "\n", this.name, this.GENDER, this.tall, this.weight);
	}

}

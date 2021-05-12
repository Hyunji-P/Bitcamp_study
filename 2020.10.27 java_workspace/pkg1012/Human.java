package pkg1012;

//수퍼클래스
public class Human {
	private String name;
	private String gender; // 성별
	private String GENDER; // 한글 성별
	private double tall;// 키
	private double weight;// 몸무게

	public Human(String name, String gender, double tall, double weight) {
		this.name = name;
		this.gender = gender;
		if (this.gender.equals("M")) {
			this.GENDER = "남자";
		} else {
			this.GENDER = "여자";
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
		String imsi = "이름 : %s, 성별 : %s, 키 : %.2f, 몸무게 : %.2f";
		System.out.printf(imsi + "\n", this.name, this.GENDER, this.tall, this.weight);
	}

}

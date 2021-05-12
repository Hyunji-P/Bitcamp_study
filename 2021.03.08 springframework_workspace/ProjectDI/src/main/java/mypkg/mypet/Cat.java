package mypkg.mypet;

public class Cat {
	private String type; // 동물 종류
	private String name; // 동물 이름
	private int age; // 동물 나이

	public Cat() {
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		String imsi = "";
		imsi += "동물 종류 : " + this.type + "\n";
		imsi += "동물 이름 : " + this.name + "\n";
		imsi += "동물 나이 : " + this.age + "\n";

		return imsi;
	}

}

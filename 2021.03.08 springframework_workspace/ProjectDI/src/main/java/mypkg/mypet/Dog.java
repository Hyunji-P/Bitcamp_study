package mypkg.mypet;

public class Dog {
	private String type; // 동물 종류
	private String name; // 동물 이름
	private String voice; // 동물 음성

	public Dog() {
	}

	public Dog(String type, String name, String voice) {
		this.type = type;
		this.name = name;
		this.voice = voice;
	}

	@Override
	public String toString() {
		String imsi = "";
		imsi += "동물 종류 : " + this.type + "\n";
		imsi += "동물 이름 : " + this.name + "\n";
		imsi += "동물 음성 : " + this.voice + "\n";
		imsi += "-------------------------------";

		return imsi;
	}

}

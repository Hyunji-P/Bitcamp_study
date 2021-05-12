package mypkg.mypet;

public class Saram {
	private Dog dog;
	private String name;
	private Cat cat;

	public Saram(Dog dog, String name, Cat cat) {
		this.dog = dog;
		this.name = name;
		this.cat = cat;
	}

	@Override
	public String toString() {
		String imsi = "";
		imsi += this.name + "이(가) 키우는 동물 입니다.\n";
		imsi += this.dog.toString() + "\n";
		imsi += this.cat.toString() + "\n";

		return imsi;
	}

}

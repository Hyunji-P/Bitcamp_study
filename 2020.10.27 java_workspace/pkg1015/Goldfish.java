package pkg1015;

public class Goldfish extends Animal {

	public Goldfish(String name, String location) {
		super(name, location);
	}

	@Override
	public void move() {
		String imsi = super.getName() + "가 " + super.getLocation() + "에서 헤엄칩니다.";
		System.out.println(imsi);

	}

}

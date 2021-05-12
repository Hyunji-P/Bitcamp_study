package pkg1015;

public class Eagle extends Animal {

	public Eagle(String name, String location) {
		super(name, location);
	}

	@Override
	public void move() {
		String imsi = super.getName() + "가 " + super.getLocation() + "에서 날아다닙니다.";
		System.out.println(imsi);

	}
}

package pkg1015;

public class Lion extends Animal {
	public Lion(String name, String location) {
		super(name, location);
	}

	// 특징) 추상 클래스를 상속 받는 클래스는 반드시 추상 메소드를 오버라이딩 해야된다.
	@Override // implementation(구체화)
	public void move() {
		String imsi = super.getName() + "가 " + super.getLocation() + "에서 달립니다.";
		System.out.println(imsi);

	}
}

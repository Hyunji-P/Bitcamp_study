package cartest;

public class Tico extends Car {
	private String comment;

	public Tico() {
	}

	public Tico(String name, int price, String comment) {
		super(name, price);
		this.comment = comment;
	}

	@Override
	public void speedup(int su) {
		super.setSpeed(su);

	}

	@Override
	public void speeddown(int su) {
		super.setSpeed(-su);
	}

	@Override
	public void display() {
		String imsi = "\"" + super.getName() + "\"" + " 현재 속도 :" + super.getSpeed();
		System.out.println(imsi);

	}

	@Override
	public String toString() {
		String imsi = "코멘트 : " + this.comment;
		return super.toString() + imsi;
	}
}

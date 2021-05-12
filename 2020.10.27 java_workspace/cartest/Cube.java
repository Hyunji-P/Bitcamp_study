package cartest;

public class Cube extends Car {
	private double fuel;

	public Cube() {
	}

	public Cube(String name, int price, double fuel) {
		super(name, price);
		this.fuel = fuel;
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
		String imsi = "\"" + super.getName() + "\"" + " ���� �ӵ� :" + super.getSpeed();
		System.out.println(imsi);

	}
	
	@Override
	public String toString() {
		String imsi = "���� : " + this.fuel;
		return super.toString() + imsi;
	}

}

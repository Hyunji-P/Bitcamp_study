package polymorphism;

public class Cube extends Car {
	private double fuelEfficiency;// ¿¬ºñ

	public Cube() {
	}

	public Cube(String name, int price, double fuelEfficiency) {
		super(name, price);
		this.fuelEfficiency = fuelEfficiency;
	}

	public double getFuelEfficiency() {
		return fuelEfficiency;
	}
}

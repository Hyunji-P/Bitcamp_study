package nopolymorphism;

public class Cube {

	private String name;
	private int price;
	private double fuelEfficiency;

	public Cube(String name, int price, double fuelEfficiency) {
		this.name = name;
		this.price = price;
		this.fuelEfficiency = fuelEfficiency;

	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public double getFuelEfficiency() {
		return fuelEfficiency;
	}

}

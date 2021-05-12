package polymorphism;

public class Spark extends Car {
	private String maker;// Á¦Á¶»ç

	public Spark() {

	}

	public Spark(String name, int price, String maker) {
		super(name, price);
		this.maker = maker;
	}

	public String getMaker() {
		return maker;
	}
}

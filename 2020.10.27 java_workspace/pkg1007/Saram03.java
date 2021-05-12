package pkg1007;

public class Saram03 {

	private String name;
	private double height;
	private double weight;
	private String hobby;
	private String blood;

	public Saram03() {
		this.blood = "O";
		this.height = 177.8;
		this.weight = 75.2;
		this.hobby = "µ¶¼­";
		this.name = "±èÃ¶¼ö";

	}

	public Saram03(String name, double height, double weight, String hobby, String blood) {
		this.blood = blood;
		this.height = height;
		this.weight = weight;
		this.hobby = hobby;
		this.name = name;

	}

	public void Display() {
		System.out.println("\"" + this.name + "\"´ÔÀÇ Á¤º¸ ÀÔ´Ï´Ù.");
		System.out.println("ÀÌ¸§ : " + this.name);
		System.out.println("Å° : " + this.height);
		System.out.println("¸ö¹«°Ô : " + this.weight);
		System.out.println("Ãë¹Ì : " + this.hobby);
		System.out.println("Ç÷¾×Çü : " + this.blood);
		System.out.println();
	}

}

package pkg1013;

//����
public class Book extends RefCasting {
	private String name; // å �̸�
	private int price; // ����

	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}

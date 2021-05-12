package pkg1013;

//서브
public class Book extends RefCasting {
	private String name; // 책 이름
	private int price; // 가격

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

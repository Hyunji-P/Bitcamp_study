package nopolymorphism;

public class Tico {
	private String name; // �� �̸�
	private int price; // �ܰ�
	private String comment;// �ο� ����

	public Tico(String name, int price, String comment) {
		this.name = name;
		this.price = price;
		this.comment = comment;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getComment() {
		return comment;
	}

}

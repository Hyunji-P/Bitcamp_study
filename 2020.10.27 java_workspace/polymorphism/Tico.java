package polymorphism;

//���� Ŭ����
public class Tico extends Car {
	private String comment;// �ڸ�Ʈ

	public Tico() {

	}

	public Tico(String name, int price, String comment) {
		super(name, price);
		this.comment = comment;
	}

	public String getComment() {
		return comment;
	}

}

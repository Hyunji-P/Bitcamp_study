package polymorphism;

//서브 클래스
public class Tico extends Car {
	private String comment;// 코멘트

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

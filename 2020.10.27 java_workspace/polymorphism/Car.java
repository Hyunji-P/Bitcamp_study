package polymorphism;

//수퍼 클래
public class Car {
	private String name; // 차량
	private int price; // 가격

	public Car() {
		// 무조건 상속을 따라오기 때문에
		// 매개변수 0개짜리도 습관적으로 만들어 주기
	}

	public Car(String name, int price) {
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

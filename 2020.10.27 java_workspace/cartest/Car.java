package cartest;

//수퍼 클래스
public abstract class Car implements Speed, Display {
	private String name; // 차이름
	private int price; // 단가
	private int speed; // 속도

	public Car() {
	}

	public Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void setSpeed(int speed) {
		this.speed += speed;
	}

	public int getSpeed() {
		return speed;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		String imsi = "\n차 이름 : " + this.name + "\n";
		imsi += "단 가 : " + this.price;
		return imsi + "\n";
	}

}

package cartest;

//���� Ŭ����
public abstract class Car implements Speed, Display {
	private String name; // ���̸�
	private int price; // �ܰ�
	private int speed; // �ӵ�

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
		String imsi = "\n�� �̸� : " + this.name + "\n";
		imsi += "�� �� : " + this.price;
		return imsi + "\n";
	}

}

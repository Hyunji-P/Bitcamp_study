package polymorphism;

//���� Ŭ��
public class Car {
	private String name; // ����
	private int price; // ����

	public Car() {
		// ������ ����� ������� ������
		// �Ű����� 0��¥���� ���������� ����� �ֱ�
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

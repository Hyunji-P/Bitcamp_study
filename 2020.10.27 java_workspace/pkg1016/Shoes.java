package pkg1016;

public class Shoes {
	String name; // �̸�
	int size; // ������
	// int type; // �Ź��� ���� (���Ѵ�)
	ShoesType ShoesType;// �Ź��� ���� (���Ѽ�)
	ShoesTypeName shoesTypeName; // �ѱ� �̸��� �� Enum Ÿ��

	public Shoes(String name, int size, ShoesType shoesType) {
		super();
		this.name = name;
		this.size = size;
		ShoesType = shoesType;
	}

	public Shoes(String name, int size, ShoesTypeName shoesTypeName) {
		super();
		this.name = name;
		this.size = size;
		this.shoesTypeName = shoesTypeName;
	}

	public void Display() {
		System.out.println("�Ź� �̸� : " + this.name);
		System.out.println("�Ź� ũ�� : " + this.size);
		// ���� , �迭�μ� ���ڷ� �����ϸ� ���ڰ� ���� �ش��ϴ��� ã�⶧���� �����
		System.out.println("�Ź� ���� : " + this.ShoesType);
	}

	public void Display2() {
		System.out.println("�Ź� �̸� : " + this.name);
		System.out.println("�Ź� ũ�� : " + this.size);
		System.out.println("�Ź� ���� : " + this.shoesTypeName);
		//getter �� �����;� ���� �ѱ��̸��� ����
		System.out.println("�Ź� ���� : " + this.shoesTypeName.getName());
	}

}

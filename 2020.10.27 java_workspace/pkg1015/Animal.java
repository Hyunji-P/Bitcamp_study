package pkg1015;

public abstract class Animal {
//Ư¡) �߻� �޼ҵ带 �����ϴ� Ŭ������ �ݵ�� �߻� Ŭ�����̾�� �Ѵ�.
	private String name; // �̸�
	private String location; // �� Ȱ�� ����

	public Animal(String name, String location) {
		this.name = name;
		this.location = location;
	}

//Ư¡)�߻� Ŭ���� ������ �Ϲ� ������ �޼ҵ嵵 ��� �����ϴ�.
	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public abstract void move();
//Ư¡) ���� ������ ������ �����Ƿ� �޼ҵ� body(�߰�ȣ) ��� �����ݷ��� �ٿ� ��� �Ѵ�.

}

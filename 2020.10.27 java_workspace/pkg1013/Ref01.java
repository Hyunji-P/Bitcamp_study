package pkg1013;

class Animal {
	int x = 100;

	public void cry() { // ���� ����
		System.out.println("������ ¢�´�.");

	}

	@Override
	public String toString() {
		String imsi = "���� : " + this.x + "����";
		return super.toString() + "\n" + imsi;// 1�� + 2��
		// super.toString() �� Object Ŭ���� toString ȣ��
		// Animal �� ���� Ŭ����(�������̵� �Ǿ�����)
	}

}

class Dog extends Animal {
	int y = 200;

	@Override
	public String toString() {
		String imsi = "������ : " + this.y + "����";// 3��
		return super.toString() + "\n" + imsi;
		// super.toString() �� Animal ���� Ŭ������ toString ȣ�� , Dog �� ���� Ŭ����
		// toString ȣ��ǰ� �״��� "\n" + imsi ����

	}
}

class Cat extends Animal {
	@Override
	public void cry() {
		System.out.println("����̰� �߿��ϰ� ��ϴ�.");
	}

}

public class Ref01 {// Ŭ�����̸��� �����̸��� ���ƾ��Ѵ�.

	public static void main(String[] args) {
		Animal animal = new Dog(); // �±�
		System.out.println(animal.x);
		// System.out.println(animal.y); //�ѽ������� �Ⱥ���

		// toString() �޼ҵ�
		// �ֻ��� ObjectŬ�������� animal�� ��ӹް� ���� �� �ڿ� .toString
		// ��� �Ҷ� ������ ��µǳ� Animal Ŭ�������� �������̵����� ��°���� �ٲٰ� ����
		System.out.println(animal);
		// animal �»��� Dog�ϱ� DogŬ�������� toString �޼ҵ尡 �ִ� �� ã��

		animal.cry(); // ����� �ް� �����Ƿ� ����Ŭ���� cry()�޼ҵ� ȣ��
		showData(animal);// animal �»��� Dog��

		// ���� 2������ ������ �迭 ����
		Animal[] myani = new Animal[2];

		// ��ü ����
		myani[0] = new Dog();
		myani[1] = new Cat();

		for (int i = 0; i < myani.length; i++) {
			showData(myani[i]);
		}
	}

	private static void showData(Animal animal) {
		if (animal instanceof Dog) {
			System.out.println("������");
			Dog dog = (Dog) animal;
			System.out.println("dog.x : " + dog.x);
			System.out.println("dog.y : " + dog.y);

			dog.cry();
			// dog.cry() �������̵��� �ȵǾ�����
			// � �޼ҵ尡 ���ۿ��� �����ϴ� ���
			// ����� �ް� �����Ƿ�, ���� Ŭ������ �޼ҵ尡 ������ �ȴ�.
		} else if (animal instanceof Cat) {
			System.out.println("�����");
			Cat cat = (Cat) animal;
			System.out.println("cat.x : " + cat.x);// ����̴� y�� ����

			cat.cry();
			// cat.cry() �������̵��� �Ǿ�����
			// ���� Ŭ������ �޼ҵ尡 �켱������ ���� �ȴ�.
		} else {
			System.out.println("some animal");
		}

	}

}

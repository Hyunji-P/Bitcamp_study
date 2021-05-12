package polymorphism;

public class Person {
	private String name;// ���� , �ڹٰ� �����ϴ� Ŭ����(�⺻�� : null)
	private Car car; // �츮�� ���� Ŭ����(�⺻�� : null) �� �Ѵ�

	public Person(String name) {
		this.name = name;
	}

	public void ride(Car car) {
		this.car = car;

		System.out.println("���� : " + this.name);
		System.out.println("���� : " + this.car.getPrice());
		System.out.println("���� : " + this.car.getName() + " �ý�");

		// Car�� ���� , getComment�� ���� �� ����Ŭ���� �޼ҵ忡 �����Ϸ��� ����
		if (car instanceof Tico) {
			Tico mytico = (Tico) car;
			System.out.println("�ڸ�Ʈ : " + mytico.getComment());

		} else if (car instanceof Spark) {
			Spark myspark = (Spark) car;
			System.out.println("������ : " + myspark.getMaker());

		} else if (car instanceof Cube) {
			Cube mycube = (Cube) car;
			System.out.println("���� : " + mycube.getFuelEfficiency());

		}

	}
}

package nopolymorphism;

public class CarMain {

	public static void main(String[] args) {
		Person soo = new Person("��ö��");

		Tico tico = new Tico("Ƽ��", 100, "�ɸ��ؿ�.");

		soo.ride(tico); // ö���� Ƽ�ڸ� Ÿ��(ride())
		System.out.println("==========================");

		//������ ����� ���� : ������ ����ϱ� ����
		Person hee = new Person("�ڿ���");
		Spark spark = new Spark("����ũ", 200, "GM ���");
		hee.ride(spark);// spark �� 14�� ���� �ǹ�
		System.out.println("==========================");

		Person minsik = new Person("�ֹν�");
		// 1���� ���� ����ϴ� 1ȸ�� ��ü ����
		// �����ڸ� ���� �ٷ� �ѱ�
		minsik.ride(new Cube("ť��", 300, 24.1));

	}

}

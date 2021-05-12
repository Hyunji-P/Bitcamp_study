package polymorphism;

public class CarMain {

	public static void main(String[] args) {
		Person soo = new Person("��ö��");

		// �迭 ���� - new ������
		Car[] carlist = new Car[3];

		// �±޿� ���� ��ü ����
		carlist[0] = new Tico("NEW Ƽ��", 400, "������");
		carlist[1] = new Spark("NEW ����ũ", 500, "����");
		carlist[2] = new Cube("NEW ť��", 600, 12.3);

		System.out.println("=========================");

		for (int i = 0; i < carlist.length; i++) {
			soo.ride(carlist[i]);
			System.out.println();
		}

		System.out.println("=========================");

		// �迭 ���� - �ʱ�ȭ ���
		Car[] cararray = 
			{
				new Tico("NEW Ƽ��", 700, "�߾��� ����"), //�±� 1
				new Spark("NEW ����ũ", 800, "�Ｚ"), //�±� 2
				new Cube("NEW ť��", 900, 12.4)//�±� 3
		    };  

		for (int i = 0; i < cararray.length; i++) {
			soo.ride(cararray[i]);
			System.out.println();
		}

	}

}

package pkg0923;

public class Test_Mypay_��� {

	public static void main(String[] args) {
		double RATE = 5000; // �⺻ �ñ�
		double pay; // �ӱ�
		double hours; // �ٹ� �ð�

		// �ӱ� = 5000 * 5 = 25000
		// �ӱ� = 5000 * 8 + 5000 * 1.5 * 7 = 92500
		hours = 15;

		double FIRST = 8.0; // �б� �ð�

		if (hours > FIRST) {
			pay = RATE * FIRST + (int) (1.5 * RATE * (hours - FIRST));
		} else {
			pay = RATE * hours;
		}

		System.out.println("�ӱ��� " + pay + "�Դϴ�.");

		hours = 25.0;

		FIRST = 10.0; // �б� �ð�
		double SECOND = 20.0;
		pay = 0.0;

		if (hours < FIRST) {
			pay = RATE * hours;

		} else if (hours < SECOND) {
			pay = RATE * FIRST;// 5000*10
			pay += 1.5 * RATE * (hours - FIRST);

		} else {
			pay = RATE * FIRST; // 5000 * 10
			System.out.println(pay);

			pay += 1.5 * RATE * (SECOND - FIRST); // 1.5*5000*(20-10)
			System.out.println(pay);

			pay += 2.0 * RATE * (hours - SECOND);// 2.0*5000*(25-20)
			System.out.println(pay);
		}

		System.out.println("�ӱ��� " + pay + "�Դϴ�.");

	}

}

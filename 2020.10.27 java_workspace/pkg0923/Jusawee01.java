package pkg0923;

public class Jusawee01 {

	public static void main(String[] args) {
		// �ֻ����� ���� 1�Ǵ� 4�̸� 100
		// �ֻ����� ���� 2�Ǵ� 5�̸� 200
		// �ֻ����� ���� 3�Ǵ� 6�̸� 300

		int point = 3;
		int su = 0;

		
		if (point == 1 || point == 4) {
			su = 100;
		} else if (point == 2 || point == 5) {
			su = 200;
		} else if (point == 3 || point == 6) {
			su = 300;
		}

//		if (point % 3 == 1) {
//			su = 100;
//		} else if (point % 3 == 2) {
//			su = 200;
//		} else if (point % 3 == 0) {
//			su = 300;
//		}

		System.out.println("��� : " + su);
	}
}

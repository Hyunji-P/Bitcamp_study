package pkg0925;

public class SumTest {

	public static void main(String[] args) {
//		  ����) 1���� 10������ ���� �߿��� 
//			   3�� ����� �� : 3+6+9 = 18 
//			   3�� ����� �ƴ� ���� �� 5�̻��� �� �߿��� 8�� ������ ���� ���� : 5+7+10 = 22
//			   3�� ����� �ƴ� ���� �� 5�̸��� ���� ���� : 1+2+4 = 7

		int sumA = 0, sumB = 0, sumC = 0;

		for (int i = 1; i < 11; i++) {
			if (i % 3 == 0) {
				sumA += i;
			} else if (i % 3 != 0 && i >= 5 && i != 8) {
				sumB += i;

			} else if (i % 3 != 0 && i < 5) {
				sumC += i;
			}

//			if (i % 3 == 0) {
//				sumA += i;
//			} else {// 3�� ����� �ƴϸ�
//				if (i >= 5) { // 5�̻��̸�
//					if (i != 8) {
//						sumB += i;
//					}
//
//				} else {// 5�̸�
//					sumC += i;
//				}
//			}

		}
		System.out.println("sum A �� ���� " + sumA);
		System.out.println("sum B �� ���� " + sumB);
		System.out.println("sum C �� ���� " + sumC);
	}

}

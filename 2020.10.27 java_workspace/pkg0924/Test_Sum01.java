package pkg0924;

public class Test_Sum01 {

	public static void main(String[] args) {
//		1���� 10������ �����߿���
//		i�� Ȧ���̸� �� ���� 3�� ���� ����� ����
//		(1+3)+(3+3)+(5+3)+(7+3)+(9+3)=40
//		i�� ¦���̸� �� ���� ������ -1�� �� ���� ����
//		(4-1)+(16-1)+(36-1)+(64-1)+(100-1)=215
//		�� ������ִ� ���α׷� �ۼ�

		int sumA = 0;
		int sumB = 0;

		for (int i = 1; i < 11; i++) {
			if (i % 2 != 0) {
				sumA += (i + 3);
			} else {
				sumB += (i * i - 1);
			}
		}

		System.out.println("�� �� : " + sumA);
		System.out.println("�� �� : " + sumB);

	}

}

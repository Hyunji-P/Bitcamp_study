package pkg0924;

public class For05 {

	public static void main(String[] args) {
		// 1���� 10������ ���� �߿���
		// 3�� ��� �̰ų� 5�� ����� �׸���� ���ձ��ϱ�

		int sum = 0;

		for (int i = 1; i < 11; i++) {

			boolean bool = i % 3 == 0 || i % 5 == 0;

			if (bool) {
				sum += i;

			}

		}
		System.out.println(sum);

//		
//		1���� 50������ ���� �߿��� 
//		sumB 3�� ����� ���� = 3+6+9+...+48 
//		sumA 3�� ����� �ƴ� ���� ���� = 1+2+4+...+50
//		

		int sumA = 0, sumB = 0;

		for (int i = 1; i < 51; i++) {
			if (i % 3 == 0) {
				sumB += i;
			} else {
				sumA += i;
			}

		}

		System.out.println("��� sumA - sumB : " + (sumA - sumB));

	}

}

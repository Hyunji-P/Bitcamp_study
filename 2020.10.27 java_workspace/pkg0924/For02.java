package pkg0924;

public class For02 {

	public static void main(String[] args) {
		// 1���� 10������ Ȧ���� ¦���� ���� ���� ���ϱ�

		int odd = 0, even = 0;

		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}

		}
		System.out.println("Ȧ���� ���� : " + odd);
		System.out.println("¦���� ���� : " + even);

		// while �������� Ǯ���.

		odd = 0;
		even = 0;

		int j = 1;

		while (j < 11) {
			if (j % 2 == 0) {
				even += j;
			} else {
				odd += j;
			}
			j++;

		}
		System.out.println("Ȧ���� ���� : " + odd);
		System.out.println("¦���� ���� : " + even);

	}

}

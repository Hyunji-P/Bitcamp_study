package pkg0928;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// ��Ұ� 5���� �迭�� �����ϰ�,
		// ��ĳ�ʸ� �̿��Ͽ� ������ �Է� �޽��ϴ�.
		// ��ҵ��� Ȧ���� ���հ� ¦���� ������ ����ϴ� ���α׷�

		// �Էµȼ�
		// 5
		// 4
		// 6
		// 6
		// 7

		// Ȧ���� �� : 12
		// ¦���� �� : 16

		int[] num = new int[5];
		int odd = 0, even = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.");

		for (int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();

			if (num[i] % 2 == 0) {
				even += num[i];
			} else {
				odd += num[i];
			}

		}
		System.out.println("Ȧ���� �� : " + odd);
		System.out.println("¦���� �� : " + even);

	}

}

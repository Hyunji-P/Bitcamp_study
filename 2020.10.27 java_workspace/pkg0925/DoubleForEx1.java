package pkg0925;

public class DoubleForEx1 {

	public static void main(String[] args) {
		// ��°��
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345

		System.out.println("���̽� 01");

		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		// ��°��
		// 11111
		// 22222
		// 33333
		// 44444
		// 55555

		System.out.println("���̽� 02");

		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		// ��°��
		// 12345
		// 23456
		// 34567
		// 45678
		// 56798

		System.out.println("���̽� 03");

		for (int i = 1; i < 6; i++) {

			for (int j = 1; j < 6; j++) {
				System.out.print(i + j - 1);

			}
			System.out.println();
		}

		// �ٽ� Ǯ���

		// ��°��
		// 98765
		// 87654
		// 76543
		// 65432
		// 54321

		System.out.println("���̽� 04");

		for (int i = 1; i < 6; i++) {

			for (int j = 10; j > 5; j--) {
				System.out.print(j - i);

			}
			System.out.println();
		}

		// ��°��
		// 1
		// 12
		// 123
		// 1234
		// 12345

		System.out.println("���̽� 05");
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);

			}
			System.out.println();
		}

		// ��°��
		// 12345
		// 1234
		// 123
		// 12
		// 1

		System.out.println("���̽� 06");

		for (int i = 5; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);

			}
			System.out.println();
		}

	}

}

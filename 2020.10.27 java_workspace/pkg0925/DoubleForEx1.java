package pkg0925;

public class DoubleForEx1 {

	public static void main(String[] args) {
		// 출력결과
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345

		System.out.println("케이스 01");

		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		// 출력결과
		// 11111
		// 22222
		// 33333
		// 44444
		// 55555

		System.out.println("케이스 02");

		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		// 출력결과
		// 12345
		// 23456
		// 34567
		// 45678
		// 56798

		System.out.println("케이스 03");

		for (int i = 1; i < 6; i++) {

			for (int j = 1; j < 6; j++) {
				System.out.print(i + j - 1);

			}
			System.out.println();
		}

		// 다시 풀어보기

		// 출력결과
		// 98765
		// 87654
		// 76543
		// 65432
		// 54321

		System.out.println("케이스 04");

		for (int i = 1; i < 6; i++) {

			for (int j = 10; j > 5; j--) {
				System.out.print(j - i);

			}
			System.out.println();
		}

		// 출력결과
		// 1
		// 12
		// 123
		// 1234
		// 12345

		System.out.println("케이스 05");
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);

			}
			System.out.println();
		}

		// 출력결과
		// 12345
		// 1234
		// 123
		// 12
		// 1

		System.out.println("케이스 06");

		for (int i = 5; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);

			}
			System.out.println();
		}

	}

}

package pkg0925;

public class DoubleForEx2 {
	//다시 풀어보기 

	public static void main(String[] args) {
		// 아스키 코드 문자 A(65), a(97)
		int ch = 65;
		int newch = 65 + 32;

		System.out.println((char) (ch));
		System.out.println();
		System.out.println((char) (newch));
		System.out.println();
		System.out.println((char) (ch + 1));
		;
		System.out.println();

		// 문제)
		// A
		// AB
		// ABC
		// ...
		// ABC...XYZ

		int GAESU = 26;
		int largeA = 65;
		int largeZ = largeA + GAESU - 1;

		System.out.println("출력결과 01");
		for (int i = 1; i <= 26; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print((char) (ch + j));
			}
			System.out.println();
		}

		// 다른 풀이방식
		System.out.println("출력결과 02");
		for (int i = largeA; i <= (largeZ); i++) { //(largeA + GAESU - 1)?
			for (int j = largeA; j <= i; j++) {
				System.out.print((char) j);
			}
			System.out.println();
		}
		// 문제)
		// abc ... xyz
		// ...
		// abc
		// ab
		// a
		
		//
		int smallA = 97;
		int smallZ = 97 + GAESU - 1; //a가 처음 z가 마지막이기때문에 

		System.out.println("출력결과 03");
		for (int i = smallZ; i >= smallA; i--) {
			for (int j = smallA; j <= i; j++) {
				System.out.print((char) j);
			}
			System.out.println();
		}
		// 문제)
		// A
		// Ab
		// AbC
		// ...
		// AbCd ...xYz

		int GAP = 32;

		System.out.println("출력결과 04");
		for (int i = largeA; i <= (largeA + GAESU - 1); i++) {
			for (int j = largeA; j <= i; j++) {
				if (j % 2 == 1) {
					System.out.print((char) j);
				} else {
					System.out.print((char) (j + GAP));
				}

			}
			System.out.println();
		}
	}

}

package pkg0925;

public class DoubleForEx2 {
	//�ٽ� Ǯ��� 

	public static void main(String[] args) {
		// �ƽ�Ű �ڵ� ���� A(65), a(97)
		int ch = 65;
		int newch = 65 + 32;

		System.out.println((char) (ch));
		System.out.println();
		System.out.println((char) (newch));
		System.out.println();
		System.out.println((char) (ch + 1));
		;
		System.out.println();

		// ����)
		// A
		// AB
		// ABC
		// ...
		// ABC...XYZ

		int GAESU = 26;
		int largeA = 65;
		int largeZ = largeA + GAESU - 1;

		System.out.println("��°�� 01");
		for (int i = 1; i <= 26; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print((char) (ch + j));
			}
			System.out.println();
		}

		// �ٸ� Ǯ�̹��
		System.out.println("��°�� 02");
		for (int i = largeA; i <= (largeZ); i++) { //(largeA + GAESU - 1)?
			for (int j = largeA; j <= i; j++) {
				System.out.print((char) j);
			}
			System.out.println();
		}
		// ����)
		// abc ... xyz
		// ...
		// abc
		// ab
		// a
		
		//
		int smallA = 97;
		int smallZ = 97 + GAESU - 1; //a�� ó�� z�� �������̱⶧���� 

		System.out.println("��°�� 03");
		for (int i = smallZ; i >= smallA; i--) {
			for (int j = smallA; j <= i; j++) {
				System.out.print((char) j);
			}
			System.out.println();
		}
		// ����)
		// A
		// Ab
		// AbC
		// ...
		// AbCd ...xYz

		int GAP = 32;

		System.out.println("��°�� 04");
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

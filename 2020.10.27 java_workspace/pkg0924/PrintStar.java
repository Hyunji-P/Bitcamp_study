package pkg0924;

public class PrintStar {

	public static void main(String[] args) {
		// �� ����ϱ�
		int star = 28;

		String str = "*";

		for (int i = 1; i <= star; i++) {

			System.out.print(str);
			if (i % 5 == 0) {
				System.out.println();
			}

		}

		// �� �������� 5�� ������� ����߽��ϴ�.(�ٽ�Ǯ���)
		// 1�ٿ� n���� ����� �����ϵ��� ������ ������.
		// ex) n = 4 �̸� ���ٿ� 4���� ����մϴ�.
		System.out.print("\n-----------\n");
		int n = 6;
		for (int i = 1; i <= star; i++) {
			System.out.print(str);
			if (i % n == 0) {
				System.out.println();
			}
		}

	}

}

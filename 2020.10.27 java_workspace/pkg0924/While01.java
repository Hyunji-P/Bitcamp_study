package pkg0924;

public class While01 {

	public static void main(String[] args) {
		int total = 0;
		int i = 1;

		while (i < 11) {
			total += i; // �� ��
			i++;
		}

		System.out.println("���� : " + total);

		// 1 + 4 + 7 + .... + 100 = 1717 (�ٽ�Ǯ���)
		total = 0;
		i = 1;
		while (i < 101) {

			total += i; // �� ��
			i += 3;

		}

		System.out.println("���� : " + total);

		total = 0;
		i = 1;
		while (i < 11) {

			total += 2 * i + 1; // �� ��
			i++;

		}

		System.out.println("���� : " + total);

		// 1*1 + 6*6 + 11*11 + ... + 96*96 = 63670

		total = 0;
		i = 1;
		
		while (i < 97) {

			total += i * i; // �� ��
			i += 5;

		}

		System.out.println("���� : " + total);

	}

}

package pkg0929;
//����

public class Overload02 {

	public static void main(String[] args) {
		// �����ε� �޼ҵ忡 ���� �ٷ� ���� �� ����
		overload("�¸��", 7);
		overload(100);
		overload('a', 'A', 'b');
		overload(5.0, 3.0);

	}

	static void overload(String good, int jungsu) {

		System.out.println("����1)");
		for (int i = 1; i <= jungsu; i++) {
			System.out.print(good + "\t");

		}
		System.out.println();

	}

	static void overload(int jungsu1) {
		int result = 0;
		for (int i = 1; i <= jungsu1; i++) {
			result += i;
		}
		System.out.println("����2) " + result);

	}

	static void overload(char ch, char ch1, char ch2) {
		char result = ch > ch1 ? (ch > ch2 ? ch : ch2) : (ch1 > ch2 ? ch1 : ch2);// ��ø ���� ������
		System.out.println("����3) " + result);

	}

	static void overload(double x, double y) {
		x = Math.pow(x, 2.0);
		y = Math.pow(y, 2.0);
		double result = x + y;
		System.out.println("����4) " + result);

	}

}

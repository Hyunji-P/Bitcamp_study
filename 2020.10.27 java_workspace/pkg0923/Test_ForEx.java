package pkg0923;

public class Test_ForEx {
//	for ������ ����Ͽ� ���� ������ Ǯ�� ������.
//	1*2 + 2*3 + 3*4 + �� + 100*101 = 343400

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i < 101; i++) {
			sum += i * (i + 1);

		}
		System.out.println("�հ� : " + sum);

	}

}

package pkg0928;

public class Method03 {
	static int max(int a, int b, int c) {
		int result = a > b ? (a > c ? a : c) : (b > c ? b : c);

		return result; // ��ȯ Ÿ���� ������ ������ ����� ��ȯ ��Ų��.

	}

	//�����̶�� Math Ŭ���� 
	static int min(int a, int b, int c) {
		int result1 = Math.min(a, b);//a < b ? a : b;
		result1 =  Math.min(result1, c);

		return result1; // ��ȯ Ÿ���� ������ ������ ����� ��ȯ ��Ų��.

	}

	public static void main(String [] args) {
		// ���� 3���� ���� �߿��� ���� ū ���� ��ȯ���ִ� �޼ҵ� max �����ϱ�
		// ���� 3���� ���� �߿��� ���� ū ���� ��ȯ���ִ� �޼ҵ� min �����ϱ�

		int x = 3, y = 5, z = 10;

		int result = max(x, y, z);
		int result1 = min(x, y, z);

		System.out.println("�ִ밪 : " + result);
		System.out.println("�ּҰ� : " + result1);

	}

}

package pkg0929;

public class MethodOverLoading {

	public static void main(String[] args) {
		Add(1, 2); // 1�� : ������ �Ű����� 2��
		double result = Add(3.0, 4.0); // 3�� : �Ǽ��� �Ű����� 2�� ,��ȯŸ�� �����̸� = Add�޼ҵ�
		System.out.println(result);
		Add(10, 20); // 2�� : ������ �Ű����� 2�� - 1���� 2���� �����ε��� �ƴ�
		Add(1, 2, 3); // 4�� : ������ �Ű� ���� 3��

	}

	static void Add(int x, int y) {
		System.out.println("a");
		int result = x + y;
		System.out.println(result);

	}

	static double Add(double x, double y) {// Add(int x, int y)�ּ��̸� 1���� 2���� �Ǽ������� �Ͻ��� ĳ���� �Ǽ� ��
		System.out.println("b");
		double result = x + y;
		return result;
	}

	static void Add(int x, int y, int z) {
		System.out.println("c");
		int result = x + y + z;
		System.out.println(result);

	}

}

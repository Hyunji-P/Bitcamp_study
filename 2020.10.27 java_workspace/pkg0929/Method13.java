package pkg0929;

//jegob(3,6) = 3*3 + 6*6 
//max(3,6) = ū�� 6
//sub(��1, ��2) = ��1 - ��2;
//square(x) = x * x

public class Method13 {

	public static void main(String[] args) {
		int x = 3, y = 6;

		int res1 = jegob(x, y);
		int res2 = max(x, y);
		System.out.println(res1);
		System.out.println(res2);
		sub(res1, res2);

	}

	static int square(int x) { //���� ���� �޼ҵ�ȿ��� ȣ��� �޼ҵ带 ���� �� ���� 
		return x * x;
	}

	static int jegob(int x, int y) {
		return square(x) + square(y);// return x * x + y * y; x*x �� �ߺ��� �Ǳ� ������ �ϳ��� �޼ҵ�� ���� �� ����
									 // ���� ���� �޼ҵ�ȿ� �� �޼ҵ带 ȣ�� �� �� ���� 
	}

	static int max(int x, int y) {

		return x > y ? x : y;
	}

	static void sub(int x, int y) {
		int result = x - y;
		System.out.println(result);

	}

}

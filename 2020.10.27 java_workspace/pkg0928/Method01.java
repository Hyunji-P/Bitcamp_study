package pkg0928;

public class Method01 {
	// ���� 2���� �Ű������� �Է� �޴� �޼ҵ� calc�� ���� �մϴ�.
	// �� �޼ҵ�� ��ȯ Ÿ���� �������Դϴ�.
	static int calc(int a, int b) {// �޼ҵ� ���Ǻκ� , ȣ�� �޴����� a,b�� ���� �Ű� ����(�纻)
		int result = 2 * a + 3 * b - 3;
		return result; //return �޼ҵ� �������� �ǹ� , return ���� ���Ŀ� �߰� �ڵ� �� ����
	}

	public static void main(String[] args) {
		int x1 = 3;
		int x2 = 2;
		int y = 2 * x1 + 3 * x2 - 3; // �ݺ��� �Ǹ� method ����Ͽ� ȣ��
		System.out.println("y1 = " + y);

		x1 = 2;
		x2 = 5;
		y = 2 * x1 + 3 * x2 - 3;
		System.out.println("y2 = " + y);

		y = calc(3, 2);// �޼ҵ� ȣ�� , ȣ���� �ϴ� ���� x1, x2�� �� �Ű� ����(����)
		System.out.println("y3 = " + y);

		y = calc(2, 5);
		System.out.println("y4 = " + y);
		
		
	}

}

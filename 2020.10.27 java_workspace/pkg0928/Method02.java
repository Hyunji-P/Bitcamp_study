package pkg0928;

public class Method02 {
	static int add(int a, int b) {// �޼ҵ� �ۼ�(����)
		int result = a + b;
		return result;

	}

	public static void main(String[] args) {
		// 2���� ������ �Ű� ������ �Է� �޾Ƽ� ������ �������ִ� �޼ҵ� add ����
		int x = 5, y = 7;
		int result = add(x, y);// �޼ҵ� ȣ��
		System.out.println("���1 : " + result);// result �̿��ؼ� ȣ��
		System.out.println("���2 : " + add(10, 20));// �ٷ� ȣ��

		for (int i = 1; i <= 3; i++) {
			result = add(x, i);//ȣ�� 3�� �߻� 
			System.out.println("���3 : " + result);// �ٷ� ȣ��
		}

	}

}

package pkg0928;

public class Method04 {
	static int signOf(int x) {

		int result;
		if (x > 0) {
			return 1;// ���� ���� ���������� 3�� �� 1���� ������ ���� , 3�� �� 2���� ������ ���� ����
						// 3�� ���� �� 1������ �����ϸ� ������ ����Ǳ� ������ �������� return�� 1����
		} else if (x < 0) {
			return -1;
		} else {
			return 0;
		} // ruturn ��ȯ�� ��;

	}

	public static void main(String[] args) {
		// x�� ����̸� 1, �����̸� -1 , 0�̸� 0�� ������ִ� �޼ҵ� signOf �����ϱ�
		
		System.out.println(Math.signum(5.0));
		

		int x = -12;
		int result = signOf(x);
		System.out.println("��� 1 : " + result);

		x = 0;
		result = signOf(x);
		System.out.println("��� 2 : " + result);

		x = 5;
		result = signOf(x);

		System.out.println("��� 3 : " + result);

	}

}

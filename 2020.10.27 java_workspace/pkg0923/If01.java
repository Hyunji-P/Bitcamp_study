package pkg0923;

public class If01 {

	public static void main(String[] args) {
		// ���� ���� ����
		int su = 9;

		if (su % 2 == 0) {
			System.out.println(su + "�� ¦��");
			System.out.println("ȣȣ");
		} else {
			System.out.println(su + "�� Ȧ��");
			System.out.println("����");
		}

		// �ܼ� if ����
		su = 9;
		if (su % 3 == 0) {
			System.out.println(su + "�� 3�� ����� �½��ϴ�.");
		}

		// ����) x = 3 , y = 5�� �� , �μ��� ���� 3�� ����̰ų� �Ǵ� 5�� ���������
		// ���� ���Ϸ� üũ�ϼ���.

		int x = 10, y = 5;

		// boolean bool = (x + y) % 3 == 0 || (x + y) % 5 == 0;

		if ((x + y) % 3 == 0 || (x + y) % 5 == 0) { // if(bool)
			System.out.println("x+y�� ���� 3�� ����̰ų� 5�ǹ�� �Դϴ�.");
		} else {
			System.out.println("");
		}
	}

}

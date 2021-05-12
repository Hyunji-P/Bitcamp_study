package pkg0922;

public class Condition01 {

	public static void main(String[] args) {
		// ���� ������ 
		// x�� y���� ũ�ٸ� 5�� , �ƴϸ� 3�� ����ϴ� ���α׷�

		int x = 3, y = 8;
		int result;

		result = x > y ? 5 : 3;

		System.out.println("���01 : " + result);

		// ����) a�� b���� ũ�� , ���� 5�� , �׷��� ������ a+2 �� ����ϴ� ���α׷� �ۼ�

		int a = 7, b = 98;

		result = a > b ? 5 : a + 2;

		System.out.println("���02 : " + result);

		// ����) x�� ¦���̸� x+3�� , Ȧ���̸� x�� ���� ���� ���
		x = 5;
		result = x % 2 == 0 ? x + 3 : x * x;

		System.out.println("���03 : " + result);

		// ����) �� �� �߿��� ū ���� ����ϱ�
		x = 4;
		y = 5;

		result = x - y > 0 ? x : y; // x > y ? x : y

		System.out.println("���04 : " + result);

		// ����) x�� y�� ����̸� "��"�� , �׷��� ������ "�ƴϿ�"�� ����ϱ�
		x = 7;
		y = 12;

		String result1 = y % x == 0 ? "��" : "�ƴϿ�"; // "��" , "�ƴϿ�"�� ���ڿ��̱� ������ string ������ �������ش�.

		System.out.println("���05 : " + result1);

		// ����) ���� �����ڸ� ����Ͽ� ���� 3�� ���� �߿��� ���� ū ���� ����ϼ���.
		// �ִ� �� ���� �̸� : max
		// x�� y�� ���� Ȧ���̸� x�� , ¦���̸� y�� ����� ������.

		x = 10;
		y = 44;
		int z = 78;
		int max;

		// ��ø ���� ������ 
		int large;
		large = x > y ? (x > z ? x : z) : (y > z ? y : z); // ���� x�� y�� �� �Ͽ� x�� ũ�� �� x�� z�� �� , y�� ũ�� �� y�� z�� �� �Ѵ�.
		System.out.println("���� ū �� : " + large);

		/*
		  max = y > z ? y : z; // x�� ���� ���� ��
		  
		  max = x > z ? x : z; // y�� ���� ���� ��
		  
		  max = x > y ? x : y; // z�� ���� ���� ��
		  
		  �� z�� �ִ� ���� �� max ���� ������ �Ұ��ϱ� ������ �ڵ� ������
		 */
		max = x > y ? x : y;
		max = max > z ? max : z; // max�� z�� �� �ϴ� ���� �ʿ�!!

		System.out.println(x + ", " + y + ", " + z + " �� �ִ� ���� " + max + "�Դϴ�.");

		result = (x + y) % 2 != 0 ? x : y;

		System.out.println("x = " + x + ", y = " + y + "�̹Ƿ�, ����� " + result + "�Դϴ�.");

	}

}

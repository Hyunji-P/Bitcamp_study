package pkg1021;

import java.util.Scanner;

public class MyException01 {

	public static void main(String[] args) {
		Scanner scan; // ���� Ŭ���� ���ǵ� �ܺ�

		// try, catch�� ������ �޼ҵ��� ����
		// x�� ��������
		int x;
		int y;

		try {
			// �ʱ�ȭ�� ����
			scan = new Scanner(System.in);
			x = 3;
			y = 0;
			int[] arr = { 10, 20, 30 };
			arr[3] = 50;// �迭 ��� �ε��� ����

			System.out.println(x / y);// 0���� ������ ����

			System.out.println("���� �߻��� ���� ������ �ȵǿ�.");

		} catch (ArithmeticException ex) {// ����Ŭ����
			System.out.println("0���� ������ �ȵ˴ϴ�.");

		} catch (ArrayIndexOutOfBoundsException ex) {// ����Ŭ����
			// �ε��� ������ ���� �����Ƿ� ù��° ��� ������ ����
			System.out.println("�迭 �ε��� ����");
			System.out.println("�޼��� : " + ex.getMessage());

			System.out.println("���ڿ� : " + ex.toString());
			System.out.println();

			ex.printStackTrace(); // ���ó����� �����Ͽ� ����Ʈ ���ش�.

		} catch (Exception ex) {// ����Ŭ���� ( �׻� �������� ���� �� )

			System.out.println("������ ��Ÿ ���");
		} finally {
			System.out.println("���� ������ ���� �˴ϴ�.");
		}

//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at pkg1021.MyException01.main(MyException01.java:9)
//		Exception : ���� , ArithmeticException : �Ҵ��� ó�����ִ� �� �� ������ ����� ���������(��ġ)

//	    3/0 ���� ������ ����� �ű� ������ ���� ������� �ϸ� if������ ����ó���� �ذ� �Ͽ���
//     	but , �츮�� try catch �� �ذ�

//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//		at pkg1021.MyException01.main(MyException01.java:10)

//		arr[3]���� 3�� �迭�� �������� ���ϴµ� 3��°�� ���� ������ �����߻��ϸ� �̰Ϳ� ���Ͽ� ����ó�� �ؾ���

	}

}

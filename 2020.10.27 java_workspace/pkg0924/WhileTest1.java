package pkg0924;

public class WhileTest1 {

	public static void main(String[] args) {
		/*
		 * while ������ ��� 3*1 = 3 3*2 = 6 ... 3*9 =27(�ٽ�Ǯ���)
		 * 
		 */

		int i = 1;
		int su = 3;

		while (i < 10) {

			String imsi = su + " * " + i + " = " + (su*i);

			System.out.println(imsi);

			i++;
		}

	}

}

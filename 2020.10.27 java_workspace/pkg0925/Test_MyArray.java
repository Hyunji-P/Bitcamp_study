package pkg0925;

public class Test_MyArray {

	public static void main(String[] args) {
//		������ ���� �迭�� ����ð� ����ϼ���.
//		���� : a[0] = 10, a[1] = 20, a[2] = 30
//		���� : int[] a = new int[3] ;
//		�迭 ���� : a[i] = ??
		
		
		System.out.println("����1)");

		int[] a = new int[3];

		for (int i = 0; i < a.length; i++) {
			a[i] = 10 * (i + 1);
			System.out.println("�迭 ���� : a[" + i + "] = " + a[i]);
		}
		
//		�迭 b�� ������ ���� ����ð�, ��ҵ��� ����ϼ���. 
//		���� : b  : 3, 8, 13, 18, ..., 98 
//		int[] b = new int[98/5+1] ;
//		�迭 ���� : b[i] = ??
				
				
		System.out.println();
		System.out.println("����2)");

		int[] b = new int[98 / 5 + 1];

		for (int i = 0; i < b.length; i++) {
			b[i] = 5 * i + 3;
			System.out.println("�迭 ���� : b[" + i + "] = " + b[i]);

		}
		
//		
//		�迭 c�� ������ ���� ����ð�, ��ҵ��� ����ϼ���. 
//		���� : c  : 92, 82, 72 ...12, 2
//		���� : int[] c = new int[92/10+1] ;
//		�迭 ���� : c[i] = ??
//				
				
		System.out.println();
		System.out.println("����3)");

		int[] c = new int[92 / 10 + 1];

		for (int i = 0; i < c.length; i++) {
			c[i] = 92 - 10 * i;
			System.out.println("�迭 ���� : c[" + i + "] = " + c[i]);

		}

	}

}

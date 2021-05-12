package pkg0925;

public class Test_MyArray {

	public static void main(String[] args) {
//		다음과 같은 배열을 만드시고 출력하세요.
//		문제 : a[0] = 10, a[1] = 20, a[2] = 30
//		정답 : int[] a = new int[3] ;
//		배열 수식 : a[i] = ??
		
		
		System.out.println("문제1)");

		int[] a = new int[3];

		for (int i = 0; i < a.length; i++) {
			a[i] = 10 * (i + 1);
			System.out.println("배열 수식 : a[" + i + "] = " + a[i]);
		}
		
//		배열 b를 다음과 같이 만드시고, 요소들을 출력하세요. 
//		문제 : b  : 3, 8, 13, 18, ..., 98 
//		int[] b = new int[98/5+1] ;
//		배열 수식 : b[i] = ??
				
				
		System.out.println();
		System.out.println("문제2)");

		int[] b = new int[98 / 5 + 1];

		for (int i = 0; i < b.length; i++) {
			b[i] = 5 * i + 3;
			System.out.println("배열 수식 : b[" + i + "] = " + b[i]);

		}
		
//		
//		배열 c를 다음과 같이 만드시고, 요소들을 출력하세요. 
//		문제 : c  : 92, 82, 72 ...12, 2
//		정답 : int[] c = new int[92/10+1] ;
//		배열 수식 : c[i] = ??
//				
				
		System.out.println();
		System.out.println("문제3)");

		int[] c = new int[92 / 10 + 1];

		for (int i = 0; i < c.length; i++) {
			c[i] = 92 - 10 * i;
			System.out.println("배열 수식 : c[" + i + "] = " + c[i]);

		}

	}

}

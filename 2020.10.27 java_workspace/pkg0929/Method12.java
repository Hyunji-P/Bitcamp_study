package pkg0929;
//메소드 오버로딩 문제 

public class Method12 {

	public static void main(String[] args) {
		int a = 5, b = 8, c = 4;
		int[] arr = { 20, 50, 10, 30 };

		// 오버로딩 : 3
		int result = min(a, b);
		System.out.println(result);

		result = min(a, b, c);
		System.out.println(result);

		result = min(arr);
		System.out.println(result);

	}

	// 1)조건연산자
	// 2)if 제어문
	// 3)Math.min() 메소드

	static int min(int a, int b) {
		int result = a < b ? a : b;
		return result;
		// return Math.min(a,b);
	}

	static int min(int a, int b, int c) {
		int result = a < b ? a : b;
		result = result < c ? result : c;
		return result;
		// int result = Math.min(a,b);
		// result = Math.min(result,c);
	}

	static int min(int[] arr) {
//		int min = arr[0];
		int result = 0;

//		for (int i = 1; i < arr.length; i++) {
//			if (min > arr[i]) {
//				result = arr[i];
//			}
//		}
		for (int i = 1; i < arr.length; i++) {
			result = Math.min(arr[i-1], arr[i]); 
		}

		return result;

	}
}

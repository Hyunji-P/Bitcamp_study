package pkg0928;

public class Method05 {

	public static void main(String[] args) {
		// 배열 요소들의 총합을 구해 주는 ArrSum 메소드 구현
		int[] arr = { 10, 20, 30 };// 배열
		int result = ArrSum(arr);
		System.out.println("결과 : " + result);

	}

	static int ArrSum(int[] abcd) {// int arr : 변수 , int [] arr : 배열
		int total = 0;
		for (int i = 0; i < abcd.length; i++) {
			total += abcd[i];
		}

		return total;

	}
}

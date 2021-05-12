package pkg0928;

public class SwapExam {

	public static void main(String[] args) {

		int x = 3, y = 4;
		int temp;

		temp = x;
		x = y;
		y = temp;

		System.out.println("x : " + x);
		System.out.println("y : " + y);

		// 다시 풀어보기
		x = 3;
		y = 4;
		int z = 5;

		// 여기에 코딩
		temp = z; // 5
		z = y; // 4
		y = x; // 3
		x = temp; // 5

		System.out.println("x : " + x);// 5
		System.out.println("y : " + y);// 3
		System.out.println("z : " + z);// 4

		int[] arr = { 1, 2, 3, 4 };

		// 문제) 배열 요소들의 값을 거꾸로 뒤집어서 출력하시오.
		// 배열 요소들을 swap 기법을 이요항 값들을 서로 맞 바꾸면 된다.

		int cnt = arr.length / 2; // swap 횟수
		System.out.println("배열 요소 뒤집기");

		for (int i = 0; i < cnt; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i]; 
			arr[arr.length - 1 - i] = temp;

		}

		System.out.println("배열 요소 출력하기");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}

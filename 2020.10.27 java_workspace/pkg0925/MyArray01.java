package pkg0925;

public class MyArray01 {
	// 배열
	public static void main(String[] args) {
		// main 메소드 실행시 하하, 호호를 입력하면 String[] args라는 배열에 저장
		// new 연산자 기법

		int z = 0; // 지역 변수(일반변수)는 반드시 초기화가 필요합니다.
		System.out.println(z);

		int x = 3;
		int y = 5;
		// 정수 3개를 저장 가능한 배열 만들기
		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); // 배열은 초기값이 정해져있다. 

		}
		System.out.println("배열 요소 갯수 : " + arr.length);

		arr[0] = x - y + 6;
		arr[2] = arr[0] + 3;
		arr[1] = arr[0] + arr[2];

//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);

		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			total = arr[i];
		}
		System.out.println("총합 01 : " + total);

		// 초기화 기법
		String[] soshi = { "태연", "효연", "티파니" };
		for (int i = 0; i < soshi.length; i++) {
			System.out.println(soshi[i]);

		}

	}

}

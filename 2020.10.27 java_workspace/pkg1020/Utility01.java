package pkg1020;

import java.util.Random;

//요소의 개수가 5개인 정수형 배열 arr를 선언합니다.
//1부터 10까지의 정수 중에서 임의의 값을 배열 요소에 대입합니다.
//각 요소의 총합을 구해보세요.
//예시) 4 6 7 3 9 --> 29
public class Utility01 {

	public static void main(String[] args) {
		int[] arr = new int[5];

		Random rand = new Random();

		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10) + 1;
			total += arr[i];

			if (i == arr.length - 1) {
				System.out.print(arr[i] + " = ");
			} else {
				System.out.print(arr[i] + " + ");
			}

		}
		System.out.println(total);

	}

}

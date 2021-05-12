package pkg0928;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// 요소가 5개인 배열을 정의하고,
		// 스캐너를 이용하여 값들을 입력 받습니다.
		// 요소들의 홀수의 총합과 짝수의 총합을 출력하는 프로그램

		// 입력된수
		// 5
		// 4
		// 6
		// 6
		// 7

		// 홀수의 합 : 12
		// 짝수의 합 : 16

		int[] num = new int[5];
		int odd = 0, even = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요.");

		for (int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();

			if (num[i] % 2 == 0) {
				even += num[i];
			} else {
				odd += num[i];
			}

		}
		System.out.println("홀수의 합 : " + odd);
		System.out.println("짝수의 합 : " + even);

	}

}

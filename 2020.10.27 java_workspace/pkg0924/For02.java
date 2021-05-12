package pkg0924;

public class For02 {

	public static void main(String[] args) {
		// 1부터 10까지의 홀수와 짝수의 총합 각각 구하기

		int odd = 0, even = 0;

		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}

		}
		System.out.println("홀수의 총합 : " + odd);
		System.out.println("짝수의 총합 : " + even);

		// while 구문으로 풀어보자.

		odd = 0;
		even = 0;

		int j = 1;

		while (j < 11) {
			if (j % 2 == 0) {
				even += j;
			} else {
				odd += j;
			}
			j++;

		}
		System.out.println("홀수의 총합 : " + odd);
		System.out.println("짝수의 총합 : " + even);

	}

}

package pkg0924;

public class Test_Sum01 {

	public static void main(String[] args) {
//		1부터 10까지의 정수중에서
//		i가 홀수이면 각 값에 3을 더한 결과의 총합
//		(1+3)+(3+3)+(5+3)+(7+3)+(9+3)=40
//		i가 짝수이면 각 값의 제곱에 -1을 한 값의 총합
//		(4-1)+(16-1)+(36-1)+(64-1)+(100-1)=215
//		를 출력해주는 프로그램 작성

		int sumA = 0;
		int sumB = 0;

		for (int i = 1; i < 11; i++) {
			if (i % 2 != 0) {
				sumA += (i + 3);
			} else {
				sumB += (i * i - 1);
			}
		}

		System.out.println("총 합 : " + sumA);
		System.out.println("총 합 : " + sumB);

	}

}

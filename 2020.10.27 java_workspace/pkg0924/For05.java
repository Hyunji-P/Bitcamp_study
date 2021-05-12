package pkg0924;

public class For05 {

	public static void main(String[] args) {
		// 1부터 10까지의 정수 중에서
		// 3의 배수 이거나 5의 배수인 항목들의 총합구하기

		int sum = 0;

		for (int i = 1; i < 11; i++) {

			boolean bool = i % 3 == 0 || i % 5 == 0;

			if (bool) {
				sum += i;

			}

		}
		System.out.println(sum);

//		
//		1부터 50까지의 정수 중에서 
//		sumB 3의 배수의 총합 = 3+6+9+...+48 
//		sumA 3의 배수가 아닌 수의 총합 = 1+2+4+...+50
//		

		int sumA = 0, sumB = 0;

		for (int i = 1; i < 51; i++) {
			if (i % 3 == 0) {
				sumB += i;
			} else {
				sumA += i;
			}

		}

		System.out.println("결과 sumA - sumB : " + (sumA - sumB));

	}

}

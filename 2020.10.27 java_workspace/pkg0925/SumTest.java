package pkg0925;

public class SumTest {

	public static void main(String[] args) {
//		  문제) 1부터 10까지의 정수 중에서 
//			   3의 배수의 합 : 3+6+9 = 18 
//			   3의 배수가 아닌 숫자 중 5이상인 수 중에서 8을 제외한 수의 총합 : 5+7+10 = 22
//			   3의 배수가 아닌 숫자 중 5미만의 수의 총합 : 1+2+4 = 7

		int sumA = 0, sumB = 0, sumC = 0;

		for (int i = 1; i < 11; i++) {
			if (i % 3 == 0) {
				sumA += i;
			} else if (i % 3 != 0 && i >= 5 && i != 8) {
				sumB += i;

			} else if (i % 3 != 0 && i < 5) {
				sumC += i;
			}

//			if (i % 3 == 0) {
//				sumA += i;
//			} else {// 3의 배수가 아니면
//				if (i >= 5) { // 5이상이면
//					if (i != 8) {
//						sumB += i;
//					}
//
//				} else {// 5미만
//					sumC += i;
//				}
//			}

		}
		System.out.println("sum A 의 총합 " + sumA);
		System.out.println("sum B 의 총합 " + sumB);
		System.out.println("sum C 의 총합 " + sumC);
	}

}

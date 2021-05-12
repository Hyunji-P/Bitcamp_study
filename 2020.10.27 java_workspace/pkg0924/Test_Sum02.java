package pkg0924;

public class Test_Sum02 {

	public static void main(String[] args) {
//		총합계 구하기
//		1-1/2+1/3-1/4+ … +1/99-1/100의 합을 구하시오.
//		조건 연산자 혹은 양자 택일 if를 사용하여 덧셈하시오.
//		총합 += 짝수이면 ? 빼기 : 더하기 ;
//
//		총합을 구할 변수의 이름은 total으로 선언한다.
//		총합 =  0.6881721…

		// 양자택일 if문으로 풀어보기
		int i = 1;
		double odd = 0; // 홀수 저장 변수
		double even = 0; // 짝수 저장 변수
		double total = 0; // 총합

		
		while (i < 101) {
			if (i % 2 != 0) {
				odd += (double) 1 / i;
			} else {
				even -= (double) 1 / i;
			}
			i++;

		}

		total = odd + even;

		System.out.println("총 합 = " + total);

		// 조건연산자로 풀어보기
		i = 1;
		total = 0;
		double value = 0;

		while (i < 101) {
			value = (double) 1 / i;
			value = i % 2 == 0 ? -value : value;
			total += value;
			i++;
		}
		

		System.out.println("총 합 = " + total); 

	}

}
// 부동소수점 방식으로 편차가 약간 발생할 수 있음 ...결과값은 무시 
// 부동소수점 : 컴퓨터에서 실수를 표현하는 방식이다.
//          : 모든 언어와 관련 있음.java ,c,파이썬 등 모두 실수를 표현할 때는 부동 소수점 방식을 사용함.
//컴퓨터 dobule은 8바이트 64비트를 사용합니다.
//
//이 64비트로 무한대의 실수를 다 표현할수가 없다.
//
//따라서, 정밀도를 표기한 방법이라 오차가 생길 수 있다.


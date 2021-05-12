package pkg0923;

/*다시 풀어보기*/
public class Test_MyPay {
//	8시간 까지는 시급이 5000원이고, 8시간 초과분에 대해서는 1.5배의 시급을 지급하는 알바가 있다.
//	예를 들어서 5시간 근무이면 임금 = 5000 * 5 =  25000이다.
//	15시간 근무이면 임금 = 5000 * 8 + 5000 * 1.5 * 7  = 92500이다.
//	
//	출력 예시
//	15시간 근무시의 임금
//	임금은 92500입니다.

	public static void main(String[] args) {
		System.out.println("문제1)");
		int RATE = 5000;
		double pay;
		int hours = 15;
		
		//double FIRST = 8.0; 임금시간이 변하면 여러 부분을 수정해야 하기때문에
		//					  변수를 정해주는게 바람직하다.

		if (hours > 8) {
			pay = RATE * 8 + RATE * (hours - 8) * 1.5;
		} else {
			pay = RATE * hours;
		}
		System.out.println(hours + "시간 근무 시의 임금은 " + (int) pay + "원 입니다.");

//		추가 문제 
//		근무 시간   기본 시급 
//		1 ~ 10      5,000원
//		11 ~ 20     기본 시급의 1.5배 
//		21 이상     기본 시급의 2.0배 
//
//		예시 
//		 5시간 근무  = 5000 * 5 =  25,000원
//		15시간 근무  = 5000 * 10 + 5000 * 1.5 * 5 = 87,500원
//		25시간 근무  = 5000 * 10 + 5000 * 1.5 * 10 + 5000 * 2.0 * 5 = 175,000원
//		double FIRST = 10.0; 임금시간이 변하면 여러 부분을 수정해야 하기때문에
//					        변수를 정해주는게 바람직하다.

		System.out.println("문제2)");
		if (hours >= 1 && hours <= 10) {
			pay = RATE * hours;
		} else if (hours >= 11 && hours <= 20) {
			pay = RATE * 10 + RATE * (hours - 10) * 1.5;
		} else if (hours >= 21) {
			pay = RATE * 10 + RATE * 10 * 1.5 + RATE * (hours - 20) * 2.0;
		}
		System.out.println("임금 : " + (int) pay + "원");

	}

}

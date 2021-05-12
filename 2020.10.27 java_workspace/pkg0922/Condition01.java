package pkg0922;

public class Condition01 {

	public static void main(String[] args) {
		// 조건 연산자 
		// x가 y보다 크다면 5를 , 아니면 3을 출력하는 프로그램

		int x = 3, y = 8;
		int result;

		result = x > y ? 5 : 3;

		System.out.println("결과01 : " + result);

		// 문제) a가 b보다 크면 , 숫자 5를 , 그렇지 않으면 a+2 를 출력하는 프로그램 작성

		int a = 7, b = 98;

		result = a > b ? 5 : a + 2;

		System.out.println("결과02 : " + result);

		// 문제) x가 짝수이면 x+3을 , 홀수이면 x의 제곱 값을 출력
		x = 5;
		result = x % 2 == 0 ? x + 3 : x * x;

		System.out.println("결과03 : " + result);

		// 문제) 두 수 중에서 큰 수를 출력하기
		x = 4;
		y = 5;

		result = x - y > 0 ? x : y; // x > y ? x : y

		System.out.println("결과04 : " + result);

		// 문제) x가 y의 약수이면 "예"를 , 그렇지 않으면 "아니요"를 출력하기
		x = 7;
		y = 12;

		String result1 = y % x == 0 ? "예" : "아니요"; // "예" , "아니요"는 문자열이기 때문에 string 변수를 지정해준다.

		System.out.println("결과05 : " + result1);

		// 문제) 조건 연산자를 사용하여 다음 3개 숫자 중에서 가장 큰 수를 출력하세요.
		// 최대 값 변수 이름 : max
		// x와 y의 합이 홀수이면 x를 , 짝수이면 y를 출력해 보세요.

		x = 10;
		y = 44;
		int z = 78;
		int max;

		// 중첩 조건 연산자 
		int large;
		large = x > y ? (x > z ? x : z) : (y > z ? y : z); // 먼저 x와 y를 비교 하여 x가 크면 → x와 z를 비교 , y가 크면 → y와 z를 비교 한다.
		System.out.println("제일 큰 수 : " + large);

		/*
		  max = y > z ? y : z; // x가 가장 작을 때
		  
		  max = x > z ? x : z; // y가 가장 작을 때
		  
		  max = x > y ? x : y; // z가 가장 작을 때
		  
		  → z가 최대 값일 때 max 값에 지정이 불가하기 때문에 코딩 오류임
		 */
		max = x > y ? x : y;
		max = max > z ? max : z; // max와 z도 비교 하는 식이 필요!!

		System.out.println(x + ", " + y + ", " + z + " 중 최대 수는 " + max + "입니다.");

		result = (x + y) % 2 != 0 ? x : y;

		System.out.println("x = " + x + ", y = " + y + "이므로, 결과는 " + result + "입니다.");

	}

}

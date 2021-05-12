package pkg0923;

public class LargeTest {

	public static void main(String[] args) {
		int su1 = 105;
		int su2 = 300;
		// 두개의 정수 중 큰 수를 출력해 보세요.
		if (su1 > su2) {
			System.out.println(su1);
		} else {
			System.out.println(su2);
		}

		int x = 5, y = 10;
		// x는 y의 약수인지 확인하는 프로그램을 작성하세요.
		if (y % x == 0) {
			System.out.println(x + "는(은) " + y + "의 약수입니다.");
		} else {
			System.out.println(x + "는(은) " + y + "의 약수가 아닙니다.");
		}

		// 문제) 미성년자 체크 : 19세 이상이 성년이라고 가정
		// 출력 예시 : 13세인 '홍길동'은 "미성년자"입니다.
		String name;
		int age;

		name = "홍길동";
		age = 25;

		if (age >= 1 && age < 19) {
			System.out.println(age + "세인 \'" + name + "\'은 \"미성년자\"입니다.");
		} else {
			System.out.println(age + "세인 \'" + name + "\'은 \"성년\"입니다.");
		}

		// 문제) su가 3의 배수이면 제곱수를 , 아니면 더하기 5한 결과를 출력하세요.
		int su = 9;

		if (su % 3 == 0) {
			su = su * su;
			System.out.println(su);
		} else {
			su = su + 5;
			System.out.println(su);
		}

	}

}

package pkg0923;

public class If01 {

	public static void main(String[] args) {
		// 양자 택일 구문
		int su = 9;

		if (su % 2 == 0) {
			System.out.println(su + "는 짝수");
			System.out.println("호호");
		} else {
			System.out.println(su + "는 홀수");
			System.out.println("하하");
		}

		// 단순 if 구문
		su = 9;
		if (su % 3 == 0) {
			System.out.println(su + "는 3의 배수가 맞습니다.");
		}

		// 문제) x = 3 , y = 5일 때 , 두수의 합이 3의 배수이거나 또는 5의 배수인지를
		// 양자 택일로 체크하세요.

		int x = 10, y = 5;

		// boolean bool = (x + y) % 3 == 0 || (x + y) % 5 == 0;

		if ((x + y) % 3 == 0 || (x + y) % 5 == 0) { // if(bool)
			System.out.println("x+y의 합은 3의 배수이거나 5의배수 입니다.");
		} else {
			System.out.println("");
		}
	}

}

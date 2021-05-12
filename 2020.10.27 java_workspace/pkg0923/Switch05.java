package pkg0923;

public class Switch05 {

	public static void main(String[] args) {
		// switch case 구문 주사위
		// 주사위 눈이 짝수인지 홀수인지 판단
		// 만약 다른 숫자 입력 시 error이라고 출력

		int su = 7;

		System.out.println("케이스 01");
		switch (su) {
		case 1:
			System.out.println("홀수");
			break;
		case 2:
			System.out.println("짝수");
			break;
		case 3:
			System.out.println("홀수");
			break;
		case 4:
			System.out.println("짝수");
			break;
		case 5:
			System.out.println("홀수");
			break;
		case 6:
			System.out.println("짝수");
			break;
		default:
			System.out.println("Error");
			break;
		}
		su = 3;
		System.out.println("케이스 02");
		switch (su) {
		case 1:
		case 3:
		case 5:
			System.out.println("홀수");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("짝수");
			break;
		default:
			System.out.println("Error");
			break;
		}
	}
}

package pkg0928;

public class Method04 {
	static int signOf(int x) {

		int result;
		if (x > 0) {
			return 1;// 다중 택일 구문에서는 3개 중 1개는 무조건 실행 , 3개 중 2개가 오버랩 되지 않음
						// 3개 조건 중 1가지를 만족하면 문장이 종료되기 때문에 논리적으로 return은 1번임
		} else if (x < 0) {
			return -1;
		} else {
			return 0;
		} // ruturn 반환할 값;

	}

	public static void main(String[] args) {
		// x가 양수이면 1, 음수이면 -1 , 0이면 0을 출력해주는 메소드 signOf 구현하기
		
		System.out.println(Math.signum(5.0));
		

		int x = -12;
		int result = signOf(x);
		System.out.println("결과 1 : " + result);

		x = 0;
		result = signOf(x);
		System.out.println("결과 2 : " + result);

		x = 5;
		result = signOf(x);

		System.out.println("결과 3 : " + result);

	}

}

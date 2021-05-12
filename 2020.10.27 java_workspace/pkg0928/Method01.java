package pkg0928;

public class Method01 {
	// 정수 2개를 매개변수로 입력 받는 메소드 calc를 정의 합니다.
	// 이 메소드는 반환 타입이 정수형입니다.
	static int calc(int a, int b) {// 메소드 정의부분 , 호출 받는쪽의 a,b를 형식 매개 변수(사본)
		int result = 2 * a + 3 * b - 3;
		return result; //return 메소드 종료함을 의미 , return 구문 이후에 추가 코딩 시 오류
	}

	public static void main(String[] args) {
		int x1 = 3;
		int x2 = 2;
		int y = 2 * x1 + 3 * x2 - 3; // 반복이 되면 method 사용하여 호출
		System.out.println("y1 = " + y);

		x1 = 2;
		x2 = 5;
		y = 2 * x1 + 3 * x2 - 3;
		System.out.println("y2 = " + y);

		y = calc(3, 2);// 메소드 호출 , 호출을 하는 쪽의 x1, x2는 실 매개 변수(원본)
		System.out.println("y3 = " + y);

		y = calc(2, 5);
		System.out.println("y4 = " + y);
		
		
	}

}

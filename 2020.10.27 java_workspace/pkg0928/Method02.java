package pkg0928;

public class Method02 {
	static int add(int a, int b) {// 메소드 작성(선언)
		int result = a + b;
		return result;

	}

	public static void main(String[] args) {
		// 2개의 정수를 매개 변수로 입력 받아서 덧셈을 구현해주는 메소드 add 구현
		int x = 5, y = 7;
		int result = add(x, y);// 메소드 호출
		System.out.println("결과1 : " + result);// result 이용해서 호출
		System.out.println("결과2 : " + add(10, 20));// 바로 호출

		for (int i = 1; i <= 3; i++) {
			result = add(x, i);//호출 3번 발생 
			System.out.println("결과3 : " + result);// 바로 호출
		}

	}

}

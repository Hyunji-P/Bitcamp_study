package pkg0921;

public class Add {

	public static void main(String[] args) {
		
		
//		int x = 3; 선언과 값 할당을 동시 가능하다. 
		
		
		int x; // 정수를 담을려고 변수 x를 정의/선언한다.
		int y;
		int z;

		// = 기호는 대입 연산자라고 한다.
		x = 3; // x의 값을 3으로 대입/할당/지정한다.
		y = 5;
		z = x + y;

		System.out.println("y = " + y);
		System.out.println("z = " + z);

		x = 6; // 변수는 중간 중간 값이 바뀔 수 있다.
		y = 2;
		System.out.println("x = " + x);
		z = x * y;

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);

		//문제 
		x = 1; // 변수는 중간 중간 값이 바뀔 수 있다.
		y = 2;
		z = 2 * x + 3 * y - 4;

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);

	}

}

package pkg1021;

import java.util.Scanner;

public class MyException01 {

	public static void main(String[] args) {
		Scanner scan; // 따라서 클래스 정의도 외부

		// try, catch를 각각의 메소드라고 볼때
		// x는 지역변수
		int x;
		int y;

		try {
			// 초기화는 내부
			scan = new Scanner(System.in);
			x = 3;
			y = 0;
			int[] arr = { 10, 20, 30 };
			arr[3] = 50;// 배열 요소 인덱스 문제

			System.out.println(x / y);// 0으로 나누기 문제

			System.out.println("문제 발생시 저는 실행이 안되요.");

		} catch (ArithmeticException ex) {// 서브클래스
			System.out.println("0으로 나누면 안됩니다.");

		} catch (ArrayIndexOutOfBoundsException ex) {// 서브클래스
			// 인덱스 문제가 먼저 터지므로 첫번째 사건 수습만 나옴
			System.out.println("배열 인덱스 오류");
			System.out.println("메세지 : " + ex.getMessage());

			System.out.println("문자열 : " + ex.toString());
			System.out.println();

			ex.printStackTrace(); // 스택내용을 추적하여 프린트 해준다.

		} catch (Exception ex) {// 수퍼클래스 ( 항상 마지막에 써줄 것 )

			System.out.println("나머지 기타 등등");
		} finally {
			System.out.println("나는 무조건 실행 됩니다.");
		}

//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at pkg1021.MyException01.main(MyException01.java:9)
//		Exception : 예외 , ArithmeticException : 불능을 처리해주는 것 → 문제가 생기면 막아줘야함(조치)

//	    3/0 에서 에러가 생기는 거기 때문에 예전 방식으로 하면 if문으로 예외처리를 해결 하였음
//     	but , 우리는 try catch 로 해결

//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//		at pkg1021.MyException01.main(MyException01.java:10)

//		arr[3]에서 3은 배열의 번지수를 말하는데 3번째가 없기 때문에 에러발생하며 이것에 대하여 예외처리 해야함

	}

}

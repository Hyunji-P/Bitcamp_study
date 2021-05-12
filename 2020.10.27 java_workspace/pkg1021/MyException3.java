package pkg1021;

public class MyException3 {

	// third() 메소드에서 예외처리를 해야하나 상위 스택으로 계속 떠 넘길 수 있음
	// → throws 키워드 사용
	// 에러 -> 후입선출(LIFO) , 나중에 들어간게 먼저 나옴
	public static void main(String[] args) {
		// main 메소드도 예외처리를 하기 싫으면 떠넘길수 있고, 떠넘기면 JVM(자바가상머신)이 책임져야함
		try {
			//try절 주석 막고 하위 두줄만 풀면 자바시스템에서 printStackTrace()를 실행함
			String xx = "aa";
			first(xx); // first() 메소드 호출

		} catch (ArithmeticException e) {
			System.out.println("0으로 나누지마");
		} catch (NumberFormatException e) {
			System.out.println("잘못된 숫자 형식이야");
		} catch (Exception e) {
			System.out.println("나머지 예외");
		}
	}

	static void first(String xx) throws ArithmeticException, NumberFormatException {
		int x = Integer.parseInt(xx);
		// 문자 aa를 정수값으로 바꾸려고 하니 NumberFormatException 발생
		second(); // second() 메소드 호출
	}

	static void second() throws ArithmeticException {
		third(); // third() 메소드 호출
	}

	static void third() throws ArithmeticException {
		int i = 1, j = 0;
		System.out.println(i / j);
	}

}

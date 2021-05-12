package pkg0929;

public class MethodOverLoading {

	public static void main(String[] args) {
		Add(1, 2); // 1번 : 정수형 매개변수 2개
		double result = Add(3.0, 4.0); // 3번 : 실수형 매개변수 2개 ,반환타입 변수이름 = Add메소드
		System.out.println(result);
		Add(10, 20); // 2번 : 정수형 매개변수 2개 - 1번과 2번은 오버로딩이 아님
		Add(1, 2, 3); // 4번 : 정수형 매개 변수 3개

	}

	static void Add(int x, int y) {
		System.out.println("a");
		int result = x + y;
		System.out.println(result);

	}

	static double Add(double x, double y) {// Add(int x, int y)주석이면 1번과 2번이 실수형으로 암시적 캐스팅 되서 들어감
		System.out.println("b");
		double result = x + y;
		return result;
	}

	static void Add(int x, int y, int z) {
		System.out.println("c");
		int result = x + y + z;
		System.out.println(result);

	}

}

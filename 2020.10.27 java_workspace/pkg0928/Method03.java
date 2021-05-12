package pkg0928;

public class Method03 {
	static int max(int a, int b, int c) {
		int result = a > b ? (a > c ? a : c) : (b > c ? b : c);

		return result; // 반환 타입이 있으면 마지막 결과를 반환 시킨다.

	}

	//수학이라는 Math 클래스 
	static int min(int a, int b, int c) {
		int result1 = Math.min(a, b);//a < b ? a : b;
		result1 =  Math.min(result1, c);

		return result1; // 반환 타입이 있으면 마지막 결과를 반환 시킨다.

	}

	public static void main(String [] args) {
		// 다음 3개의 정수 중에서 가장 큰 수를 반환해주는 메소드 max 구현하기
		// 다음 3개의 정수 중에서 가장 큰 수를 반환해주는 메소드 min 구현하기

		int x = 3, y = 5, z = 10;

		int result = max(x, y, z);
		int result1 = min(x, y, z);

		System.out.println("최대값 : " + result);
		System.out.println("최소값 : " + result1);

	}

}

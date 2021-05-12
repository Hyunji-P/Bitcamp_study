package pkg0929;

//jegob(3,6) = 3*3 + 6*6 
//max(3,6) = 큰수 6
//sub(수1, 수2) = 수1 - 수2;
//square(x) = x * x

public class Method13 {

	public static void main(String[] args) {
		int x = 3, y = 6;

		int res1 = jegob(x, y);
		int res2 = max(x, y);
		System.out.println(res1);
		System.out.println(res2);
		sub(res1, res2);

	}

	static int square(int x) { //내가 만든 메소드안에서 호출된 메소드를 받을 수 있음 
		return x * x;
	}

	static int jegob(int x, int y) {
		return square(x) + square(y);// return x * x + y * y; x*x 도 중복이 되기 때문에 하나의 메소드로 만들 수 있음
									 // 내가 만든 메소드안에 또 메소드를 호출 할 수 있음 
	}

	static int max(int x, int y) {

		return x > y ? x : y;
	}

	static void sub(int x, int y) {
		int result = x - y;
		System.out.println(result);

	}

}

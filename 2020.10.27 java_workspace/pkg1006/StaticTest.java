package pkg1006;

public class StaticTest {
	int x = 100; // 인스턴스 변수
	static int y = 200;

	static void add(int x, int y) {
		int result = x + y;
		System.out.println(result);
	}

	void hello(String aa) {
		System.out.println(aa);
	}

	public static void main(String[] args) {// static 메소드
		StaticTest obj = new StaticTest();
		System.out.println(obj.x);
		// ① System.out.println(x) ;
		// main 메소드 : static 는 인스턴스 변수 x를 참조 할 수 없다.

		System.out.println(StaticTest.y);
		// ② static 변수는 클래스 변수여서 클래스 이름으로 접근 가능하다.

		add(10, 20);
		// ③ add(10,20); : static 메소드
		// 위에 void add(int x, int y) : 인스턴스 메소드여서 참조 불가능

		obj.hello("안녕하세요.");
		// ④ 인스턴스 메소드를 수정을 안하고 객체.메소드이름(매개변수)해도 가능함
		
		

	}
}

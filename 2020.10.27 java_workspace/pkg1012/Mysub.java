package pkg1012;

// 서브 클래스 
public class Mysub extends Mysuper {
//extends : 상속 

	int y = 200;

	public Mysub() {
		// super(); 암시적으로 숨어 있음
		System.out.println("a");
	}

	// 김철수를 수퍼클래스 변수에 넣고 싶을 때
	public Mysub(String name) {
		// 개발자가 명시적으로 구현하면 super구문은 사라짐
		super(name);
		super.setName(name);

		System.out.println("c");
	}
}

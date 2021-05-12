package pkg1012;

public class Child05 extends Mother05 {

	public Child05(String name, int age) {
		super(name, age);

	}
	
	// * 오버로딩
	public Child05(int x, int y) {
		this.overload(x, y);
		this.overload(x);

	}

	private void overload(int x, int y) {
		// 두 수의 총합
		int result = x + y;
		System.out.println("총합01 : " + result);

	}

	private void overload(int x) {
		// 1부터 x까지의 총합
		int total = 0;
		for (int i = 1; i <= x; i++) {
			total += i;
		}
		System.out.println("총합02 : " + total);
	}

	public void getData() {
		super.Display();// 수퍼 클래스 호출
		// 제시카는 20살입니다 출력
		this.Display();// 서브 클래스 호출
		// 이름 : 제시카 , 나이 : 20 출력
	}

//	*오버라이딩 방법
//	*시그니처 그대로 복사 
//	public void Display() { 부모클래스
//		String imsi = "%s는 %d살 입니다.";
//		System.out.printf(imsi, this.name, this.age);
//	}

	// 어노테이션(annotation) : 사용자에게 무엇인가를 설명하기 위한 고급 주석
	@Override // 어노테이션 : 이 메소드는 오버라이딩 되었다.
	public void Display() {
		String imsi = "이름 : %s, 나이 : %d";
		System.out.printf(imsi, super.getName(), super.getAge());
		System.out.println();
	}

}

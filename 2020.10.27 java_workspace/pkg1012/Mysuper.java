package pkg1012;

//수퍼클래스
public class Mysuper {
	int x = 100;
	private String name;

	//① 첫번째 setter 사용 
	public void setName(String name) {
		this.name = name;
	}

	//② 두번째 : 개발자가 명시적으로 구현하여 생성자 오버로딩 
	public Mysuper(String name) {// 부모의 생성자
		this.name = name;
	}

	public Mysuper() {// 부모의 생성자
		System.out.println("b");
	}

	// 상속 불가능한 변수
	private String hello = "안녕하세요.";

	// private 로 접근지정을 했으면 공개적으로 접근 가능한 메소드를 만듬
	public void sayhello() {
		System.out.println("인사말 : " + this.hello);

	}

}

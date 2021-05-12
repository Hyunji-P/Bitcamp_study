package pkg1013;

public class Mysub extends Mysuper {
	int b = 200;

	public void hoho() {
		System.out.println("호호");
	}

	@Override
	public void Display() {
		super.Display(); // 메소드 은닉화로 가려진 수퍼클래스를 호출하고 싶을때
		System.out.println("abcd");
	}

}

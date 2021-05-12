package myunicon;

public class UniconMain {

	public static void main(String[] args) {
		Unicon dol = new Unicon("유니돌", 5);
		dol.fly();
		dol.run();

		// static 변수는 클래스 이름으로 접근이 가능한 클래스 변수이고 [인터페이스이름.변수이름]으로 접근가능
		System.out.println("말의 속도 : " + Horse.speed);
		System.out.println("새의 속도 : " + Bird.speed);

	}

}

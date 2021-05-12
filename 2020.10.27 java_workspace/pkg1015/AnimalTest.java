package pkg1015;

public class AnimalTest {

	public static void main(String[] args) {
		//배열 선언
		//다만 , 승급 시 수퍼 클래스로 사용 가능하다.
		Animal[] animal = new Animal[3];

		// 승급
		animal[0] = new Lion("사자", "아프리카 초원");
		animal[1] = new Eagle("독수리", "하늘");
		animal[2] = new Goldfish("금붕어", "어항");

		for (int i = 0; i < animal.length; i++) {
			animal[i].move();
		}

		//불완전한 클래스여서 스스로 객체생성이 불가
		//new 연산자 다음에 자기 자신만 못씀 , 나머지는 가능
//		Animal ani = new Animal();

	}

}

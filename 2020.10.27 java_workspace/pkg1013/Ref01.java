package pkg1013;

class Animal {
	int x = 100;

	public void cry() { // 동작 구현
		System.out.println("동물이 짖는다.");

	}

	@Override
	public String toString() {
		String imsi = "동물 : " + this.x + "마리";
		return super.toString() + "\n" + imsi;// 1번 + 2번
		// super.toString() → Object 클래스 toString 호출
		// Animal → 서브 클래스(오버라이딩 되어있음)
	}

}

class Dog extends Animal {
	int y = 200;

	@Override
	public String toString() {
		String imsi = "강아지 : " + this.y + "마리";// 3번
		return super.toString() + "\n" + imsi;
		// super.toString() → Animal 수퍼 클래스의 toString 호출 , Dog → 서브 클래스
		// toString 호출되고 그다음 "\n" + imsi 실행

	}
}

class Cat extends Animal {
	@Override
	public void cry() {
		System.out.println("고양이가 야옹하고 웁니다.");
	}

}

public class Ref01 {// 클래스이름이 파일이름과 같아야한다.

	public static void main(String[] args) {
		Animal animal = new Dog(); // 승급
		System.out.println(animal.x);
		// System.out.println(animal.y); //한시적으로 안보임

		// toString() 메소드
		// 최상위 Object클래스에서 animal이 상속받고 있음 → 뒤에 .toString
		// 출력 할때 정보가 출력되나 Animal 클래스에서 오버라이딩으로 출력결과를 바꾸고 싶음
		System.out.println(animal);
		// animal 태생이 Dog니까 Dog클래스에서 toString 메소드가 있는 지 찾음

		animal.cry(); // 상속을 받고 있으므로 수퍼클래스 cry()메소드 호출
		showData(animal);// animal 태생이 Dog임

		// 동물 2마리를 저장할 배열 정의
		Animal[] myani = new Animal[2];

		// 객체 생성
		myani[0] = new Dog();
		myani[1] = new Cat();

		for (int i = 0; i < myani.length; i++) {
			showData(myani[i]);
		}
	}

	private static void showData(Animal animal) {
		if (animal instanceof Dog) {
			System.out.println("강아지");
			Dog dog = (Dog) animal;
			System.out.println("dog.x : " + dog.x);
			System.out.println("dog.y : " + dog.y);

			dog.cry();
			// dog.cry() 오버라이딩이 안되어있음
			// 어떤 메소드가 수퍼에만 존재하는 경우
			// 상속을 받고 있으므로, 수퍼 클래스의 메소드가 실행이 된다.
		} else if (animal instanceof Cat) {
			System.out.println("고양이");
			Cat cat = (Cat) animal;
			System.out.println("cat.x : " + cat.x);// 고양이는 y가 없음

			cat.cry();
			// cat.cry() 오버라이딩이 되어있음
			// 서브 클래스의 메소드가 우선적으로 실행 된다.
		} else {
			System.out.println("some animal");
		}

	}

}

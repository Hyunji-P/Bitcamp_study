package pkg1013;

public class RefMain {

	public static void main(String[] args) {
		// 이전 방식
		Book java = new Book("자바", 100);
		Sawon kim = new Sawon("김철수", "영업");

		// 레퍼런스 형변환
		RefCasting ref01 = new Book("jsp", 200);// 승급 , ref 는 지역변수
		RefCasting ref02 = new Sawon("박영희", "판매");// ref 는 지역변수

		Display(ref01);// 책
		Display(ref02);// 사원

	}

	// 매개 변수 obj는 보편적이고 두루뭉실하게 적용할 수 있는 이름으로 사용 권장
	private static void Display(RefCasting obj) {
//		System.out.println(obj);
		// obj 객체 : 객체 이름을 출력한다는 것은 암시적으로 toString() 메소드를 호출하는 것 이다.
		if (obj instanceof Book) {
			// obj가 book으로 만들어진 물건(객체)인가요?
			System.out.println("난 책이야");

			int i = (int) 3.14;

			// 오리지널 원래 타입으로 만들려면 반드시 명시적 형변환이 필요하다.
			Book mybook = (Book) obj;// 강등 , obj를 담을 새로운 객체 생성
			// 서브 수퍼

			System.out.println("책이름 : " + mybook.getName());
			System.out.println("단가 : " + mybook.getPrice());

		} else if (obj instanceof Sawon) {
			System.out.println("난 사원이야");

			Sawon mysawon = (Sawon) obj;// 강등

			System.out.println("사원 이름 : " + mysawon.getName());
			System.out.println("부서명 : " + mysawon.getDepartment());

		} else {
			System.out.println("다른 것이야");
		}

	}
}

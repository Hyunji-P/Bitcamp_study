package pkg1013;

public class RefTest {

	public static void main(String[] args) {
		Mysuper obj1 = new Mysub();// 승급
		System.out.println(obj1.a);

		// 일시적 접근이 불가능
//		System.out.println(obj1.b);

		Mysub sub = (Mysub) obj1; // 강등
		System.out.println(sub.a);
		System.out.println(sub.b);

		obj1.haha();
		// obj1 태생 → Mysub 이므로 Mysuper로 부터
		// 상속받고 있어서 메소드에 접근할 수 있다
		sub.hoho();
		// sub. → haha 보임 : 상속받기 때문에
		//      → hoho 보임 : 자기자신이기 때문에
		
		obj1.Display();
		//부모자식이 오버라이딩이 되어있으면 자식 메소드 호출
		//멀리 있는 메소드 말고 가까운 자식메소드 호출
	}

}

package pkg1016;

//메인 클래스
public class EnumTest {

	public static void main(String[] args) {
		Shoes shoe1 = new Shoes("나이키", 235, ShoesType.RUNNING);
		shoe1.Display();

		System.out.println("======================");
		int[] arr = { 10, 20 };
		for (int item : arr) {
			System.out.println(item);
		}
		System.out.println("======================");
		// values() 메소드 : enum 요소들의 목록을 반환해주는 메소드
		// static 메소드 이기 때문에 클래스 이름으로 접근이 가능함
		// 반환타입 ShoesType[]
		// 메소드 정의 : 반환타입 메소드 이름 클래스이름.메소드
		ShoesType[] mylist = ShoesType.values();
		for (ShoesType item : mylist) {
			System.out.println(item);
			System.out.println(item.ordinal());
		}
	}

}

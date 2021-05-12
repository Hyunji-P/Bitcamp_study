package pkg0925;

public class ArrayEx01 {
	// 배열
	public static void main(String[] args) {
		// 좋아하는 보이/ 걸 그룹의 멤버들을 대입하고 출력하는 프로그램 작성
		
		//new 연산자
		String[] bts = new String[3];

		bts[0] = "정국";
		bts[1] = "지민";
		bts[2] = "뷔";

		for (int i = 0; i < bts.length; i++) {
			System.out.println(bts[i]);
		}
		
		//초기화 기법
		String[] bts2 = { "정국", "지민", "뷔" };

		for (int i = 0; i < bts2.length; i++) {
			System.out.println(bts2[i]);
		}

	}

}

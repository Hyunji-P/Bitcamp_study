package pkg1007;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// 주사위 5번 던지기 , Random 클래스
		// rand 객체 : 랜덤한 수를 추출할 수 있다.
		Random rand = new Random();

		int total = 0; // 메소드 안에 있는 변수 : 지역변수 (반드시 초기화)

		for (int i = 1; i <= 5; i++) {
			int su = rand.nextInt(6) + 1;
			System.out.println(su);
			total += su;

		}
		System.out.println("총합 : " + total);

	}

}

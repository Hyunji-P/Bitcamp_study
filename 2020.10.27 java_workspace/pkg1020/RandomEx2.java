package pkg1020;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		Random rand = new Random();

		// 진위형 배열 5개를 선언하고 , 참또는 거짓을 셋팅한다.
		boolean[] bool = new boolean[5];
		for (int i = 0; i < bool.length; i++) {
			bool[i] = rand.nextBoolean();
			System.out.print(bool[i] + "\t");
		}
		System.out.println();

		boolean res = rand.nextBoolean();
		System.out.println(res);

		// 0.0 이상 ~ 1.0 미만의 실수 값을 반환한다.
		double dbl = rand.nextDouble();
		System.out.println(dbl);

		// nextInt(n) : 0부터 (n-1)까지의 임의의 정수 1개를 추출한다.
		// 1부터 5까지의 정수 1개 추출
		int jungsu = rand.nextInt(6) + 1;
		System.out.println(jungsu);
		System.out.println();

		// 문제) 주사위를 3번 던져서 나오는 총합을 구하는 프로그램 작성하세요.
		int[] jusawee = new int[3];
		int total = 0;

		System.out.println("주사위 " + jusawee.length + "번 던지기");
		for (int i = 0; i < jusawee.length; i++) {
			// 7까지로 적으면 0부터 6까지로 나옴
			// 0이 포함되면 안되니까 주사위같은경우 6으로 적고 + 1 해야함
			jusawee[i] = rand.nextInt(6) + 1;
			if (i == jusawee.length - 1) {
				System.out.print(jusawee[i]);
			} else {
				System.out.print(jusawee[i] + " + ");
			}

			total += jusawee[i];
		}
		System.out.println(" =  " + total);
		
		//랜덤 값 시드 배정하기
		//시드 값 : 랜덤 메소드에 넣어 주는 임의의 정수를 의미한다.
		//시드 값을 넣어주는 행위를 시드 배정이라고 한다.(랜덤 값 고정하고 싶을때)
		//일반적으로 시드 배정을 하지 않지만 , 항상 동일한 패턴으로 랜덤 값을 처리하려면 시드배정을
		//해줘야한다(ex, 머신러닝에서 동일한 값으로 테스트를 하고 싶을때)
		//다음은 1234에 대한 시드 배정 랜덤 값을 보여 준다.
		System.out.println("시드 배정 예시");
		long seed = 1234;
		Random rand2 = new Random(seed);
		for (int i = 0; i < 10; i++) {
			int rnd = rand2.nextInt(6) + 1;
			System.out.println(rnd);
		}
		
		
	}

}

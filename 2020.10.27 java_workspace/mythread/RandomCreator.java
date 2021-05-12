package mythread;

import java.util.Random;

public class RandomCreator extends Thread {

	// 시간이 오래걸리 는 것을 run() 메소드에 코딩
	@Override
	public void run() {
		// 1초에 한번씩 랜덤 값 출력하기
		Random rand = new Random();

		try {
			int total = 0;
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				int rnd = rand.nextInt(6) + 1;
				System.out.println((i + 1) + "번째 주사위 눈 : " + rnd);
				total += rnd;
			}
			System.out.println("총합 : " + total);
//			int i = 0;
//			while (true) {
//				i += 1;
//				System.out.println("랜덤 쓰레드 : " + i);
//				Thread.sleep(1000);
//			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

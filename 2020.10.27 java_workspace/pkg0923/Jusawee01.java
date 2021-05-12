package pkg0923;

public class Jusawee01 {

	public static void main(String[] args) {
		// 주사위의 눈이 1또는 4이면 100
		// 주사위의 눈이 2또는 5이면 200
		// 주사위의 눈이 3또는 6이면 300

		int point = 3;
		int su = 0;

		
		if (point == 1 || point == 4) {
			su = 100;
		} else if (point == 2 || point == 5) {
			su = 200;
		} else if (point == 3 || point == 6) {
			su = 300;
		}

//		if (point % 3 == 1) {
//			su = 100;
//		} else if (point % 3 == 2) {
//			su = 200;
//		} else if (point % 3 == 0) {
//			su = 300;
//		}

		System.out.println("결과 : " + su);
	}
}
